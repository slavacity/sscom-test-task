package com.ss.test.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static com.ss.test.TestContext.getDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public abstract class ComponentBase {

    private static final int ELEMENT_WAIT_TIMEOUT_SECONDS = 15;

    protected void openPage(String url) {
        getDriver().get(url);
    }

    private WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), ELEMENT_WAIT_TIMEOUT_SECONDS);
    }

    protected void click(By locator) {
        getWait().until(elementToBeClickable(locator))
                .click();
    }

    protected void doubleClick(By locator) {
        new Actions(getDriver()).doubleClick(getElement(locator)).perform();
    }

    protected void selectDropdownOption(By locator, String option) {
        new Select(getDriver().findElement(locator)).selectByVisibleText(option);
    }

    protected void click(WebElement element) {
        element.click();
    }

    protected String getText(By locator) {
        return getWait()
                .until(presenceOfElementLocated(locator))
                .getText();
    }

    protected void setText(By locator, String text) {
        getWait().until(presenceOfElementLocated(locator))
                .sendKeys(text);
    }

    protected List<WebElement> getElements(By locator) {
        return getDriver().findElements(locator);
    }

    protected WebElement getElement(By locator) {
        return getWait().until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected void waitForElementPresent(By locator) {
        getWait().until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected void waitForElementVisible(By locator) {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void waitForElementInvisible(By locator) {
        getWait().until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    protected void waitForElementBecomeDisplayedNone(By locator) {
        getWait().until(driver -> driver.findElement(locator).getCssValue("display").equals("none"));
    }

}
