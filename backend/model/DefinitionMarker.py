from backend.model.SentenceTokenise import SentenceTokenise
sentences = SentenceTokenise()

class DefinitionMarker:
    def __init__(self):
        pass

    def isDefinition(self, s):

        definitors = ['is', 'define', 'defined', 'are', 'of']

        for sent in s:
            if any(d in sentences.WordTokenize(sent) for d in definitors):
                print("Este definitie:", sent.encode("utf-8"))
            else:
                print("NU este definitie:", sent.encode("utf-8"))

    def tagSentence(self, sentence):
        pass

    def getTaggedDefinition(self, sentence):
        pass