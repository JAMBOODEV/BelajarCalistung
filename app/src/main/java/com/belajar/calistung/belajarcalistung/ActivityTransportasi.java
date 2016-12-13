package com.belajar.calistung.belajarcalistung;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.belajar.calistung.belajarcalistung.picture.KuisHewan;
import com.belajar.calistung.belajarcalistung.picture.KuisTransportasi;

public class ActivityTransportasi extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_transportasi);
    }
    public void mengenaltransportasi(View view){
        Intent intent = new Intent(ActivityTransportasi.this, MengenalTransportasi.class);
        startActivity(intent);
    }
    public void bukakuistransportasi(View view){
        Intent intent = new Intent(ActivityTransportasi.this, KuisTransportasi.class);
        startActivity(intent);
    }
    public void kembali(View view){
        Intent intent = new Intent (ActivityTransportasi.this, MainActivity.class);
        startActivity(intent);

    }
}
