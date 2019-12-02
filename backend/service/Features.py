from SentenceTokenise import SentenceTokenise

"""This service has the scope to tell if a sentence is or not a definition. Each feature implementation should return 
true or false and final function is_definition will return the 'and' from all function """

sentences = SentenceTokenise()


def feature1():
    # TODO
    pass


def feature2():
    # TODO
    pass


def contain_definitors(sent):
    definitors = ['is', 'define', 'defined', 'are', 'of']
    if any(d in sentences.WordTokenize(sent) for d in definitors):
        return True
    else:
        return False


def is_definition(sent):
    return contain_definitors(sent)
