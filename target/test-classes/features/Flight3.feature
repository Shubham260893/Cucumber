@SearchFlight
Feature: Search Flight in Make My Trip

  Scenario: Search Flight from NewDelhi to Lucknow
    Given I select "Round Trip" in from journey
    When I select "Lucknow" in To journey
    And I select departure date
    And I select return date
    Then I click on search

