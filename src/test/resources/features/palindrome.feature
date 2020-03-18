@SmokeTest
Feature: Determine if String is Palindrome or not. A string is a palindrome if it reads
  the same backwards as forwards.

  Scenario Outline: Valid Palindrome
    Given I entered string "<toTest>"
    When I test it for Palindrome
    Then the result should be "<result>"
    Examples:
      | toTest | result |
      | refer  | true   |