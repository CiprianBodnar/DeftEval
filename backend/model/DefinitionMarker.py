from backend.service.WriteInFormat import write_value
from backend.service.Features import is_definition
import io
base_output_folder = "../output"


class DefinitionMarker:
    def __init__(self):
        self.input_file = ""
        pass

    def containDefinitions(self, data):
        deft_file = self.input_file.replace(".txt", ".deft")
        out = io.open(deft_file, "w", encoding="utf8")
        for sent in data:
            if is_definition(sent):
                write_value(sent,"1", out)
            else:
                write_value(sent, "0", out)
        out.close()

    def MakeWekaFile(self, data):
        '''Generate a file for Weka'''
        out = open("weka_file.arff", "w")
        out.write("@relation isDefinition" + '\n' + '\n' + "@attribute sentence string" + '\n' + "@attribute marker numeric" + '\n' + '\n' + "@data" + '\n')
        for sent in data:
            if is_definition(sent):
                out.write(("'" + sent + "'" + " 1" + '\n').encode("utf-8"))
            else:
                out.write(("'" + sent + "'" + " 0" + '\n').encode("utf-8"))
        out.close()

    def tagSentence(self, sentence):
        pass

    def getTaggedDefinition(self, sentence):
        pass
