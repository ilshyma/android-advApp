package com.example.asti.myapplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by asti on 06.05.2017.
 */

public class UrlHolder {

    private List<String> urlList;
    private Random randomGenerator;

    public static UrlHolder instance = null;

    private UrlHolder() {
        List<String> urlList = new ArrayList<>(5);
        urlList.add("https://comfy.ua");
        urlList.add("http://allo.ua/");
        urlList.add("https://eldorado.ua/");
        urlList.add("http://gorod.dp.ua/");
        urlList.add("http://www.i.ua/");
    }

    public static UrlHolder getInstance() {
        if (instance == null) {
            instance = new UrlHolder();
        }
        return instance;
    }

    private List<String> getUrlList() {
        return urlList;
    }

    private void setUrlList(List<String> urlList) {
        this.urlList = urlList;
    }




}
