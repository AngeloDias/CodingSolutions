import unittest
from src.firstChapter.MyHashTable import stringHashFunctionSDBM

class MyTestCase(unittest.TestCase):
    def test_something(self):
        self.assertGreater(stringHashFunctionSDBM("hahahah"), 0)

if __name__ == '__main__':
    unittest.main()
