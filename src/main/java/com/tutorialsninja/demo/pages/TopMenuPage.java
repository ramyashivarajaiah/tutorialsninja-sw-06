package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TopMenuPage extends Utility {
    private static final Logger log = Logger.getLogger(TopMenuPage.class.getName());
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopTab;

    @CacheLookup
    @FindBy
    public By topMenu = By.xpath("//body/div[1]/nav[1]/div[2]");

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]")
    WebElement desktopText;

    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopsAndNotebooksTab;

    @CacheLookup
    @FindBy(css = "body:nth-child(2) div.container:nth-child(4) div.row div.col-sm-9 > h2:nth-child(1)")
    WebElement laptopsAndNotebooksText;

    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement componentsTab;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement componentsText;


    public void selectMenu(String menu) {
        List<WebElement> topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }


    public void mouseHoverToElementAndClickOnDesktop() {
        mouseHoverToElementAndClick(desktopTab);
        log.info("click on desktop " + desktopTab.toString());

    }

    public String getTextDesktop() {
        log.info("get text desktops " + desktopTab.toString());
        return getTextFromElement(desktopText);
    }

    public void mouseHoverOnLaptopsAndNotebooksTab() {
        mouseHoverToElementAndClick(laptopsAndNotebooksTab);
        log.info("mouseHoverOnLaptopsAndNotebooksTab" + laptopsAndNotebooksTab.toString());
    }

    public String getLaptopsAndNotebooksText() {
        log.info("getLaptopsAndNotebooksText" + laptopsAndNotebooksText.toString());
        return getTextFromElement(laptopsAndNotebooksText);
    }

    public void mouseHoverToComponentsTab() {
        log.info("mouseHoverToComponentsTab" + componentsTab.toString());
        mouseHoverToElementAndClick(componentsTab);

    }

    public String getComponentsText() {
        log.info("getComponentsText" + componentsText.toString());
        return getTextFromElement(componentsText);
    }
}
