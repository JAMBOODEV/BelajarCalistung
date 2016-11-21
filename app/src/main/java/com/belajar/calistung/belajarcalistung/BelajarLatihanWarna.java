package com.belajar.calistung.belajarcalistung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.belajar.calistung.belajarcalistung.picture.KuisWarna;
import com.belajar.calistung.belajarcalistung.picture.KuisWarna;

public class BelajarLatihanWarna extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_belajar_latihan_warna);
    }

    public void bukabelajarwarna(View view) {
        Intent intent = new Intent(BelajarLatihanWarna.this, MengenalWarna.class);
        startActivity(intent);
        finish();
    }

    public void bukalatihanwarna(View vew) {
        Intent intent = new Intent(BelajarLatihanWarna.this, KuisWarna.class);
        startActivity(intent);
        finish();
    }
    public void kembali (View view){
        Intent intent = new Intent (BelajarLatihanWarna.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
