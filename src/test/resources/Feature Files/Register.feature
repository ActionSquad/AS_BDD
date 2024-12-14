@Register
Feature: User registration Page
   
  @register2empty
  Scenario: Display error for empty username and password
    Given The user is on the DS Algo Register Page
    When The user clicks Register button with no inputs
    Then The error message Please fill out this field. appears below the Username textbox for Register

  @registeremptypassword
  Scenario: Display error for empty password field 
    Given The user is on the DS Algo Register Page
    When The user enters validUsername and leaves the password empty fir Register
    Then The error message Please fill out this field. appears below the Password textbox for register

  @registeremptyconfirmpassword
  Scenario: Display error for empty confirmpassword field
    Given The user is on the DS Algo Register Page
    When The user enters validUsername,valid password  and empty confirmPassword
    Then The error message Please fill out this field. appears below the confirmPassword textbox

  @registerinvalidcredentials
  Scenario: Display error for invalid credentials
    Given The user is on the DS Algo Register Page
    When The user enters invalidUsername and invalidPassword for register
    Then The error message Invalid Username and Password. should be displayed for register

  @registervalidcredentials
  Scenario: Registration with valid credentials
    Given The user is on the DS Algo Register Page
    When The user enters validUsername and validPassword and click register button
    Then user created new account and got meassage you are logged in

  @registerAlreadyAccount
  Scenario: User already have an account
    Given The user is on the DS Algo Register Page
    When The user clicks below Login Link
    Then the user should be redirected to Login page
