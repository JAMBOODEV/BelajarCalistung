package com.belajar.calistung.belajarcalistung;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.belajar.calistung.belajarcalistung.audio.Audio;
import com.belajar.calistung.belajarcalistung.test.Level;

public class LatihanHuruf extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_latihan_huruf);
    }

    public void bukalatihan(View view) {
        Intent intent = new Intent(LatihanHuruf.this, Audio.class);
        startActivity(intent);
        finish();

    }

    public void bukabelajar(View view) {
        Intent intent = new Intent(LatihanHuruf.this, BelajarBaca.class);
        startActivity(intent);
    }
    public void kembali (View view){
        Intent intent = new Intent (LatihanHuruf.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
