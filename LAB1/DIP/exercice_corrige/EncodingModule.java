package com.directi.training.dip.exercise;

import java.io.IOException;

public class EncodingModule {
    private final DataStorage fileStorage;
    private final DataStorage databaseStorage;

    public EncodingModule(DataStorage fileStorage, DataStorage databaseStorage) {
        this.fileStorage = fileStorage;
        this.databaseStorage = databaseStorage;
    }

    public void encodeWithFiles() throws IOException {
        // File I/O implementation
        String inputString = // Read input string from file
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        fileStorage.write(encodedString);
    }

    public void encodeBasedOnNetworkAndDatabase() throws IOException {
        // Network and Database implementation
        String inputString = // Read input string from network
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        databaseStorage.write(encodedString);
    }
}
