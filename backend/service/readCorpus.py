import re


def read_corpus(file_path):
    received_text = ''
    with open(file_path, encoding="utf8") as fr:
        line = fr.readline()
        while line:
            # print(line)
            if line.find('.', 0, 5) > 0:
                begin = line.find('.')
                line = line[begin + 1:]

            received_text += line
            line = fr.readline()

    received_text = " ".join(re.split("\s+",received_text, flags=re.UNICODE))
    fr.close()
    return received_text


# read_corpus("../../data/source_txt/train/t1_biology_1_0.txt")
