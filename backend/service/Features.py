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


def contain_ISA(sent):
    global true_points, false_points
    sequence = ['is a']
    if any(d in sentences.WordTokenize(sent) for d in sequence):
        true_points = true_points + 1
        return True
    else:
        false_points = false_points + 1
        return False

def get_middle_sentence(sent):
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

def contain_possesive_pronoun(sent):
    ''' The sentence contain possesive pronoun'''
    global true_points, false_points
    definitors = ['I', 'we', 'you', 'they', 'my', 'your', 'it']
    if any(d in sentences.WordTokenize(sent) for d in definitors):
        true_points = true_points + 1
        return True
    else:
        false_points = false_points + 1
        return False

def sentence_start_with_articulated_noun(sent):
    ''' The sentence starts with an articulated noun.("DT + NN") '''
    global true_points, false_points
    sent_tag = sentences.sentence_tagging(sent)
    print sent_tag
    if sent_tag[0][1] == "DT" and sent_tag[1][1] == "NN":
        true_points = true_points + 1
        return True
    else:
        false_points = false_points + 1
        return False

def sentence_start_with_singular_noun(sent):
    ''' The sentence starts with a singular noun'''
    global true_points, false_points
    sent_tag = sentences.sentence_tagging(sent)
    if sent_tag[0][1] == "NN":
        true_points = true_points + 1
        return True
    else:
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
    #contain_punctuation(sent, '-')
    #contain_punctuation(sent, ':')
    #contain_ISA(sent)
    sentence_start_with_articulated_noun(sent)
    sentence_start_with_singular_noun(sent)
    #contain_possesive_pronoun(sent)
    print("true_points", true_points)
    print("false_points", false_points)
    if true_points > false_points:
        return True
    return False