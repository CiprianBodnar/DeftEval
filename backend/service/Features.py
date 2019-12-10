import nltk
from nltk import pos_tag, ne_chunk
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

def get_middle_sentence(sent):
    '''function that returns the middle of the sentence'''
    sent_len = len(sent)
    return sent_len / 3, sent_len - sent_len / 3


def contain_punctuation(sent, punctuation):
    '''check if the middle of the sentence has punctuation mark(such as s hyphen or colon'''
    global true_points, false_points
    halfs = get_middle_sentence(sent)
    if punctuation in sent and halfs[0] <= sent.find(punctuation) <= halfs[1]:
        true_points = true_points + 1
        return True
    false_points = false_points + 1
    return False


def contain_definitors(sent):
    '''check if a sentence contain specified definitors of a definition '''
    global true_points, false_points
    definitors = ['is', 'define', 'defined', 'are', 'of']
    if any(d in sentences.WordTokenize(sent) for d in definitors):
        true_points = true_points + 1
        return True
    else:
        false_points = false_points + 1
        return False


def contain_isA(sent):
    '''check if a sentence contain specified definitor "is a"'''
    global true_points, false_points
    for i in range(len(sentences.WordTokenize(sent))):
        if sentences.WordTokenize(sent)[i] == "is" and sentences.WordTokenize(sent)[i + 1] == "a":
            true_points = true_points + 1
            return True
    false_points = false_points + 1
    return False


def contain_articulated_noun(sent):
    '''check if a sentence contain an articulated noun(DET+NN)'''
    global true_points, false_points
    list = sentences.WordTokenize(sent)
    for i in range(len(nltk.pos_tag(sentences.WordTokenize(sent)))):
        if nltk.pos_tag(list)[i][1] == "DT" and nltk.pos_tag(list)[i+1][1] == "NN":
            true_points = true_points + 1
            return True
    false_points = false_points + 1
    return False


def contain_toBe(sent):
    '''check if a sentence contains the verb "to be"'''
    global true_points, false_points
    ok = 0
    for w in sentences.WordTokenize(sent):
        if WordNetLemmatizer().lemmatize(w, 'v') == "be":
            true_points = true_points + 1
            return True
    false_points = false_points + 1
    return False


def contain_toBe_called(sent):
    global true_points, false_points
    for i in range(len(sentences.WordTokenize(sent))):
        if WordNetLemmatizer().lemmatize(sentences.WordTokenize(sent)[i], 'v') == "be" and sentences.WordTokenize(sent)[i + 1] in ("called","named"):
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
    else:
        false_points = false_points + 1
    return False

def contain_chunk_location(sent):
    '''The sentence has a chunk marked as a location'''
    global true_points, false_points
    mark = str(ne_chunk(sentences.sentence_tagging(sent)))
    if "GPE " in mark:
        true_points = true_points + 1
        return True
    false_points = false_points + 1
    return False

def contain_chunk_person(sent):
    '''The sentence has a chunk marked as a person'''
    global true_points, false_points
    mark = str(ne_chunk(sentences.sentence_tagging(sent)))
    if "PERSON " in mark:
        true_points = true_points + 1
        return True
    false_points = false_points + 1
    return False

def contain_chunk_organization(sent):
    '''The sentence has a chunk marked as an organisation'''
    global true_points, false_points
    mark = str(ne_chunk(sentences.sentence_tagging(sent)))
    if "ORGANISATION " in mark:
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
    contain_isA(sent)
    contain_toBe(sent)
    contain_toBe_called(sent)
    check_present_tence(sent)
    contain_chunk_location(sent)
    contain_chunk_person(sent)
    contain_chunk_organization(sent)
    # print(true_points)
    # print(false_points)
    if true_points >= false_points:
        return True
    return False