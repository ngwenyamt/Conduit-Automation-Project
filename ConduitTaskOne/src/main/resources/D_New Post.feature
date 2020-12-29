Feature: New Post

  Scenario Outline: Testing  New Post Functionality

    And user navigate to new post
    And user click on publish Article button
    And user enter article "<title>"
    And user enter what the article is "<about>"
    And user enter articles "<description>"
    And user enter "<tags>"
    And user click on the publish Article button again

    Examples:

    |title|about|description|tags|
    |Tebogo Ngwenya|I am testing the add new postfunctionality|South Africa|#Automated Testing|


