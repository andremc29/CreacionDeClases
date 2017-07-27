package com.example.hp.creaciondeclases;

import android.util.Log;

/**
 * Created by HP on 26-07-2017.
 */

public class Dog {
    private int legs;
    private String dogbreed;
    private boolean adopted;

    public Dog(int legs, String dogbreed, boolean adopted) {
        this.legs = legs;
        this.dogbreed = dogbreed;
        this.adopted = adopted;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getDogbreed() {
        return dogbreed;
    }

    public void setDogbreed(String dogbreed) {
        this.dogbreed = dogbreed;
    }

    public boolean isAdopted() {
        return adopted;
    }

    public void setAdopted(boolean adopted) {
        this.adopted = adopted;
    }

    public Dog() {
    }
    public void barking(){

        Log.d("EX2","WOOOF WOOF WOOF")
    }
}
