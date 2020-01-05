Feature: I go to the home page
 
 Scenario: Login functionality of nopCommerce
  Given Checking cucumber is working or not
  And I go to nopCommerce Page "https://admin-demo.nopcommerce.com/login"
  When User enters "admin@yourstore.com" and "admin"
  And user click on login button
  
#  Examples:
#          | username            | password  |
#          | admin@yourstore.com | admin     |