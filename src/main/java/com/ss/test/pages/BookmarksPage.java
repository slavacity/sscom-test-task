package com.ss.test.pages;

import com.ss.test.model.Advertisement;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

public class BookmarksPage extends PageComponent {

    private final static By SAVED_BOOKMARKS = By.cssSelector("[id*='tr']:not([id*='bnr'])");

    public List<Advertisement> getBookmarkAdvertisementItems() {
        return getElements(SAVED_BOOKMARKS)
                .stream()
                .map(Advertisement::new)
                .collect(Collectors.toList());
    }

}
