package com.ss.test.steps;

import com.google.inject.Inject;
import com.ss.test.pages.PageComponent;
import com.ss.test.pages.SearchPage;
import cucumber.api.java.en.Then;

public class BaseStepDefs {

    @Inject
    PageComponent pageComponent;
    @Inject
    SearchPage searchPage;

    @Then("user opens search$")
    public void openSearch(){
        pageComponent.openSearch();
        searchPage.waitForPageLoaded();
    }

    @Then("user open bookmarks page$")
    public void openBookmarks(){
        pageComponent.openBookmarks();
    }


}
