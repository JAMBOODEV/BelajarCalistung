package com.belajar.calistung.belajarcalistung;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       /* getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);*/
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);}
        public boolean onKeyDown(int keyCode, KeyEvent event) {
            if (keyCode == KeyEvent.KEYCODE_BACK) {
                exitByBackKey();

                //moveTaskToBack(false);
                return true;
            }
            return super.onKeyDown(keyCode, event);
        }

    //untuk membuka aactivity
    public void sendMessage(View view)
    {
        Intent intent = new Intent(MainActivity.this, BelajarLatihanWarna.class);
        startActivity(intent);
    }
    ///////////////
    public void menuhitung(View view)
    {
        Intent intent = new Intent(MainActivity.this, mengenal_angka.class);
        startActivity(intent);
    }
public void bukabaca(View view){
    Intent intent = new Intent(MainActivity.this, LatihanHuruf.class);
    startActivity(intent);
}
    public void bukaabout(View view){
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }
    public void bukahelp (View view){
        Intent intent = new Intent(MainActivity.this, HelpActivity.class);
        startActivity(intent);
    }
    public void bukahewan(View view){
        Intent intent = new Intent(MainActivity.this, ActivityHewan.class);
        startActivity(intent);
    }
    public void bukatransportasi(View view){
        Intent intent = new Intent (MainActivity.this, ActivityTransportasi.class);
        startActivity(intent);
    }
        protected void exitByBackKey() {

            AlertDialog alertbox = new AlertDialog.Builder(this)
                    .setMessage("Ingin keluar dari Aplikasi?")
                    .setPositiveButton("YA", new DialogInterface.OnClickListener() {
                        //membuat tombol pilihan
                        // do something when the button is clicked
                        public void onClick(DialogInterface arg0, int arg1) {

                            finish();
                            //close();
                            //tutup


                        }
                    })
                    .setNegativeButton("TIDAK", new DialogInterface.OnClickListener() {

                        // do something when the button is clicked
                        //saat tombol di klik
                        public void onClick(DialogInterface arg0, int arg1) {
                        }
                    })
                    .show();

        }
    }

