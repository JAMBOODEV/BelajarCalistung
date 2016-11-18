package com.belajar.calistung.belajarcalistung;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class mengenal_angka extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_mengenal_angka);
    }
    public void bukamengenalangka(View view){
        Intent intent = new Intent(mengenal_angka.this, BelajarHitung.class);
        startActivity(intent);
    }
    public void bukalatihanangka(View view){
        Intent intent = new Intent(mengenal_angka.this, TebakAngka.class);
        startActivity(intent);
    }
    public void kembali(View view){
        Intent intent = new Intent (mengenal_angka.this, MainActivity.class);
        startActivity(intent);
    }
}
