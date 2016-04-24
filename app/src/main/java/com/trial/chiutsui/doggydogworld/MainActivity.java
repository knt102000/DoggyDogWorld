package com.trial.chiutsui.doggydogworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","Testing logging");

        Dog myDog = new Dog("Doge");

        Dog yourDog = new Dog("Rex");

        myDog.barkedAt("a cat");
    }
}
