import logging
import re
import io

def before(fn):
    logging.getLogger().setLevel(logging.INFO)

    def wrapped(*args, **kws):
        logging.info("Clean corpus read it:")
        return fn(*args, **kws)

    return wrapped


def after(fn):
    logging.getLogger().setLevel(logging.INFO)

    def wrapped(*args, **kws):
        retVal = fn(*args, **kws)
        logging.info()
        return retVal

    return wrapped


def read_from_train_file():
    my_train_file = input()
    return my_train_file


def concat_file_name(base_train_folder, file_name):
    return base_train_folder + file_name

@before
def read_corpus(base_folder, input_file):
    received_text = ''
    try:
        with io.open(concat_file_name(base_folder, input_file), encoding="utf8") as fr:
            line = fr.readline()
            while line:

                if line.find('.', 0, 5) > 0:
                    begin = line.find('.')
                    line = line[begin + 1:]

                received_text += line
                line = fr.readline()
    except (OSError, IOError) as e:
        print("Could not open the log file: %s" % e)

    received_text = " ".join(re.split("\s+", received_text, flags=re.UNICODE))

    return received_text

# read_corpus("../../data/source_txt/train/t1_biology_1_0.txt")
