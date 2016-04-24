package com.trial.chiutsui.doggydogworld;

import android.util.Log;

/**
 * Created by chiutsui on 4/23/16.
 */
public class Dog {
    private String name;
    private int age;
    private int numberOfLegs = 4;
    private String breed;

    Dog(String name) {
        this.name=name;
    }

    public void barkedAt(String victim) {
        Log.d("Dog",name+" barked at "+victim);
    }
}
