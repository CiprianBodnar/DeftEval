import abc
from backend.service.ReadCorpus import read_corpus
from backend.model.SentenceTokenise import SentenceTokenise
from backend.service.ExtractSentences import extract_sentences

class Corpus:
    def __init__(self):
        self.receivedText = ""
        pass

    sentences = SentenceTokenise()
    @abc.abstractmethod

    def getInputText(self, text):
        # Corpusul curat
        Corpus.receivedText = read_corpus(text)

        return Corpus.receivedText

    def getSentences(self,text):
        # Lista de propozitii
        self.sentences.listOfSentence = extract_sentences(text)

        return self.sentences.listOfSentence

    def setInputText(self, text):
        pass