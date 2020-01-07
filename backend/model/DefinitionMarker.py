from backend.service.WriteInFormat import write_value,tokenize
from backend.service.Features import *
import io
from nltk.corpus import stopwords
from nltk.corpus import wordnet as wn

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

    def remove_punctution(self,sent):
        '''remove punctuation from sentemce'''
        punctuations = '''!()-[]{};:'"\,<>./?@#$%^&*_~'''
        no_punct = ""
        for char in sent:
            if char not in punctuations:
                no_punct = no_punct + char
        return no_punct

    def extract_subject(self,sent):
        '''extract subject from sentece'''
        sent = self.remove_punctution(sent)
        list = sent.split()
        tag = pos_tag(list)
        for i in range(len(tag)):
            if "NN" in tag[i][1]:
                return (list[i])
        print(list[0])
        return list[0]

    def extract_verb(self,sent):
        '''extract verb from sentece'''
        sent = self.remove_punctution(sent)
        list = sent.split()
        tag = pos_tag(list)
        for i in range(len(tag)):
            if "VB" in tag[i][1]:
                return list[i].encode("utf-8")
        return " "

    def hypernym_word(self, word):
        '''returns the hypernym of a word'''
        syn = wn.synsets(word)
        if syn is not None:
            if syn[0].hypernyms()[0] is not None:
                hyp = syn[0].hypernyms()[0]
                hyp = str(hyp)
            else: hyp = str(syn[0])
            hyp = hyp.split('Synset(')[1].split(')')[0]
            return hyp
        return str(syn)

    def MakeWekaFile(self, data):
        '''Generate a file for Weka'''
        out = open("weka_file.arff", "w")
        out.write("@relation isDefinition" + '\n' + '\n' + "@attribute verb string" + '\n' + "@attribute contain_definitors numeric"  + '\n' + "@attribute contain_punctuation_- numeric" +  '\n' + "@attribute contain_punctuation_: numeric" '\n' + "@attribute contain_articulated_noun numeric" '\n' + "@attribute contain_isA numeric" '\n' + "@attribute contain_toBe numeric" '\n' + "@attribute contain_toBe_called numeric" '\n' + "@attribute check_present_tence numeric" '\n' + "@attribute contain_chunk_location numeric" '\n' + "@attribute contain_chunk_person numeric" '\n' + "@attribute contain_chunk_organization numeric" '\n' +  "@attribute number_of_words_sentence" '\n' + '\n' + "@data" + '\n')
        for sent in data:
            out.write(self.extract_verb(sent) + " " + str(int(is_definition(sent) == True)) + ", " + str(int(contain_definitors(sent) == True)) + ", " + str(int(contain_punctuation(sent, '-') == True)) + ", " + str(int(contain_punctuation(sent, ':') == True)) + ", " + str(int(contain_articulated_noun(sent)== True)) + ", " + str(int(contain_isA(sent) == True)) + ", " + str(int(contain_toBe(sent) == True)) + ", " + str(int(contain_toBe_called(sent) == True)) + ", " + str(int(check_present_tence(sent) == True)) + ", " + str(int(contain_chunk_location(sent) == True)) + ", " + str(int(contain_chunk_person(sent) == True)) + ", " + str(int(contain_chunk_organization(sent) == True)) + ", " + str(int(number_of_words_sentence(sent, 3) == True))  + '\n')
        out.close()

    def tagSentence(self, sentence):
        pass

    def getTaggedDefinition(self, sentence):
        pass
