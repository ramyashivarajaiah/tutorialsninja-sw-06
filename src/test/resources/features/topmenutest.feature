#1. create topmenutest.feature and write following scenarios
#1. verifyUserShouldNavigateToDesktopsPageSuccessfully
#1.1 Mouse hover on “Desktops” Tab and click
#1.2 call selectMenu method and pass the menu = “Show All Desktops”
#1.3 Verify the text ‘Desktops’
#2. verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully
#2.1 Mouse hover on “Laptops & Notebooks” Tab and click
#2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
#2.3 Verify the text ‘Laptops & Notebooks’
#3. verifyUserShouldNavigateToComponentsPageSuccessfully
#3.1 Mouse hover on “Components” Tab and click
#3.2 call selectMenu method and pass the menu = “Show All Components”
#3.3 Verify the text ‘Components

Feature:Navigate Feature
  In order to perform Navigation successfully
  As a User
  I have to click on  mouseover and click on correct Tab

  @author_Ramya
  Scenario: I navigates to Desktops page
    Given I am  on Home Page
    When I  click on DesktopTab
    And I  click on Show AllDesktops from select menu
    Then I should see  text

  @author_Ramya
  Scenario: I navigate to LaptopsAndNotebooksPage
    Given I am  on Home Page
    When I  click on LaptopsAndNotebooks Tab
    And I  click on Show All Laptops & Notebooks from select menu
    Then I should see  text Laptops & Notebooks

  @author_Ramya
  Scenario: verifyUserShouldNavigateToComponentsPageSuccessfully
    Given I Mouse hover on “Components” Tab and click
    And I Click on “Show AllComponents” tab
    Then I should navigate to ‘Components’