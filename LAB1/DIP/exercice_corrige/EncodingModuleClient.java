package com.directi.training.dip.exercise;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        DataStorage fileStorage = new FileDataStorage();
        DataStorage databaseStorage = new DatabaseDataStorage();
        EncodingModule encodingModule = new EncodingModule(fileStorage, databaseStorage);
        encodingModule.encodeWithFiles();
        encodingModule.encodeBasedOnNetworkAndDatabase();
    }
}