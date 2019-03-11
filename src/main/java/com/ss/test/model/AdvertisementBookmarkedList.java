package com.ss.test.model;

import java.util.ArrayList;
import java.util.List;

public class AdvertisementBookmarkedList {

    private static List<Advertisement> savedList = new ArrayList<>();

    public static void addToSavedItemsList(List<Advertisement> list){
        savedList.addAll(list);
    }

    public static List<Advertisement> getSavedList(){
        return savedList;
    }
}
