Feature: Gear Functionality

  @GearBags
  Scenario: Check all Bags from gears
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And   Click on Gear button and click on Bags
    Then  Bags should be appear

  @GearFitness
  Scenario: Check all Fitness Equipment from gears
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And   Click on Gear button and click on Fitness Equipment
    Then  Fitness Equipment should be appear


  @GearWatches
  Scenario: Check all Watches from gears
    Given User open the browser
    When  User fill the email as "Bedouikhaled1@gmail.com" and "Test123&" and click on login
    And   Click on Gear button and click on Watches
    Then  Watches should be appear
