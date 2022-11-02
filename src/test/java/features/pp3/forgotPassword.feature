@Chrome @ChangePassword
Feature: As user I should be able to change the password

  Scenario: User with full information in the profile can see the email and the phone number provided
    Given the user is in the Forgot Password screen with email: "startdrift@gmail.com"
    Then the user should see the email: "startdrift@gmail.com"
    And the user should see the phone number: "xxx-xxx-2917"

  Scenario: User without full information in the profile can see the email address provided
    Given the user is in the Forgot Password screen with email: "nann40547@gmail.com"
    Then the user should see the email: "nann40547@gmail.com"
    And the user should not see the phone number: "xxx-xxx-2917"

  Scenario: User is able to return to the Email screen
    Given the user is in the Forgot Password screen with email: "startdrift@gmail.com"
    When the user clicks on the link: "Return to Password Sign In"
    Then the user is on the Email screen

  Scenario: User with email information in the profile should see the "Code" screen
    Given the user is in the Forgot Password screen with email: "startdrift@gmail.com"
    And the Send Email radio button is selected
    When the user clicks on the Continue button
    Then the user lands on the We Sent You a Code screen
    And the user should see the email: "<email>"
    And the user should see the field: "Security Code"

  Scenario: User without full information email information in the profile should see the "Code" screen
    Given the user is in the Forgot Password screen with email: "startdrift@gmail.com"
    And the Send Email radio button is selected
    When the user clicks on the Continue button
    Then the user lands on the We Sent You a Code screen
    And the user should see the email: "<email>"
    And the user should see the field: "Security Code"


  Scenario Outline: User with phone information in the profile should see the "Code" screen
    Given the user is in the Forgot Password screen with email: "startdrift@gmail.com"
    And the Send SMS radio button is selected
    When the user clicks on the Continue button
    Then the user lands on the We Sent You a Code screen
    And the user should see the email: "<phoneNumber>"
    And the user should see the field: "Security Code"
    Examples:
      | phoneNumber  |
      | xxx-xxx-3966 |

  Scenario: User should be able to receive the verification code in the email
    Given the user is in the We Sent You a Code screen
    When the user retrieves the verification code from the email
    And the user enters the Security Code in the field
    And the user clicks on the Submit button
    Then the user lands on the Change Password screen

  Scenario: User should be able to receive the verification code in the phone
    Given the user is in the We Sent You a Code screen
    When the user retrieves the verification code from the phone
    And the user enters the Security Code in the field
    And the user clicks on the Submit button
    Then the user lands on the Change Password screen

  Scenario Outline: User with email should be able to click to the No code received link
    Given the user is in the We Sent You a Code screen with email: "startdrift@gmail.com"
    When the user clicks on the button: "No Code received?"
    Then the user lands on the Forgot Password screen
    And the user should see the email: "<email>"
    And the user should see the phone number: "<phoneNumber>"
    Examples:
      | phoneNumber   |
      | xxx-xxx-3966 |

  Scenario Outline: User with phone should be able to click to No code received link
    Given the user is in the We Sent You a Code screen with email: "startdrift@gmail.com"
    When  the user clicks on the button: "No Code received?"
    Then the user lands on the Forgot Password screen
    And the user should see the email: "<email>"
    And the user should see the phone number: "<phoneNumber>"
    Examples:
      | email                | phoneNumber  |
      | startdrift@gmail.com | xxx-xxx-3966 |

  Scenario Outline: User can login with the New password
    Given the user is on the Change Password Screen
    When the user enters the password: "<newPassword>"
    And the user clicks on the button: "Save Changes"
    And the user is on the Email screen
    And the user enters the email: "<email>"
    And the user clicks on the Continue button
    And the user enters the password: "<newPassword>"
    And the user clicks on the Sign in button
    Then the user lands on the Homepage as logged in user: "<user>"
    Examples:
      | email                | newPassword | user             |
      | startdrift@gmail.com | test123     | Stanislav Kuleshov |

  Scenario Outline: User cannot login with the Old password
    Given the user is on the Change Password Screen with email: "startdrift@gmail.com"
    When the user enters the password: "<newPassword>"
    And the user clicks on the Save Changes button
    And the user is on the Email screen
    And the user enters the email: "<email>"
    And the user clicks on the Continue button
    And the user enters the password: "<oldPassword>"
    And the user clicks on the Sign in button
    Then the user should see the validation error message: "<validationMessage>"
    Examples:
      | email                | oldPassword | validationMessage                                                  | newPassword |
      | startdrift@gmail.com | test123     | Invalid email or password: please check your details and try again | test1234    |
