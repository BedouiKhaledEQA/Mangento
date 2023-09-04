Feature: SignIn Functionality
  @SignIn
  Scenario: SignIn
    Given User open the browser
    When  User fill the Firstname as "Khaled" and Lastname as "BEDOUI"
    And   User fill email as "Bedouikhaled1@gmail.com" and password as "Test123&" and confirm MDP as "Test123&"
    Then  Account should be created

    @Required_fields
    Scenario: Checking Required fields

      Given  User open the browser
      When   User click on creat account Button
      Then   Error message should appear under the Required fields


     @Email_Format
     Scenario: Checking Email Format and SingIn fail
       Given  User open the browser
       When   User fill the Firstname as "Test" and Lastname as "TEst2"
       And    user fill the wrong email as "khaled" and click on creat account
       And    User fill password as "Test123&" and confirm MDP as "Test123&"
       Then   Error message should appear under the email fields as
       And    Account shouldnt be created

     @Password_Format
     Scenario Outline: Checking Password format and SingnIn fail
       Given User open the browser
       When  User fill the Firstname as "Khaled" and Lastname as "BEDOUI"
       And   User fill email as "Bedouikhaled1@gmail.com" and password as "<password>" and confirm MDP as "<confirmP>"
       And   Error message not same should appear
       Then  Error message should appear under password field lenght
       And   Account shouldnt be created
       Examples:
       |password|confirmP|
       |Test123&|Test124&|
       |Test1   |Test    |





