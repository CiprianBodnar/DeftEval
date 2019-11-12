from nltk.tokenize import SpaceTokenizer

tokenizer = SpaceTokenizer()
start_tag = 0


def write_sentence_in_format(sentence, input_file, out):
    list_of_words_from_sentence = tokenize(sentence)
    write(list_of_words_from_sentence, out, input_file)


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
            out.write("\t")
            out.write("NA")
            out.write("\t")
            out.write("NA")
            out.write("\t")
            out.write("NA")
            out.write("\t")
            out.write("NA")
            # TODO to complete here with rest of output model
            out.write("\n")
    out.write("\n")
