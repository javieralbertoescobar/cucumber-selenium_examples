Feature: Check that the title web page contains cheese

  Scenario: search cheese on google
    Given I visit "https://www.google.com/" web page
    When I enter "cheese" in search
    Then the page title should start with "cheese"


