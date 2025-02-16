package com.directi.training.dip.exercise_refractored;

import java.io.IOException;

public interface IDataWriter {
    int writeData(String inputString) throws IOException;

}