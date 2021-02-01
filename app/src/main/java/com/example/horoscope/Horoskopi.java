package com.example.horoscope;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Horoskopi extends AppCompatActivity {


    public void onScorpioBtn(View view){
        Intent MainActivityIntent = new Intent(this,scorpio.class);
        startActivity(MainActivityIntent);
    }
    public void onAriesBtn(View view){
        Intent MainActivityIntent = new Intent(this,aries.class);
        startActivity(MainActivityIntent);
    }
    public void onGeminiBtn(View view){
        Intent MainActivityIntent = new Intent(this,gemini.class);
        startActivity(MainActivityIntent);
    }
    public void onLibraBtn(View view){
        Intent MainActivityIntent = new Intent(this,libra.class);
        startActivity(MainActivityIntent);
    }
    public void onVirgoBtn(View view){
        Intent MainActivityIntent = new Intent(this,virgo.class);
        startActivity(MainActivityIntent);
    }
    public void onTaurusBtn(View view){
        Intent MainActivityIntent = new Intent(this,taurus.class);
        startActivity(MainActivityIntent);
    }



    public void onPiscesBtn(View view){
        Intent MainActivityIntent = new Intent(this,pisces.class);
        startActivity(MainActivityIntent);
    }



    public void onCancerBtn(View view){
        Intent MainActivityIntent = new Intent(this,cancer.class);
        startActivity(MainActivityIntent);
    }
    public void onAquariusBtn(View view){
        Intent MainActivityIntent = new Intent(this,aquarius.class);
        startActivity(MainActivityIntent);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horoskopi);
    }
}