package com.ss.test.steps;

import com.google.inject.Inject;
import cucumber.api.java.en.Then;
import com.ss.test.pages.SearchPage;
import com.ss.test.pages.SearchResultPage;

public class SearchResultStepDefs {

    @Inject
    private SearchResultPage searchResultPage;
    @Inject
    private SearchPage searchPage;

    @Then("user opens advanced search$")
    public void openAdvancedSearch(){
      searchResultPage.openAdvancedSearch();
      searchPage.waitForPageLoaded();
    }

    @Then("user chooses (\\d+) random advertisements$")
    public void chooseRandomAds(int adsCount){
      searchResultPage.chooseRandomAds(adsCount);
    }

    @Then("user saves advertisements to bookmarks$")
    public void saveAdsToBookmarks(){
        searchResultPage.addToBookmarks();
    }


}
