package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.TopMenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TopMenuSteps {


    @Given("I am  on Home Page")
    public void iAmOnHomePage() {
    }

    @When("I  click on DesktopTab")
    public void iClickOnDesktopTab() {
        new TopMenuPage().mouseHoverToElementAndClickOnDesktop();
    }

    @And("I  click on Show AllDesktops from select menu")
    public void iClickOnShowAllDesktopsFromSelectMenu() {
        new TopMenuPage().selectMenu("Show AllDesktops");
    }

    @Then("I should see  text")
    public void iShouldSeeText() {
        String expected = "Desktops";
        String actual = new TopMenuPage().getTextDesktop();
        Assert.assertEquals(actual, expected);
    }


    @When("I  click on LaptopsAndNotebooks Tab")
    public void iClickOnLaptopsAndNotebooksTab() {
        new TopMenuPage().mouseHoverOnLaptopsAndNotebooksTab();
    }

    @And("I  click on Show All Laptops & Notebooks from select menu")
    public void iClickOnShowAllLaptopsNotebooksFromSelectMenu() {
        new TopMenuPage().selectMenu("Show AllLaptops & Notebooks");
    }

    @Then("I should see  text Laptops & Notebooks")
    public void iShouldSeeTextLaptopsNotebooks() {
        String expectedText = "Laptops & Notebooks";
        String actualText = new TopMenuPage().getLaptopsAndNotebooksText();
        Assert.assertEquals(actualText, expectedText);
    }

    @Given("I Mouse hover on “Components” Tab and click")
    public void iMouseHoverOnComponentsTabAndClick() {
        new TopMenuPage().mouseHoverToComponentsTab();
    }

    @And("I Click on “Show AllComponents” tab")
    public void iClickOnShowAllComponentsTab() {
        new TopMenuPage().selectMenu("Show AllComponents");
    }

    @Then("I should navigate to ‘Components’")
    public void iShouldNavigateToComponents() {
        Assert.assertEquals(new TopMenuPage().getComponentsText(), "Components", "Components page not displayed");
    }


}
