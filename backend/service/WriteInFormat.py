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
        pass

def write_value(sentence, value, out):
    out.write(sentence+" "+value+"\n")


