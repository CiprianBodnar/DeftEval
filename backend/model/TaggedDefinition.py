from backend.service.WriteInFormat import write_sentence_in_format

class TaggedDefinition:
    def __init__(self):
        pass

    def sentenceTagger(self, sentence, startTag, insideTag, outsideTag):
        """

        :param sentence:
        :param startTag:
        :param insideTag:
        :param outsideTag:
        """
        pass

    def write_in_formar(self, sentences, input_file):
        write_sentence_in_format(sentences, input_file)
