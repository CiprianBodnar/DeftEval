from backend.model.Corpus import Corpus
import re


def read_corpus(file_path):
    corpus = Corpus()
    with open(file_path, encoding="utf8") as fr:
        line = fr.readline()
        while line:
            # print(line)
            if line.find('.', 0, 5) > 0:
                begin = line.find('.')
                line = line[begin + 1:]

            corpus.receivedText += line
            # print(line.strip())

            line = fr.readline()

    corpus.receivedText = " ".join(re.split("\s+", corpus.receivedText, flags=re.UNICODE))
    print(corpus.receivedText)
    fr.close()


# read_corpus("t1_biology_1_0.txt")
