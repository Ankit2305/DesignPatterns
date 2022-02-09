package com.ankit.factory;

public class Shop extends Website {
    @Override
    protected void createWebsite() {
        pages.add(new CartPage());
        pages.add(new CommentPage());
        pages.add(new AboutPage());
    }
}
