package com.ankit.factory;

public class Blog extends Website{
    @Override
    protected void createWebsite() {
        pages.add(new PostPage());
        pages.add(new CommentPage());
        pages.add(new AboutPage());
    }
}
