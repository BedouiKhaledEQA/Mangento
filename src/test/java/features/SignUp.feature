Feature: SignUp Functionality
  @SignUp
  Scenario: SignUp with Valid email and password
    Given   User open the browser
    When    User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    Then    User should navigate at the home page


    @Recaptcha
    Scenario: Forget password
      Given User open the browser
      When  User click on forget password and fill the email as "Bedouikhaled1@gmail.com"
      When  User add reCaptcha and click on Reset My password
      Then  User should login