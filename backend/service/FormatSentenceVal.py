import re


def read_file(file_read, file_write):

    with open(file_read, 'r') as ins:
        array_row = []
        sentences = ''
        is_def = 0
        not_def = 0
        sentences_list = []

        for line in ins:
            if line == "\n":
                if is_def > not_def:
                    sentences = sentences + '1'
                else:
                    sentences = sentences + '0'

                if re.search("([a-z]+[0-9]*)", sentences):
                    sentences_list.append(sentences)

                sentences = ''
                is_def = 0
                not_def = 0

            else:
                array_row.append(line)
                first = array_row[-1].partition('	')[0]
                last = array_row[-1].partition("	 ")[-1]
                if last.endswith("0\n"):
                    not_def = not_def + 1
                else:
                    is_def = is_def + 1
                sentences = sentences + first + ' '

        file = open(file_write, "w")
        for sent in sentences_list:
            file.write(sent + '\n')

        return sentences_list


read_file("../../data/deft_files/dev/t1_biology_0_404.deft","../../data/deft_files/dev/t1_biology_0_404.verif")