import abc

class Corpus:
    def __init__(self):
        self.receivedText = ""
        pass

    @abc.abstractmethod

    def getInputText(self, text):
        pass

    def setInputText(self, text):
        pass