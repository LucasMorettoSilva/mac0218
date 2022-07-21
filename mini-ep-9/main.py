import unittest

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys


class SearchBarTest(unittest.TestCase):

    def setUp(self):
        self.driver = webdriver.Firefox()

    def test_search_in_duck_duck_go(self):
        driver = self.driver
        driver.get('https://duckduckgo.com')
        self.assertIn('DuckDuckGo', driver.title)

        search_form = driver.find_element(By.ID, 'search_form_input_homepage')
        search_form.send_keys('python')
        search_form.submit()

        self.assertNotIn('No results found', driver.page_source)

    def test_search_in_python_org(self):
        driver = self.driver
        driver.get('https://www.python.org')
        self.assertIn('Python', driver.title)

        elem = driver.find_element(By.NAME, 'q')
        elem.send_keys('pycon')
        elem.send_keys(Keys.RETURN)
        self.assertNotIn('No results found.', driver.page_source)

    def tearDown(self):
        self.driver.close()


if __name__ == '__main__':
    unittest.main()
