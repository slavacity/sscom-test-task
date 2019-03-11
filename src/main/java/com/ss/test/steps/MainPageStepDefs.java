package com.ss.test.steps;

import com.google.inject.Inject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import com.ss.test.pages.MainPage;


public class MainPageStepDefs {

    @Inject
    private MainPage mainPage;

    @Given("^opened main page by user$")
    public void openMainPage() {
        mainPage.openMainPage();
    }

    @Then("user opens (.*) category$")
    public void changeCategoryTo(String category) {
        mainPage.chooseCategory(category);
    }

}
