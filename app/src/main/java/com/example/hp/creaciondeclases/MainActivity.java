package com.example.hp.creaciondeclases;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Dog pocker = new Dog();
        pocker.setLegs(4);
        pocker.setDogbreed("Labrador");
        pocker.setAdopted(true);
        pocker.barking();
        Dog lazzy = new Dog(4,"PastorIngles",true);
        Log.d("EX3",lazzy.getDogbreed());
    }
    private Dog Example(){
        Dog bobby = new Dog(3,"PastorChileno",true);
        return bobby;
    }
}
