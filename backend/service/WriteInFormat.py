from nltk.tokenize import SpaceTokenizer

base_output_folder = "../output"
tokenizer = SpaceTokenizer()
start_tag = 0


def write_sentence_in_format(sentences, input_file):
    deft_file = input_file.replace(".txt", ".deft")
    out = open(deft_file, "w", encoding="utf8")
    for sentence in sentences:
        list_of_words_from_sentence = tokenize(sentence)
        write(list_of_words_from_sentence, out, input_file)

    out.close()


def tokenize(sentence):
    return tokenizer.tokenize(sentence)


def write(list_of_words, out, input_file):
    global start_tag
    for line in list_of_words:
        # write line to output file
        if line != "":
            out.write(line)
            out.write("\t")
            out.write(input_file)
            out.write("\t")
            out.write(str(start_tag))
            out.write("\t")
            out.write(str(start_tag + len(line)))
            start_tag = start_tag + len(line) + 1
            #TODO to complete here with rest of output model
            out.write("\n")
