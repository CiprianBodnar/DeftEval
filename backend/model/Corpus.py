import abc


class Corpus:
    def __init__(self):
        pass

    receivedText=""
    @abc.abstractmethod

    def getInputText(self, text):
        pass

    def setInputText(self, text):
        pass