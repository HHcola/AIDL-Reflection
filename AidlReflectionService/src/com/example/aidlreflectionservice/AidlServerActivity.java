package com.example.aidlreflectionservice;

import android.app.Activity;
import android.os.Bundle;

public class AidlServerActivity extends Activity{

    public  final static String SER_KEY = "com.tutor.objecttran.ser";  
    public  final static String PAR_KEY = "com.tutor.objecttran.par";  
    public void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_main);     
    }  
}
