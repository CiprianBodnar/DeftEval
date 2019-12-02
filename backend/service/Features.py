from SentenceTokenise import SentenceTokenise

"""This service has the scope to tell if a sentence is or not a definition. Each feature implementation should return 
true or false and final function is_definition will return the 'and' from all function """

sentences = SentenceTokenise()
true_points = 0
false_points = 0


def feature1():
    # TODO
    pass


def feature2():
    # TODO
    pass


def get_middle_sentence(sent: str):
    sent_len = len(sent)
    return sent_len / 3, sent_len - sent_len / 3


def contain_punctuation(sent, punctuation):
    global true_points, false_points
    halfs = get_middle_sentence(sent)
    if punctuation in sent and halfs[0] <= sent.find(punctuation) <= halfs[1]:
        true_points = true_points + 1
        return True
    false_points = false_points + 1
    return False


def contain_definitors(sent):
    global true_points, false_points
    definitors = ['is', 'define', 'defined', 'are', 'of']
    if any(d in sentences.WordTokenize(sent) for d in definitors):
        true_points = true_points + 1
        return True
    else:
        false_points = false_points + 1
        return False


def is_definition(sent):
    global true_points, false_points
    false_points = 0
    true_points = 0
    contain_definitors(sent)
    contain_punctuation(sent, '-')
    contain_punctuation(sent, ':')
    print(true_points)
    print(false_points)
    if true_points > false_points:
        return True
    return False
