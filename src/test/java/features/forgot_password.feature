Feature: As user I should be able to change the password

  Background:
    Given user lands ann app
    And user on pop up screen
    When user enter existing email "nann40547@gmail.com" address
    And user clicks continue button
    And user lands on password screen
    And user clicks forgot password link

  # assert forgot password screen
  Scenario: User with full information in the profile can see the email and the phone number provided
    Then user should see firstText "How would you like to reset your password? You can verify by email or request a text to be sent to the mobile number linked to your account."
    And user should see secondText "Please choose one of the options below:"
    And user should be able to see text "Send email to:" of radiobutton for email
    And user should be able to see text "Send SMS text with code to:" of radiobutton for text message
    And user should be able to click on continue button


  Scenario Outline: User without full information in the profile can see the email address provided
    Then the user should see the first text: "<firstText>"
    And the user should see the second text: "<secondText>"
    And the user should see the "<email>"
    And user should be able to click on continue button
    Examples:
      | firstText                                                                                                                                    | secondText                              |email            |
      | How would you like to reset your password? You can verify by email or request a text to be sent to the mobile number linked to your account. | Please choose one of the options below: |ann_123@gmail.com|


  #verify Return to Password Sign In button functionality
  Scenario: User with full information by clicking Return to password Sign In button should be able to return to Password screen
    And user clicks Return to Password Sign In link
    Then the user is in the Email screen

  #assert code screen
  Scenario: User with full information should see code screen
    And user clicks sent Email to radio button
    And user clicks Continue button
    Then user should see "We sent you a code" text
    And user should "nann40547@gmail.com" email
    And user clicks No Code received? button
    And  user sees forgot password screen

  # Receive verification code in the email
  @wip
  Scenario: User should be able to receive the verification code in the email
    And user clicks sent Email to radio button
    And user clicks Continue button
    And the user retrieves the verification code from the email and send to security code field
    And the user clicks on the submit button
    Then the user lands on the "Change Password" screen

    # Receive verification code in the phone
  Scenario: User should be able to receive the verification code in the phone
    Given the user is on the "We sent you a code" screen
    When the user retrieves the verification code from the phone
    And the user enters the verification code in the "Security Code" field
    And the user clicks on the "Submit" button
    Then the user lands on the "Change Password" screen

    #verify No code received button functionality
  Scenario:  user should be able to click to No code received link
    And user clicks sent Email to radio button
    And user clicks Continue button
    And user clicks on No Code received? button
    Then user should see forgot password screen with email text password screen

    #verify login with new password after password was reseted (Positive)
  Scenario: New Password/valid scenario
    And user clicks sent Email to radio button
    And user clicks Continue button
    And the user retrieves the verification code from the email and send to security code field
    And user clicks submit button
    And user enter reset "test123" password
    And user  clicks save changes
    And user clicks to sign out
    And user clicks sign in module
    And user lands on app
    And user on pop up Screen
    And user enter existing email "nann40547@gmail.com"
    And user clicks continue btn
    And user lands on password scrn
    And user enter new "test123" password
    And user click sign in button
    Then user lands in the Home page as logged in user "Ashley Zzelkova"

    #verify login with old password after password was resetted (Negative)
  Scenario: Old password/ invalid scenario
    And user clicks sent Email to radio button
    And user clicks Continue button
    And code is sent using check email to insert code text box
    And user clicks submit button
    And user  clicks save changes
    And user lands on app
    And user on pop up screen
    And user enter existing email "nann40547@gmail.com" address
    And user clicks continue button
    And user lands on password screen
    And user enters old "test" password
    And user click sign in button
    Then user should see error message



  #verify sms forgot password (may be available through google voice api)


























