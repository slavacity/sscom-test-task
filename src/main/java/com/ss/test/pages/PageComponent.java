package com.ss.test.pages;

import com.ss.test.component.ComponentBase;
import org.openqa.selenium.By;

public class PageComponent extends ComponentBase {

    private final static By SEARCH = By.cssSelector("a[href*='/search/']");
    private final static By BOOKMARKS = By.cssSelector("a[href*='/favorites/']");

    public void openSearch(){
        click(SEARCH);
    }

    public void openBookmarks(){
        click(BOOKMARKS);
    }

}
