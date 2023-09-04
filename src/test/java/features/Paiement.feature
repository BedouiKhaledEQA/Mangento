Feature:  Payment Functionality
  @Payment
  Scenario:  Proceed to checkout
    Given    User open the browser
    When     User click on women Button and click on Hoodies
    And      User select item options and add it to the cart and click on preceed to checkout
    And      User fill the email as "Bedouikhaled1@gmail.com" and "khaled" and "Bed"
    And      User fill the street adress as "Ennasr" and "Tunis" and select state and "75016" and "5848" and click on next
    Then     Review payment should appear
    And      User click on same bylling and shipping and click on place order
    Then     payment should be done


