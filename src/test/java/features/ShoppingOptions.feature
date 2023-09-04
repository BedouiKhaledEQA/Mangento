Feature: Shopping OptionsFunctionality

  @ShoppingOptionsWomenJacket[TOP]
  Scenario: Select Shopping Options Jackets from top
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And   Click on Top and Jackets categorie and select Jackets Option
    Then  Jackets looked for should appear

  @ShoppingOptionsWomen1Jacket[TOP][DIRECTLY]
  Scenario: Select Jackets from top DIRECTLY FROM WOMEN BUTTON
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And   Click on Women Button and click on Jackets categorie and select Jackets Option
    Then  Jacketss looked for should appear


  @ShoppingOptionsWomen1Hoodie[TOP]
  Scenario: Select Hoodie from top
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And   Click on Top and Hoodies categorie and select Hoodie Option
    Then  Hoodie looked for should appear

  @ShoppingOptionsWomen1Hoodie[TOP][DIRECTLY]
  Scenario: Select Hoodie from top DIRECTLY FROM WOMEN BUTTON
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And   Click on Women Button and click on Hoodie categorie and select Hoodies Option
    Then  Hoodies looked for should appear


  @ShoppingOptionsWomen1Tees[TOP]
  Scenario: Select Tees from top
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And   Click on Top and Tees categorie and select Tees Option
    Then  Tees looked for with option should appear

  @ShoppingOptionsWomen1Tees[TOP][DIRECTLY]
  Scenario: Select Tees from top DIRECTLY FROM WOMEN BUTTON
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And   Click on Women Button and click on Tees categorie and select Tees Option
    Then  Tees looked for  should appear


  @ShoppingOptionsWomen1Bras&Tanks[TOP]
  Scenario: Select Bras&Tanks from top
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And   Click on Top and Bras categorie and select Bras Option
    Then  Bras looked for should appear

  @ShoppingOptionsWomen1Bras&Tanks[TOP][DIRECTLY]
  Scenario: Select Bras&Tanks from top DIRECTLY FROM WOMEN BUTTON
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And   Click on Women Button and click on Bras categorie and select Bras Option
    Then  Bras looked for Directly should appear


  @ShoppingOptionsWomen1Pants[BOTTOMS]
  Scenario: Select Pants from Bottoms
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And   Click on Bottoms and categories Pants and select Pants Option
    Then  Pants looked for should appear

  @ShoppingOptionsWomen1Pants[BOTTOMS][DIRECTLY]
  Scenario: Select Pants from Bottoms DIRECTLY FROM WOMEN BUTTON
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And   Click on Women Button and click on Pants categorie and select Pants Option
    Then  Pants looked for Directly should appear

  @ShoppingOptionsWomen1Shorts[BOTTOMS]
  Scenario: Select Shorts from Bottoms
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And   Click on Bottoms and categories Shorts and select Shorts Option
    Then  Shorts looked for should appear

  @ShoppingOptionsWomen1Shorts[BOTTOMS][DIRECTLY]
  Scenario: Select Shorts from Bottoms DIRECTLY FROM WOMEN BUTTON
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And   CClick on Women Button and click on Shorts categorie and select Shorts Option
    Then  Shorts Women Directly should appear
