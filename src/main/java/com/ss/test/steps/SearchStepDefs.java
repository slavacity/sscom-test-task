package com.ss.test.steps;

import com.google.inject.Inject;
import com.ss.test.pages.SearchPage;
import cucumber.api.java.en.Then;

public class SearchStepDefs {

    @Inject
    SearchPage searchPage;

    @Then("user types (.*) as a searchword$")
    public void setKeyword(String keyword){
      searchPage.enterSearchKeyword(keyword);
    }

    @Then("user selects (.*) as a search type$")
    public void setSearchType(String searchType){
      searchPage.enterSearchType(searchType);
    }

    @Then("user selects (.*) as a sort type$")
    public void setSortType(String sortType){
      searchPage.enterSortType(sortType);
    }

    @Then("user submits search$")
    public void submitSearch(){
      searchPage.submitSearch();
    }

    @Then("user sets search price range from (\\d+) to (\\d+)$")
    public void setSearchPriceRange(int from, int to){
      searchPage.setPriceRange(from, to);
    }


}
