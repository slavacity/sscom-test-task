package com.ss.test.pages;

import org.openqa.selenium.By;

public class SearchPage extends PageComponent {

    private final static By SEARCH_KEYWORD_TEXTFIELD = By.cssSelector("#ptxt");
    private final static By SEARCH_TYPE = By.cssSelector("[name='sid']");
    private final static By SORT_TYPE = By.cssSelector("[name='sort']");
    private final static By SUBMIT_BTN = By.cssSelector("input[type='submit']");
    private final static By HEAD_TITLE = By.cssSelector(".headtitle");
    private final static By MIN_RANGE = By.cssSelector("[name*='min'");
    private final static By MAX_RANGE = By.cssSelector("[name*='max'");
    private final static By PRELOAD_TEXT = By.cssSelector("#preload_txt");

    public void enterSearchType(String searchType){
        selectDropdownOption(SEARCH_TYPE, searchType);
    }

    public void waitForPageLoaded(){
        waitForElementVisible(HEAD_TITLE);
    }

    public void enterSearchKeyword(String keyword){
        setText(SEARCH_KEYWORD_TEXTFIELD, keyword);
        clickOnHeadTitleToRemoveSearchDropdown();
    }

    public void enterSortType(String sortType){
        selectDropdownOption(SORT_TYPE, sortType);
    }

    public void submitSearch(){
        click(SUBMIT_BTN);
    }

    public void setPriceRange(int from, int to){
        setText(MIN_RANGE, String.valueOf(from));
        setText(MAX_RANGE, String.valueOf(to));
    }

    private void clickOnHeadTitleToRemoveSearchDropdown(){
        doubleClick(HEAD_TITLE);
        waitForElementVisible(PRELOAD_TEXT);
    }

}
