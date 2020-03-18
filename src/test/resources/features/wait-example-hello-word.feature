Feature: Check that the title web page contains cheese

  Scenario: search cheese on google
    Given I open "http://localhost/html-files/wait-example-hello-world.html" web page
    When the page site is loaded
    Then the page should be display "Hello from JavaScript!"