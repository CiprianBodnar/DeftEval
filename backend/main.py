from backend.service.ReadCorpus import read_corpus
from backend.service.ExtractSentences import extract_sentences
from backend.model.Corpus import Corpus
from backend.model.SentenceTokenise import SentenceTokenise
from backend.service.WriteInFormat import write_sentence_in_format
from backend.model.DefinitionMarker import DefinitionMarker

if __name__ == "__main__":

    corpus = Corpus()
    sentences = SentenceTokenise()
    definition_marker = DefinitionMarker()
    print("########## Corpusul curat:")
    corpus.receivedText = read_corpus(corpus.base_train_folder, corpus.input_file)

    print("\n########### Lista de propozitii:")
    sentences.listOfSentence = extract_sentences(corpus.receivedText)

    definition_marker.input_file = corpus.input_file

    print("\n########### Lista de propozitii - cate o prop:")

    write_sentence_in_format(sentences.listOfSentence, definition_marker.input_file)
