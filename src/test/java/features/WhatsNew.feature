Feature: Whats New Functionality
  @AllCategoriExisite
  Scenario: Checking all categories that exist
    Given   User open the browser
    When    User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    Then    User click on Whats new button and should find all categories

  @CheckiteminCategorieWOMEN
  Scenario: Checking WOMEN'S ITEM IN ALL CATEGORIES
    Given   User open the browser
    When    User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    Then    User click on Whats new button and click on selected WOMENS categorie and items should appear

  @CheckiteminCategorieMEN
  Scenario: Checking MEN'S ITEM IN ALL CATEGORIES
    Given   User open the browser
    When    User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    Then    User click on Whats new button and click on selected MENS categorie and items should appear

  @CheckiteminCategorieYOGA
  Scenario: Checking YOGA ITEM IN ALL CATEGORIES
    Given   User open the browser
    When    User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    Then    User click on Whats new button and click on selected YOGA categorie and items should appear
