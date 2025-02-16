package com.directi.training.dip.exercise_refractored;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException
    {

        String protocol="http";
        String host="myfirstappwith.appspot.com";
        String file="/index.html";
        IDataWriter database = new MyDatabase();
        IDataWriter outputFile = new File("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        IDataReader inputFile= new File("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        IDataReader networkReader= new NetworkReader(protocol, host,file);
        EncodingModule encodingWithFiles = new EncodingModule(inputFile,outputFile);
        EncodingModule encodingBasedOnNetworkAndDatabase = new EncodingModule(networkReader,database);

        encodingWithFiles.encode();
        encodingBasedOnNetworkAndDatabase.encode();
    }
}