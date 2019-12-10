
from Features import is_definition

def checkPercent(file_read):
    with open(file_read, 'r') as ins:
        line_list = []
        for line in ins:
            line_list.append(line)

        sentences_list = []
        val_list = []
        for l in range(len(line_list)):
            sentences_list.append(line_list[l][0:-2])
            val_list.append(line_list[l][-2])

    print(val_list)
    trueCheck = 0
    falseCheck = 0

    for i in range(len(sentences_list)):
        print(is_definition(sentences_list[i]))
        if (is_definition(sentences_list[i]) == True) and (val_list[i] == '1'):
            trueCheck = trueCheck + 1
        elif (is_definition(sentences_list[i]) == False) and (val_list[i] == '0'):
            trueCheck = trueCheck + 1
        else:
            falseCheck = falseCheck + 1
    print("True check:", trueCheck)
    print("False check:", falseCheck)



checkPercent("../../data/deft_files/dev/t1_biology_0_404.verif")