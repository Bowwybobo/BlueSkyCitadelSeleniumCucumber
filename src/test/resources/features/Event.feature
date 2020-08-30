Feature: BlueSky Events
  Scenario: Event
    Given I navigate to blueskycitadelform site
    When  I click on events
    And I enter a date in Events In
    And I enter a word in the search bar
    And I click on find events
    #Then I should see the events for the selected month
