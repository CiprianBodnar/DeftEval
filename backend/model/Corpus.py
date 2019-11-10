import abc


class Corpus:
    def __init__(self):
        self.receive_text = ""
        self.input_file = input()
        self.base_train_folder = "../data/source_txt/train/"
        pass

    @abc.abstractmethod
    def getInputText(self, text):
        pass

    def setInputText(self, text):
        pass
