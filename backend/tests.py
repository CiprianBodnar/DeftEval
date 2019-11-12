import unittest

from backend.model.DefinitionMarker import DefinitionMarker

trueSent = "Humans is animal"
failSent = "Today will be fun"


class TestStringMethods(unittest.TestCase):

    def setUp(self):
        self.definition_marker = DefinitionMarker()
        pass

    def test_about_definition_should_pass(self):
        result = self.definition_marker.isDefinition(trueSent)
        self.assertEqual(result, True)

    def test_about_definition_should_fail(self):
        result = self.definition_marker.isDefinition(failSent)
        self.assertEqual(result, False)


if __name__ == '__main__':
    unittest.main()
