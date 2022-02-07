package com.ankit.singleton;

public class DatabaseSingleton {
    private static DatabaseSingleton instance;

    private DatabaseSingleton() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized static DatabaseSingleton getInstance() {
        if(instance == null) {
            instance = new DatabaseSingleton();
        }
        return instance;
    }
}
