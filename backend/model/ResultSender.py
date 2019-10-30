import abc

import FrequencyComputer


class ResultSender:
    def __init__(self):
        pass

    resultText = FrequencyComputer.frequencies()

    @abc.abstractmethod
    def SendResult(self, resultDefinitions):
        pass
