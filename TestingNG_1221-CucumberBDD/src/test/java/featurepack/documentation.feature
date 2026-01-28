
@tag
  Feature: cucumber.io documentation page testing
  Background: 
  Given the user must be in chrome browser
  
@tag1
  Scenario: Verify the Documentation
    Given The user is in cucumber.io homepage
    When The user clicks on Documentation link
    Then The user can view the page content with What is Cucumber?