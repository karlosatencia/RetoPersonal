Feature: Create meeting in Demo Serenity

  @CreateMeeting
  Scenario: Create a new business unit and schedule a meeting
    Given the user enters the Demo Serenity website
    And logs in with valid credentials
      | username    | password   |
      | <username>  | <password> |
    When the user creates a new business unit
      | unitname   |
      | <unitname> |
    And schedules a new meeting
      | meetingname   | meetingnumber |
      | Practica Auto | ABC-01        |
    Then the system should confirm that the meeting is created successfully

    Examples:
      | username | password | unitname | meetingname | meetingnumber |
      | admin    | serenity | Unit Test| Reto Auto   | AB-01         |
