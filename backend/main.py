from backend.model.Corpus import Corpus
from backend.model.DefinitionMarker import *

import nltk.classify.util
from nltk.classify import NaiveBayesClassifier
from nltk.corpus import names

if __name__ == "__main__":

    corpus = Corpus()
    definition = DefinitionMarker()

    print("\n########### Corpusul curat")
    corp = corpus.getInputText("../data/source_txt/train/t1_biology_1_0.txt")
    print (corp)

    print("\n########### Lista de propozitii:")
    sentences = corpus.getSentences(corp)
    print (sentences)

    print("\n########### Este definitie?:")
    definition.isDefinition(sentences)