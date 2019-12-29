from nltk.tokenize import sent_tokenize, word_tokenize
import nltk


class SentenceTokenise:
    def __init__(self):
        self.listOfSentence = ""
        pass

    def tokenizeCorpus(self, listOfSentence):
        pass

    def getSentence(self, listOfSentence):
        '''Data can be split into sentences'''
        return sent_tokenize(listOfSentence)

    def WordTokenize(self, sentence):
        '''A sentence or data can be split into words'''
        return word_tokenize(sentence)

    def sentence_tagging(self, sentence):
        '''Given a sentence or paragraph, it can label words such as verbs, nouns and so on'''
        return nltk.pos_tag(self.WordTokenize(sentence))
