import unittest

from backend.model.DefinitionMarker import DefinitionMarker
from backend.service.Features import *

trueSent = "Humans is animal"
failSent = "Today will be fun"


class TestStringMethods(unittest.TestCase):

    def setUp(self):
        self.definition_marker = DefinitionMarker()
        pass

    def test_should_fail_on_comma(self):
        sent = "Nu contine comma"
        result = contain_punctuation(sent, ",")
        self.assertEqual(result, False)

    def test_should_pass_on_comma(self):
        sent = "This test, contain a comma"
        result = contain_punctuation(sent, ",")
        self.assertEqual(result, True)

    def test_should_fail_on_hyper(self):
        sent = "Nu contine comma"
        result = contain_punctuation(sent, "-")
        self.assertEqual(result, False)

    def test_should_pass_on_hyper(self):
        sent = "This test a pseudo-hype contain a comma"
        result = contain_punctuation(sent, "-")
        self.assertEqual(result, True)

    def test_contain_location(self):
        sent = "London is a city"
        result = contain_chunk_location(sent)
        self.assertEqual(result, True)

    def test_not_contain_location(self):
        sent = "Today is good for sky"
        result = contain_chunk_location(sent)
        self.assertEqual(result, False)

    def test_contain_is_A(self):
        sent = "The eye is a organ"
        result = contain_isA(sent)
        self.assertEqual(result, True)

    def test_not_contain_is_A(self):
        sent = "The weather should be good"
        result = contain_isA(sent)
        self.assertEqual(result, False)

    def test_contain_chunk_person(self):
        sent = "Lincoln was a president"
        result = contain_chunk_person(sent)
        self.assertEqual(result, True)

    def test_not_contain_chunk_person(self):
        sent = "America had 11 presidents"
        result = contain_chunk_person(sent)
        self.assertEqual(result, False)

    def test_contain_posesiv_pronon(self):
        sent = 'This is a sentence and we agreed with this.'
        result = contain_possesive_pronoun(sent)
        self.assertEqual(result, True)
    def test_not_contain_posesiv_pronon(self):
        sent = "This sentence not contain pos pronon"
        result = contain_possesive_pronoun(sent)
        self.assertEqual(result, False)

    def test_contain_definitiors(self):
        sent = "This sentence define a definitor"
        result = contain_definitors(sent)
        self.assertEqual(result, True)

    def test_not_contain_definitors(self):
        sent = "This sentence has no definitors"
        result = contain_definitors(sent)
        self.assertEqual(result, False)

if __name__ == '__main__':
    unittest.main()
