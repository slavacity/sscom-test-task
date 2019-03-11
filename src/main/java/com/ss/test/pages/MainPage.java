package com.ss.test.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends PageComponent {

    private static final String MAIN_PAGE_URL = "https://www.ss.com/en";
    private static final By HEADLINES = By.cssSelector(".main_head");
    private static final By CATEGORY_HEADLINE = By.cssSelector(".headtitle");

    public void openMainPage() {
        openPage(MAIN_PAGE_URL);
    }

    public void chooseCategory(String expectedCategory) {
        WebElement categoryElement = getElements(HEADLINES)
                .stream()
                .filter(it -> it.getText().equals(expectedCategory))
                .findFirst()
                .orElseThrow(() -> new AssertionError(expectedCategory + " category was not found"));
        click(categoryElement.findElement(By.tagName("a")));
        waitForElementPresent(CATEGORY_HEADLINE);
    }

}
