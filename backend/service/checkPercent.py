from Features import is_definition

trueCheck = 0
falseCheck = 0
totalSent = 0


def checkPercent(file_read):
    global trueCheck, falseCheck, totalSent
    with open(file_read, 'r') as ins:
        line_list = []
        for line in ins:
            line_list.append(line)

        sentences_list = []
        val_list = []
        for l in range(len(line_list)):
            sentences_list.append(line_list[l][0:-2])
            val_list.append(line_list[l][-2])
    totalSent = totalSent + len(sentences_list)

    for i in range(len(sentences_list)):

        # Composing Method: Extract Variable
        is_def = (is_definition(sentences_list[i]) == True) and (val_list[i] == '1')
        is_not_def = (is_definition(sentences_list[i]) == False) and (val_list[i] == '0')

        if is_def:
            trueCheck = trueCheck + 1
        elif is_not_def:
            trueCheck = trueCheck + 1
        else:
            falseCheck = falseCheck + 1

    percent = trueCheck / totalSent * 100
    print("The percentage of correct answers:", percent, '%')


checkPercent("../../data/deft_files/dev/t1_biology_0_404.verif")
