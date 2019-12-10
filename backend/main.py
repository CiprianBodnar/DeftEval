from backend.model.Corpus import Corpus
from backend.model.DefinitionMarker import DefinitionMarker
from backend.model.SentenceTokenise import SentenceTokenise
from backend.model.TaggedDefinition import TaggedDefinition

if __name__ == "__main__":
    corpus = Corpus()
    sentences = SentenceTokenise()
    definition_marker = DefinitionMarker()
    taggedDefinition = TaggedDefinition()


    corp_received_text = corpus.getInputText()

    sentences = corpus.getSentences(corp_received_text)

    definition_marker.input_file = corpus.input_file

    print("\n########### Este definitie?:")
    definition_marker.containDefinitions(sentences)
