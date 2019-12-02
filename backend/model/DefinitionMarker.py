from backend.service.WriteInFormat import write_sentence_in_format
from backend.service.Features import is_definition
base_output_folder = "../output"


class DefinitionMarker:
    def __init__(self):
        self.input_file = ""
        pass

    def containDefinitions(self, data):
        deft_file = self.input_file.replace(".txt", ".deft")
        out = open(deft_file, "w", encoding="utf8")
        for sent in data:
            write_sentence_in_format(sent, self.input_file, out)
            if is_definition(sent):
                print("Este definitie:", sent.encode("utf-8"))
            else:
                print("NU este definitie:", sent.encode("utf-8"))
        out.close()

    def tagSentence(self, sentence):
        pass

    def getTaggedDefinition(self, sentence):
        pass
