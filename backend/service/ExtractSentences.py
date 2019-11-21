import logging

import nltk.data


def before(fn):
    logging.getLogger().setLevel(logging.INFO)

    def wrapped(*args, **kws):
        logging.info("List of proposition si extracted")
        return fn(*args, **kws)

    return wrapped


def after(fn):
    logging.getLogger().setLevel(logging.INFO)

    def wrapped(*args, **kws):
        retVal = fn(*args, **kws)
        logging.info('just returned from function %s' % extract_sentences)
        return retVal

    return wrapped


@before
def extract_sentences(data):
    tokenizer = nltk.data.load('tokenizers/punkt/english.pickle')
    list_of_sentences = tokenizer.tokenize(data)

    return list_of_sentences
