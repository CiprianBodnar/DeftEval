import nltk.data


def extract_sentences(data):
    tokenizer = nltk.data.load('tokenizers/punkt/english.pickle')
    list_of_sentences = tokenizer.tokenize(data)

    return list_of_sentences
