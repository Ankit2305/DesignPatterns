package com.ankit;

import com.ankit.singleton.DatabaseSingleton;

public class Main {

    public static void main(String[] args) {
        int size = 10;
        String[] addresses = new String[size];
        for(int i=0;i<size;i++) {
            final int index = i;
            new Thread(
                    () -> {
                        DatabaseSingleton db = DatabaseSingleton.getInstance();
                        addresses[index] = db.toString();
                        System.out.println(index + " -> " + db);
                    }
            ).start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=1;i<size;i++) {
            if(!addresses[i].equals(addresses[i-1])) {
                System.out.println("Failed at " + i + " & " + (i-1));
                return;
            }
        }
        System.out.println("Passed");
//        if(db == db2) {
//            System.out.println("Same instance hence singleton");
//        }
    }
}
