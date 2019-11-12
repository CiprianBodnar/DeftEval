from backend.model.SentenceTokenise import SentenceTokenise
sentences = SentenceTokenise()

class DefinitionMarker:
    def __init__(self):
        pass

    def isDefinition(self, sent):

        definitors = ['is', 'define', 'defined', 'are', 'of']
        if any(d in sentences.WordTokenize(sent) for d in definitors):
            return True
        else:
            return False

    def containDefinitions(self,data):

        for sent in data:
            if self.isDefinition(sent):
                print("Este definitie:", sent.encode("utf-8"))
            else:
                print("NU este definitie:", sent.encode("utf-8"))

    def tagSentence(self, sentence):
        pass

    def getTaggedDefinition(self, sentence):
        pass