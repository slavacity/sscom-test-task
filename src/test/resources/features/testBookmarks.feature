@sscom
Feature: Save advertisements to bookmarks memo

  Scenario: Search advertisements by category, save them to bookmarks and verify ads added to bookmarks
    Given opened main page by user
    When user opens Transport category
    And user opens search
    And user types Audi as a searchword
    And user selects Sell as a search type
    And user selects Price as a sort type
    Then user submits search
    And user opens advanced search
    And user sets search price range from 2000 to 10000
    Then user submits search
    And user chooses 3 random advertisements
    And user saves advertisements to bookmarks
    And user open bookmarks page
    Then previously saved ads expected to be shown in bookmarks
