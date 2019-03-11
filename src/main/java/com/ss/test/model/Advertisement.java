package com.ss.test.model;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.ss.test.TestContext.getDriver;

public class Advertisement {

    private WebElement rootElement;
    private String id;
    private WebElement checkbox;

    public Advertisement(WebElement element) {
        this.rootElement = element;
        this.id = element.getAttribute("id");
        this.checkbox = element.findElement(By.cssSelector("[type='checkbox']"));
    }

    public void selectCheckbox() {
        new Actions(getDriver())
                .moveToElement(rootElement)
                .click(checkbox)
                .build()
                .perform();
    }

    public String getId(){
        return id;
    }


}
