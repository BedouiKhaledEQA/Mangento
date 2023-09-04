Feature: Men's Functionality

  @Mens1Jacket[TOP]
  Scenario: Select Mens Jackets from top
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And  Click on Top and categorie Jackets for Mens
    Then Item should Mens appear

  @Mens1Hoodie[TOP]
  Scenario: Select Mens Hoodie from top
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And  Click on Top and categorie Hoodie for Mens
    Then Item Hoodie Mens should appear


  @Mens1Tees[TOP]
  Scenario: Select Mens Tees from top
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And  Click on Top and categorie Tees for Mens
    Then Item Tees Mens should appear

  @Mens1Bras&Tanks[TOP]
  Scenario: Select Mens Bras&Tanks from top
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And  Click on Top and categorie Bras&Tanks for Mens
    Then Item Bras&Tanks Mens should appear


  @Mens1Pants[BOTTOMS]
  Scenario: Select Mens Pants from Bottoms
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And  Click on Bottoms and categories Pants for Mens
    Then Item pants Mens should appear

  @Mens1Shorts[BOTTOMS]
  Scenario: Select Mens Shorts from Bottoms
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And  Click on Bottoms and categorie Shorts for Mens
    Then Item Shorts Mens should appear