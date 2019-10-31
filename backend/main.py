from backend.service.readCorpus import read_corpus
from backend.service.ExtractSentences import extract_sentences
from backend.model.Corpus import Corpus
from backend.model.SentenceTokenise import SentenceTokenise


if __name__ == "__main__":

    corpus = Corpus()
    sentences = SentenceTokenise()

    print("########## Corpusul curat:" )
    corpus.receivedText = read_corpus("../data/source_txt/train/t1_biology_1_0.txt")
    print(corpus.receivedText)

    print("\n########### Lista de propozitii:")
    sentences.listOfSentence = extract_sentences(corpus.receivedText)
    print(sentences.listOfSentence)

    print("\n########### Lista de propozitii - cate o prop:")
    for sent in sentences.listOfSentence:
        print(sent)
