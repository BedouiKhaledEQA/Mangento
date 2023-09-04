Feature: Compare Functionality
  @Compare
  Scenario:   Compare between articles
    Given     User open the browser
    When      User click on women Button and click on Hoodies
    And       Click on buttom compare for item selected
    Then      Message should be appear
    And       Click on button comapre for the second item to compare
    Then      Message should appear
    And       Check all item selected was added into compare list
    When      User click on compare Button
    Then      Compare Page should appear
