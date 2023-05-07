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

  @SelectCategory @NormalPositive @ChoosingCategoryAtAltaShopSuccess
  Scenario: User selecting category of product
    Given User is on Alta Login Page
    And User input valid Email "Email"
    And User input valid Password "Password"
    And User click login
    Then User directed to dashboard
    Then User select category
    Then User choose one of the category
    Then User directed to furniture

  @DetailProduct @NormalPositive @ProductInformation
  Scenario: User click detail about product information
    Given User is on Alta Login Page
    And User input valid Email "Email"
    And User input valid Password "Password"
    And User click login
    Then User directed to dashboard
    Then User click detail on one product
    Then User directed to the product

  @BuyProduct @NormalPositive @PurchaseProduct
  Scenario: User purchasing a product
    Given User is on Alta Login Page
    And User input valid Email "Email"
    And User input valid Password "Password"
    And User click login
    Then User directed to dashboard
    Then User click buy on one product

  @Order @NormalPositive @OnCartProduct
  Scenario: User have product on cart that already buy
    Given User is on Alta Login Page
    And User input valid Email "Email"
    And User input valid Password "Password"
    And User click login
    Then User directed to dashboard
    Then User click buy on one product
    Then User click on cart

  @Transaction @NormalPositive @PayProduct
  Scenario: User pay the product on the cart
    Given User is on Alta Login Page
    And User input valid Email "Email"
    And User input valid Password "Password"
    And User click login
    Then User directed to dashboard
    Then User click buy on one product
    Then User click on cart
    Then User pay the product

  @Logout @NormalPositive @LogoutAltaShopSuccess
  Scenario: User logout from Alta Shop Page
    Given User is on Alta Login Page
    And User input valid Email "Email"
    And User input valid Password "Password"
    And User click login
    Then User directed to dashboard
    Then User click on logout symbol
    Then User directed to login page