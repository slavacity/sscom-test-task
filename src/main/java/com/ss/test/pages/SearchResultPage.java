package com.ss.test.pages;

import com.ss.test.model.Advertisement;
import com.ss.test.model.AdvertisementBookmarkedList;
import org.openqa.selenium.By;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SearchResultPage extends PageComponent {

    private final static By SEARCH_RESULTS = By.cssSelector("[id*='tr']:not([id*='bnr'])");
    private final static By ADD_BOOKMARKS_BTN = By.cssSelector("#a_fav_sel");
    private final static By ADVANCED_SEARCH = By.cssSelector("#page_main a[href*='/search/']");

    public void chooseRandomAds(int adsCount) {
        List<Advertisement> advertisements = getAdvertisements();
        Collections.shuffle(advertisements);
        List<Advertisement> randomAdsList = advertisements
                .stream()
                .limit(adsCount)
                .collect(Collectors.toList());
        AdvertisementBookmarkedList.addToSavedItemsList(randomAdsList);
        randomAdsList.forEach(Advertisement::selectCheckbox);
    }

    public void openAdvancedSearch() {
        click(ADVANCED_SEARCH);
    }

    public void addToBookmarks() {
        click(ADD_BOOKMARKS_BTN);
    }

    private List<Advertisement> getAdvertisements() {
        return getElements(SEARCH_RESULTS).stream()
                .map(Advertisement::new)
                .collect(Collectors.toList());
    }

}
