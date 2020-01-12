from backend.service.WriteInFormat import write_value,tokenize
from backend.service.Features import *
import io
from nltk.corpus import stopwords
from nltk.corpus import wordnet as wn
from nltk.stem.wordnet import WordNetLemmatizer
# -*- coding: utf-8 -*-
import os,re
stop_words=set(stopwords.words("english"))
base_output_folder = "../output"


class DefinitionMarker:
    def __init__(self):
        self.input_file = ""
        pass

    def containDefinitions(self, data):
        deft_file = self.input_file.replace(".txt", ".deft")
        out = io.open(deft_file, "w", encoding="utf8")
        for sent in data:
            if is_definition(sent):
                write_value(sent,"1", out)
            else:
                write_value(sent, "0", out)
        out.close()

    def listToString(self,s):
        str1 = " "
        return (str1.join(s))

    def filtered_sentence(self, sent):
        '''remove Stopwords(considered as noise in the text)'''
        filtered_sent = []
        tokenized_text = tokenize(sent)
        for w in tokenized_text:
            if w not in stop_words:
                filtered_sent.append(w)
        return self.listToString(filtered_sent)

    def remove_punctuation(self,sent):
        '''remove punctuation from sentemce'''
        punctuations = '''!()-[]{};:'"\,<>./?@#$%^&*_~'''
        no_punct = ""
        for char in sent:
            if char not in punctuations:
                no_punct = no_punct + char
        return no_punct

    def extract_subject(self,sent):
        '''extract subject from sentece'''
        sent = self.remove_punctuation(sent)
        list = sent.split()
        tag = pos_tag(list)
        for i in range(len(tag)):
            if "NN" in tag[i][1]:
                return WordNetLemmatizer().lemmatize(list[i].lower(), 'n').encode('utf-8')
        return "unknow"

    def extract_verb(self,sent):
        '''extract verb from sentece'''
        sent = self.remove_punctuation(sent)
        list = sent.split()
        tag = pos_tag(list)
        for i in range(len(tag)):
            if "VB" in tag[i][1]:
                return WordNetLemmatizer().lemmatize(list[i].lower(), 'v').encode('utf-8')
        return "unknow"

    def hypernym_word(self, word):
        '''returns the hypernym of a word'''
        syn = wn.synsets(word.decode('utf-8').strip())
        if syn:
            if syn[0].hypernyms():
                hyp = syn[0].hypernyms()[0]
                hyp = str(hyp)
            else:
                hyp = str(syn[0])
            hyp = hyp.split("Synset('")[1].split(".")[0]
            return str(hyp)
        else:
            return word

    def MakeWekaFile(self, data):
        '''Generate a file for Weka'''
        #generate list_verbs
        for sent in data:
            if self.extract_verb(sent) not in (self.remove_punctuation(open("list_verbs.txt").read()).split()):
                out2 = open("list_verbs.txt", "a")
                if os.stat("list_verbs.txt").st_size == 0:
                    out2.write(self.extract_verb(sent))
                else:
                    out2.write(", " + self.extract_verb(sent))
                out2.close()

        #generate list_nouns
        for sent in data:
             if self.extract_subject(sent) not in (self.remove_punctuation(open("list_nouns.txt").read()).split()):
                out2 = open("list_nouns.txt", "a")
                if os.stat("list_nouns.txt").st_size == 0:
                    out2.write(self.extract_subject(sent))
                else:
                    out2.write(", " + self.extract_subject(sent))
                out2.close()

        #generate list hypernyms
        for sent in data:
            if self.remove_punctuation(self.hypernym_word(self.extract_subject(sent))) not in (self.remove_punctuation(open("list_hypernyms.txt").read()).split()):
                out2 = open("list_hypernyms.txt", "a")
                if os.stat("list_hypernyms.txt").st_size == 0:
                    out2.write(self.hypernym_word(self.extract_subject(sent)))
                else:
                    out2.write(", " + self.hypernym_word(self.extract_subject(sent)))
                out2.close()

        out = open("weka_file.arff", "w")
        out.write("@relation isDefinition" + '\n' + '\n' + "@attribute Predicate-verb {" + open("list_verbs.txt", "r").read() + "}" + '\n' + "@attribute Subject-noun {" + open("list_nouns.txt", "r").read() + "}" + '\n' + "@attribute Subject-hypernym {" + open("list_hypernyms.txt", "r").read() + "}" + '\n'+ "@attribute contain_definitors {0,1}"  + '\n' + "@attribute contain_punctuation_- {0,1}" +  '\n' + "@attribute contain_punctuation_: {0,1}" '\n' + "@attribute contain_articulated_noun {0,1}" '\n' + "@attribute contain_isA {0,1}" '\n' + "@attribute contain_toBe {0,1}" '\n' + "@attribute contain_toBe_called {0,1}" '\n' + "@attribute check_present_tence {0,1}" '\n' + "@attribute contain_chunk_location {0,1}" '\n' + "@attribute contain_chunk_person {0,1}" '\n' + "@attribute contain_chunk_organization {0,1}" '\n' +  "@attribute min_words_in_sentence {0,1}" '\n' +  "@attribute class {No,Yes}" '\n' + '\n' + "@data" + '\n')
        for sent in data:
            out.write(self.extract_verb(sent) +  ", " + self.extract_subject(sent) +  ", " + self.hypernym_word(self.extract_subject(sent)) +", " + str(int(contain_definitors(sent) == True)) + ", " + str(int(contain_punctuation(sent, '-') == True)) + ", " + str(int(contain_punctuation(sent, ':') == True)) + ", " + str(int(contain_articulated_noun(sent)== True)) + ", " + str(int(contain_isA(sent) == True)) + ", " + str(int(contain_toBe(sent) == True)) + ", " + str(int(contain_toBe_called(sent) == True)) + ", " + str(int(check_present_tence(sent) == True)) + ", " + str(int(contain_chunk_location(sent) == True)) + ", " + str(int(contain_chunk_person(sent) == True)) + ", " + str(int(contain_chunk_organization(sent) == True)) + ", " + str(int(min_words_in_sentence(sent, 3) == True))  + ", " + ("Yes" if int(is_definition(sent) == True) else "No") + '\n')
        out.close()

    def tagSentence(self, sentence):
        pass

    def getTaggedDefinition(self, sentence):
        pass
