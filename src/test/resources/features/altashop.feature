@AltaShop
Feature: Alta Shop Home

  @Register @NormalPositive @RegisterAltaShopSuccess
  Scenario: User doing register with valid Full Name, Email and Password
    Given User is on Alta Shop page
    And User input correct FullName "FullName"
    And User input correct Email "Email"
    And User input correct Password "Password"
    And User click register
    Then User directed to login page

  @Login @NormalPositive @LoginAltaShopSuccess
  Scenario: User doing login with valid Email and Password
    Given User is on Alta Login Page
    And User input valid Email "Email"
    And User input valid Password "Password"
    And User click login
    Then User directed to dashboard

  @SelectCategory @NormalPositive @LoginAltaShopSuccess
  Scenario: User selecting category of product
    Given User is on Alta Login Page
    And User input valid Email "Email"
    And User input valid Password "Password"
    And User click login
    Then User directed to dashboard
    Then User selected category