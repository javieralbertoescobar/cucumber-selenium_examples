@SmokeTest
Feature: Check that a color paints on any surface

  Scenario: Paint with a color
    Given I have a blue color
    When I paint with my color in a paper
    Then the paper is should be colored with blue