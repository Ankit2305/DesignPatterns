package com.ankit.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<>();
    public static String MOVIE = "movie";
    public static String BOOK = "book";

    public Item createItem(String type) {
        Item item = null;
        try {
            item = (Item) items.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    public Registry() {
        loadItems();
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Title");
        movie.setPrice(25.00);
        movie.setRuntime("2 hrs");
        items.put(MOVIE, movie);

        Book book = new Book();
        book.setTitle("Basic Book");
        book.setPrice(10.00);
        book.setNumberOfPages(200);
        items.put(BOOK, book);
    }


}
