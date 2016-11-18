package com.belajar.calistung.belajarcalistung;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class HelpActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_help);
    }

    public void kembali(View view) {
        Intent intent = new Intent(HelpActivity.this, MainActivity.class);
        startActivity(intent);
    }
    public void helpangka(View view){
        Intent intent = new Intent(HelpActivity.this, HelpAngka.class);
        startActivity(intent);
    }
    public void helphuruf(View view){
        Intent intent = new Intent(HelpActivity.this, HelpHuruf.class);
        startActivity(intent);
    }
    public void helpwarna(View view){
        Intent intent = new Intent(HelpActivity.this, HelpWarna.class);
        startActivity(intent);
    }
}
