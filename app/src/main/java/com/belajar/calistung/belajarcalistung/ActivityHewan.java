package com.belajar.calistung.belajarcalistung;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.belajar.calistung.belajarcalistung.picture.KuisHewan;

public class ActivityHewan extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_hewan);
    }
    public void bukamengenalhewan(View view){
        Intent intent = new Intent(ActivityHewan.this, MengenalHewan.class);
        startActivity(intent);
    }
    public void bukakuishewan(View view){
        Intent intent = new Intent(ActivityHewan.this, KuisHewan.class);
        startActivity(intent);
    }
    public void kembali(View view){
        Intent intent = new Intent (ActivityHewan.this, MainActivity.class);
        startActivity(intent);
    }
}
