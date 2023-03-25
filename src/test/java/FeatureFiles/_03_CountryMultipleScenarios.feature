Feature: Country Multi Scenario

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to country page

    Scenario: Create country
      When create a country
      Then Success message should be displayed

      Scenario: Create country 2
        When create a country name as "hysd1" code as "hy3454"
        Then Success message should be displayed