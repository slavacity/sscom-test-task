package com.ss.test.steps;

import com.google.inject.Inject;
import cucumber.api.java.en.Then;
import com.ss.test.model.Advertisement;
import com.ss.test.pages.BookmarksPage;

import java.util.List;
import java.util.stream.Collectors;

import static com.ss.test.model.AdvertisementBookmarkedList.getSavedList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;


public class BookmarksStepDefs {

    @Inject
    BookmarksPage bookmarksPage;

    @Then("previously saved ads expected to be shown in bookmarks$")
    public void compareSavedItems() {
        List<String> bookmarkListIds = getListIds(bookmarksPage.getBookmarkAdvertisementItems());
        List<String> savedListIds = getListIds(getSavedList());

        assertThat("Bookmarked advertisements expected to match with previously saved ones",
                bookmarkListIds, containsInAnyOrder(savedListIds.toArray()));
    }

    private List<String> getListIds(List<Advertisement> list) {
        return list.stream()
                .map(Advertisement::getId)
                .collect(Collectors.toList());
    }

}
