@Regression @Web @Password @PP3
Feature: As an existing customer I should be able to enter the password in the password screen

  Scenario Outline: Existing Customer lands on the Homepage as logged in user
    Given the user is on the Password screen with email: "startdrift@gmail.com"
    When the user enters a valid password: "<password>"
    And the user clicks on the button: "Sign In"
    Then the user lands on the Homepage as logged in user: "<user>"
    Examples:
      | password | user               |
      | test123  | stanislav kuleshov |

  Scenario Outline: User is able to return to the Email screen
    Given the user is on the Password screen with email: "<email>"
    When the user clicks on the link: "Not You?"
    Then the user lands on the Email screen
    Examples:
      | email                |
      | startdrift@gmail.com |

  #Scenario Outline: Existing Customer cannot log in with an invalid password
  #  Given the user is on the Password screen with email: "nann40547@gmail.com"
  #  When the user enters an invalid password: "<password>"
  #  And the user clicks on the button: "Sign In"
  #  Then the user should see the validation error message: "<errorMsg>"
  #  Examples:
  #    | password       | errorMsg                                                           |
  #    | test           | Invalid email or password: please check your details and try again |
  #    | 123test        | Invalid email or password: please check your details and try again |
  #    | a_B%%%%%%%%as  | Invalid email or password: please check your details and try again |
  #    | a.a@abc@abc@ab | Invalid email or password: please check your details and try again |

  #Scenario Outline: Existing Customer cannot log in without a password
  #  Given the user is on the Password screen with email: "nann40547@gmail.com"
  #  When the user enters blank: "<password>"
  #  And the user clicks on the button: "Sign In"
  #  Then the user should see the required validation message: "<errorMsg>"
  #  Examples:
  #    | password | errorMsg |
  #    |          | Required |