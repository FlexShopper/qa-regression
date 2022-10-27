
Feature: As an existing customer I should be able to enter the password in the password screen

  Scenario Outline: Existing Customer lands in Home Page as logged in user
    Given the user is in the Password screen
    When the user enters a valid password: "<password>"
    And the user clicks on the Sign In button
    Then the user lands in the Homepage as logged in user: "<user>"
    Examples:
      | password | user            |
      | test123  | Ashley Zzelkova |
  @password
  Scenario Outline: Existing Customer cannot log in with an invalid password
    Given the user is in the Password screen
    When the user enters an invalid password: "<password>"
    And the user clicks on the Sign In button
    Then the user should see the validation error message: "<errorMsg>"
    Examples:
      | password       | errorMsg                                                           |
      | test           | Invalid email or password: please check your details and try again |
      | 123test        | Invalid email or password: please check your details and try again |
      | a_B%%%%%%%%as  | Invalid email or password: please check your details and try again |
      | a.a@abc@abc@ab | Invalid email or password: please check your details and try again |

  Scenario Outline: Existing Customer cannot log in with an invalid password
    Given the user is in the Password screen
    When the user enters blank: "<password>"
    And the user clicks on the Sign In button
    Then the user should see the validation err message: "<errorMsg>"

    Examples:
      | password | errorMsg |
      |          | Required |