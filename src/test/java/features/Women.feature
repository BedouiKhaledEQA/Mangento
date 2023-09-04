Feature: Women's Functionality

@Women1Jacket[TOP]
  Scenario: Select Jackets from top
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And  Click on Top and categorie Jackets
    Then Item should appear

  @Women1Jacket[TOP][DIRECTLY]
  Scenario: Select Jackets from top DIRECTLY FROM WOMEN BUTTON
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And  Click on Women Button and click on Jackets
    Then Jackets women should appear


  @Women1Hoodie[TOP]
  Scenario: Select Hoodie from top
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And  Click on Top and categorie Hoodie
    Then Item Hoodie should appear

  @Women1Hoodie[TOP][DIRECTLY]
  Scenario: Select Hoodie from top DIRECTLY FROM WOMEN BUTTON
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And  Click on Women Button and click on Hoodie
    Then Hoodie women should appear


  @Women1Tees[TOP]
  Scenario: Select Tees from top
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And  Click on Top and categorie Tees
    Then Item Tees should appear

  @Women1Tees[TOP][DIRECTLY]
  Scenario: Select Tees from top DIRECTLY FROM WOMEN BUTTON
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And  Click on Women Button and click on Tees
    Then Tees Women should appear


  @Women1Bras&Tanks[TOP]
  Scenario: Select Bras&Tanks from top
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And  Click on Top and categorie Bras&Tanks
    Then Item Bras&Tanks should appear

  @Women1Bras&Tanks[TOP][DIRECTLY]
  Scenario: Select Bras&Tanks from top DIRECTLY FROM WOMEN BUTTON
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And  Click on Women Button and click on Bras&Tanks
    Then Bras&Tanks Women should appear


  @Women1Pants[BOTTOMS]
  Scenario: Select Pants from Bottoms
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And  Click on Bottoms and categories Pants
    Then Item pants should appear

  @Women1Pants[BOTTOMS][DIRECTLY]
  Scenario: Select Pants from Bottoms DIRECTLY FROM WOMEN BUTTON
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And  Click on Women Button and click on Pants
    Then pants Women should appear

  @Women1Shorts[BOTTOMS]
  Scenario: Select Shorts from Bottoms
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And  Click on Bottoms and categorie Shorts
    Then Item Shorts should appear

  @Women1Shorts[BOTTOMS][DIRECTLY]
  Scenario: Select Shorts from Bottoms DIRECTLY FROM WOMEN BUTTON
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And  Click on Women Button and click on Shorts
    Then Shorts Women should appear


