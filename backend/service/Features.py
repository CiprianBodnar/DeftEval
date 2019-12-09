import nltk
from nltk import pos_tag
from nltk.stem.wordnet import WordNetLemmatizer
from SentenceTokenise import SentenceTokenise

"""This service has the scope to tell if a sentence is or not a definition. Each feature implementation should return 
true or false and final function is_definition will return the 'and' from all function """

sentences = SentenceTokenise()
true_points = 0
false_points = 0


def check_present_tence(sent):
    """check verbs are in present form"""
    global false_points, true_points
    tagged = pos_tag(sent)
    for word in tagged:
        if word[1].startswith('V'):
            if word[1] not in ["VBP", "VBZ", "VBG"]:
                false_points = false_points + 1
                return False
    true_points = true_points + 1
    return True


def feature2():
    # TODO
    pass

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


def contain_definitors(sent):
    global true_points, false_points
    definitors = ['is', 'define', 'defined', 'are', 'of']
    if any(d in sentences.WordTokenize(sent) for d in definitors):
        true_points = true_points + 1
        return True
    else:
        false_points = false_points + 1
        return False


def contain_ISA(sent):
    global true_points, false_points
    ok = 0
    for i in range(len(sentences.WordTokenize(sent))):
        if sentences.WordTokenize(sent)[i] == "is" and sentences.WordTokenize(sent)[i + 1] == "a":
            true_points = true_points + 1
            return True
    false_points = false_points + 1
    return False


def contain_articulated_noun(sent):
    global true_points, false_points
    ok = 0
    list = sentences.WordTokenize(sent)
    for i in range(len(nltk.pos_tag(sentences.WordTokenize(sent)))):
        if nltk.pos_tag(list)[i][1] == "DT" and nltk.pos_tag(list)[i+1][1] == "NN":
            true_points = true_points + 1
            return True
    false_points = false_points + 1
    return False

def contain_toBe(sent):
    global true_points, false_points
    ok = 0
    for w in sentences.WordTokenize(sent):
        if WordNetLemmatizer().lemmatize(w, 'v') == "be":
            true_points = true_points + 1
            return True
    false_points = false_points + 1
    return False

def is_definition(sent):
    global true_points, false_points
    false_points = 0
    true_points = 0
    contain_definitors(sent)
    contain_punctuation(sent, '-')
    contain_punctuation(sent, ':')
    contain_articulated_noun(sent)
    contain_ISA(sent)
    contain_toBe(sent)
    check_present_tence(sent)
    print(true_points)
    print(false_points)
    if true_points >= false_points:
        return True
    return False
