import abc

from backend.model.FrequencyComputer import FrequencyComputer


class ResultSender:
    def __init__(self):
        pass

    resultText = FrequencyComputer().frequencies( "My sentence")

    @abc.abstractmethod
    def SendResult(self, resultDefinitions):
        pass
