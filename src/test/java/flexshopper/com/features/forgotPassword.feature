Feature: As a user I should be able to change the password


  Scenario Outline: User with full information in the profile can see the email and the phone number provided
    Given the user is in the "Forgot Password" screen
    Then the user should see the text: "<firstText>"
    And the user should see the text: "<secondText>"
    And the user should see the text: "Send email to:"
    And the user should see the text: "Send SMS text with code to:"
    And the user should see the "Continue" button
    Examples:
      | firstText                                                                                                                                    | secondText                              |
      | How would you like to reset your password? You can verify by email or request a text to be sent to the mobile number linked to your account. | Please choose one of the options below: |

  Scenario Outline: User without full information in the profile can see the email address provided
    Given the user is in the "Forgot Password" screen
    Then the user should see the text: "<firstText>"
    And the user should see the text: "<secondText>"
    And the user should see the text: "Send email to:"
    And the user should not see the text: "Send SMS text with code to:"
    And the user should see the "Continue" button
    Examples:
      | firstText                                                                                                                                    | secondText                              |
      | How would you like to reset your password? You can verify by email or request a text to be sent to the mobile number linked to your account. | Please choose one of the options below: |

  # Verify Return to Password Sign In button functionality
  Scenario: User is able to return to the Email screen
    Given the user is in the "Forgot Password" screen
    When the user clicks on the link: "Return to Password Sign In"
    Then the user is in the "Email" screen

  # Assert code screen - Code sent to Email Address
  Scenario Outline: User with email information in the profile should see the "Code" screen
    Given the user is in the "Forgot Password" screen
    And the "Send Email" radio button is selected
    When the user clicks on the "Continue" button
    Then the user lands on the "We sent you a code" screen
    And the user should see the text: "<firstText>"
    And the user should see the text: "<secondText>"
    And the user should see the email: "<email>"
    Examples:
      | firstText           | secondText                         | email               |
      | We sent you a code  | Enter verification code we sent to | nann40547@gmail.com |

  # Assert code screen - Code sent to Phone Number
  Scenario Outline: User with phone information in the profile should see the "Code" screen
    Given the user is in the "Forgot Password" screen
    And the "Send SMS" radio button is selected
    When the user clicks on the "Continue" button
    Then the user lands on the "We sent you a code" screen
    And the user should see the text: "<firstText>"
    And the user should see the text: "<secondText>"
    And the user should see the email: "<phone>"
    Examples:
      | firstText           | secondText                         |   phone      |
      | We sent you a code  | Enter verification code we sent to | xxx-xxx-3966 |

  # Receive verification code in the email
  Scenario: User should be able to receive the verification code in the email
    Given the user is in the "We sent you a code" screen
    When the user retrieves the verification code from the "email"
    And the user enters the verification code in the field: "Security Code"
    And the user clicks on the "Submit" button
    Then the user lands on the "Change Password" screen

  # Receive verification code in the phone
  Scenario: User should be able to receive the verification code in the phone
    Given the user is in the "We sent you a code" screen
    When the user retrieves the verification code from the "phone"
    And the user enters the verification code in the field: "Security Code"
    And the user clicks on the "Submit" button
    Then the user lands on the "Change Password" screen

  # Verify No code received button functionality
  Scenario: User should be able to click to No code received link
    Given the user is in the "We sent you a code" screen
    When the user clicks on the link: "No Code received?"
    Then the user is in the "Forgot Password" screen

  # Verify user can change the password
  Scenario Outline: User should be able to change the password
    Given the user is in the "Change Password" screen
    When the user enters a new password: "<newpassword>"
    And the user clicks on the "Submit" button
    Then the user is able to change the password
    Examples:
      | newpassword |
      | test1234    |

  # Verify login with new password after password is reset (Positive)
  Scenario Outline: User can login with the new password
    Given the user has changed the password
    And the user is in the "Email" screen
    When the user enters a valid existing email address: "<email>"
    And the user clicks on the "CONTINUE" button
    And the user enters a valid password: "<newpassword>"
    And the user should see the "Dashboard" page
    Examples:
      |  email              | newpassword |
      | nann40547@gmail.com | test1234    |

  # Verify login with old password after password is reset (Negative)
  Scenario Outline: User cannot login with the old password
    Given the user has changed the password
    And the user is in the "Email" screen
    When the user enters a valid existing email address: "<email>"
    And the user clicks on the "CONTINUE" button
    And the user enters a valid password: "<oldpassword>"
    And the user clicks on the "Sign In" button
    Then the user should see the validation error message: "<validationmessage>"
    And the user should not see the "Dashboard" page
    Examples:
      |  email              | oldpassword | validationmessage                                                  |
      | nann40547@gmail.com | test123     | Invalid email or password: please check your details and try again |

  # Verify sms forgot password (may be available through google voice api)
