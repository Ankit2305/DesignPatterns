package com.ankit.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
    List<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    protected abstract void createWebsite();

    public List<Page> getPages() {
        return pages;
    }
}
