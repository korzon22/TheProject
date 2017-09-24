#Here we've got 4 scenarios - first for placing the bet,
#second one for asserting the return offered, third one for asserting the odds.
#4th scenario makes sure that browser is closed after the test.
# Test report is available - check target/file directory - it's called index.html

Feature: Place the bet and assert the odds and returns offered

  Scenario: Open the WH's website, choose Premier League, place the bet, assert the odds and return offered

    Given I open the browser

    When I open the William Hill website

    Then I choose to search the website

    Then I enter the look-up text

    Then I select the Premier League

    Then I choose the first home team to win

    And I place the bet "0.05"

  Scenario: Asserting the return offered

    Then Return offered should be "2.1"

  Scenario: Asserting the odds

    Then Odds should be "2/1"

    Scenario: Closing the browser

      Then I close the browser