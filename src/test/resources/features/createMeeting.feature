Feature: scheduling a meeting within the website

  Background:

  Scenario Outline: Create a new business unit and schedule a meeting
    Given the user enters the Demo Serenity website
    When logs in with valid credentials
      | username   | password   |
      | <username> | <password> |
    Examples:
      | username | password |
      | admin    | serenity |

  @CreateMeeting
  Scenario Outline: Meeting creationg
    When the user attempts to schedule a new meeting with
      | meetingName   | meetingNumber   |
      | <meetingName> | <meetingNumber> |
    Then the system should confirm that the meeting is created successfully
    Examples:
      | meetingName | meetingNumber |
      | Reto Auto   | AB-01         |