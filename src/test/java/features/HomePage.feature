Feature: Home Page Functionality
  @HomePage
  Scenario: Search Bar Functionality
    Given   User open the browser
    When    User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And     User fill the search as "Oli" and click on search Button
    Then    Result of search should appear
    And     Click on Logo button
    Then    User should be back at the home page