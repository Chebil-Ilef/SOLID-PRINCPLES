package com.directi.training.dip.exercise_refractored;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule {
    private final IDataReader dataReader;
    private final IDataWriter dataWriter;
    
    public EncodingModule(IDataReader dataReader, IDataWriter dataWriter) {
        this.dataReader = dataReader;
        this.dataWriter = dataWriter;
    }

    public void encode() throws IOException {
        String inputData = dataReader.readData();
        String encodedData = Base64.getEncoder().encodeToString(inputData.getBytes());
        dataWriter.writeData(encodedData);
    }
}