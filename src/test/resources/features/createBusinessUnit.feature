Feature: Create meeting in Demo Serenity

  Background:

  Scenario Outline: Create a new business unit and schedule a meeting
    Given the user enters the Demo Serenity website
    And logs in with valid credentials
      | username   | password   |
      | <username> | <password> |
    Examples:
      | username | password |
      | admin    | serenity |

  @CreateUnitBusinness
  Scenario:
    When the user creates a new business unit
    Then he will validate the business unit created

