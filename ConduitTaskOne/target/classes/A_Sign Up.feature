Feature: Sign up
  Scenario Outline: Testing Sign Up Functionality

    Given user is on home page
    Then user navigate to sign up
    And user enter invalid "<email1>" and "<password1>" and click Sign in button
    And user enter "<username>" and valid "<email2>" and "<password2>" and click Sign in button


    Examples:
    |username|email1|password1|email2|password2|
    |ngwenyamt523|tebogongwenyagmail.com|pas|tebogongwenya9684@gmail.com|Password@12345|

