package com.directi.training.dip.exercise_refractored;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

public class MyDatabase implements IDataWriter
{
    private static Map<Integer, String> _data = new HashMap<>();
    private static int _count = 0;

    @Override
    public int writeData(String inputString) throws IOException
    {
        _data.put(++_count, inputString);
        return _count;
    }
}
