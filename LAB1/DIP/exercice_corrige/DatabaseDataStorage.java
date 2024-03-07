package com.directi.training.dip.exercise;

import java.util.HashMap;
import java.util.Map;

public class DatabaseDataStorage implements DataStorage {
    private static final Map<Integer, String> data = new HashMap<>();
    private static int count = 0;

    @Override
    public void write(String data) {
        // Database write operation
        this.data.put(++count, data);
    }
}
