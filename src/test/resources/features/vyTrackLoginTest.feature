Feature: Vytrack application login test

  @wip
  Scenario: happy login test
    Given user is on login page
    When user enters "user1" and "UserUser123" as credentials
     Then user is on the dashboard page