
Feature: As user I should be able to change the password


  Scenario Outline: User with full information in the profile can see the email and the phone number provided
    Given the user is in the Forgot Password screen
    Then user should see firstText "<firstText>"
    And user should see secondText "<secondText>"
    And user should be able to see email "<email>"
    And user should be able to see text "<phoneNumber>"
    And user should be able to click "Continue" button
    Examples:
      |firstText                                                                                                                                    |secondText                             | email             | phoneNumber|
      | How would you like to reset your password? You can verify by email or request a text to be sent to the mobile number linked to your account.|Please choose one of the options below:|nann40547@gmail.com|xxx-xxx-3966|

  Scenario Outline: User without full information in the profile can see the email address provided
    Given user without Full Info is in the Forgot Password screen
    Then user should see firstText "<firstText>"
    And user should see secondText "<secondText>"
    And user should be able to see email "<email>"
    And user should be able to click "Continue" button
    Examples:
      | firstText                                                                                                                                    | secondText                              | email             |
      | How would you like to reset your password? You can verify by email or request a text to be sent to the mobile number linked to your account. | Please choose one of the options below: | abc_123@gmail.com |

 #verify Return to Password Sign In button functionality
  Scenario: User without full information is able to return to the Email screen
    Given user without Full Info is in the Forgot Password screen
    And user clicks on the link: "Return to Password Sign In"
    Then user should see Email screen

  #verify Return to Password Sign In button functionality
  Scenario: User is able to return to the Email screen
    Given the user is in the Forgot Password screen
    And user clicks on the link: "Return to Password Sign In"
    Then user should see Email screen

# Assert code screen - Code sent to Email Address
  Scenario Outline: User with email information in the profile should see the "Code" screen
    Given the user is in the Forgot Password screen
    And the Send Email radio button is selected
    When the user clicks on the "Continue" btn
    Then the user lands on the "We sent you a code" screen
    And the user should see the email text: "<email>"
    And user see "Security Code" field
    Examples:
      | email               |
      | nann40547@gmail.com |

  Scenario Outline: User without full information email information in the profile should see the "Code" screen
    Given user without Full Info is in the Forgot Password screen
    And the Send Email radio button is selected
    When the user clicks on the "Continue" btn
    Then the user lands on the "We sent you a code" screen
    And the user should see the email text: "<email>"
    And user see "Security Code" field
    Examples:
      | email             |
      | abc_123@gmail.com |

    #Assert code screen - Code sent to Phone Number
  Scenario Outline: User with phone information in the profile should see the "Code" screen
    Given the user is in the Forgot Password screen
   And the Send SMS radio button is selected
   Then the user lands on the "We sent you a code" screen
    And the user should see the email text: "<phoneNumber>"
    And user see "Security Code" field
    Examples:
      | phoneNumber  |
      | xxx-xxx-3966 |

    # Receive verification code in the email
  @wip
  Scenario: User should be able to receive the verification code in the email
    Given the user is in the We sent you a code screen
    When And the user retrieves the verification code from the email and send to Security Code field
    And the user clicks on the Submit button
    Then  user lands on the "Change Password" screen

    # Receive verification code in the phone
 # Scenario: User should be able to receive the verification code in the phone
    #Given the user is in the "We sent you a code" screen
   # When the user retrieves the verification code from the "phone"
   # And the user enters the verification code in the field: "Security Code"
   # And the user clicks on the "Submit" button
   # Then the user lands on the "Change Password" screen


     #verify No code received button functionality for Email
  Scenario Outline:  user with email should be able to click to No code received link
    Given the user is in the "We sent you a code" screen
    When user clicks on No Code received? button
    Then user should see forgot password screen with "<email>"
    And user should see forgot psd scr with "<phoneNumber>"
    Examples:
      |email                 |phoneNumber  |
      |nann40547@gmail.com   | xxx-xxx-3966|

    #verify No code received button functionality for PhoneNumber

  Scenario Outline:  user with phone should be able to click to No code received link
    Given the user with phone is in the "We sent you a code" screen
    When user clicks on No Code received? button
    Then user should see forgot password screen with "<email>"
    And user should see forgot psd scr with "<phoneNumber>"
    Examples:
      |email                 |phoneNumber  |
      |nann40547@gmail.com   | xxx-xxx-3966|

    #verify login with new password after password was reseted (Positive)

  Scenario Outline: User can login with the New password
    Given User on "Change Password" Screen
    When  user enter reset "<newPassword>" password
    And user  clicks "Save changes"
    And the user is on the Email screen
    And user enter existing email "<email>"
    And user clicks continue btn
    And user enter new "<newPassword>" password
    And user click sign in button
    Then user lands in the Home page as logged in user "<header>"
    Examples:
      | email               | newPassword | header          |
      | nann40547@gmail.com | test123     | Ashley Zzelkova |

  Scenario Outline: User can not  login with the Old password
    Given User on Change Password Screen
    When  the user enter new "<newPassword>" password
    And user  clicks "save changes"
    And the user is on the Email screen
    And user enter existing email "<email>"
    And user clicks continue btn
    And the user enters an old password: "<oldPassword>"
    And user click "sign in" button
    Then user can't login to dashboard page amd see error "<validationMessage>" message
    Examples:
      | email               | oldPassword | validationMessage                                                  | newPassword |
      | nann40547@gmail.com | test123     | Invalid email or password: please check your details and try again | test1234    |















