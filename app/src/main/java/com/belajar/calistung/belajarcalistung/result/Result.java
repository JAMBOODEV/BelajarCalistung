package com.belajar.calistung.belajarcalistung.result;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.belajar.calistung.belajarcalistung.LatihanHuruf;
import com.belajar.calistung.belajarcalistung.MainActivity;
import com.belajar.calistung.belajarcalistung.beginners.Beginners;
import com.belajar.calistung.belajarcalistung.test.Level;
import com.belajar.calistung.belajarcalistung.R;
/*import com.gilpix.beginners.Beginners;
import com.gilpix.test.Level;
import com.gilpix.test.R;*/
//2011141871 Ryo Sutrisno
public class Result extends Beginners {


    public int correct1;
    public TextView t1, marks, result;
    public ImageView img;


    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.result);


        result = (TextView) findViewById(R.id.text1);
        marks = (TextView) findViewById(R.id.text2);
        t1 = (TextView) findViewById(R.id.text3);
        ;
        img = (ImageView) findViewById(R.id.imageView1);

        Bundle b = this.getIntent().getExtras();
        // String[] array=b.getStringArray("mes");
        String recive = getIntent().getStringExtra("string");

//2011141871 Ryo Sutrisno
        int point = Integer.parseInt(recive);
        //t1.setText(recive);
        marks.setText(recive + " " + "JAWABAN YANG BENAR");
        //result.setText(rec.toString());
        if (point == 9) {
            img.setBackgroundResource(R.drawable.excelent);
            t1.setText("LUAR BIASA!");
        }
        if (point > 8 && point <= 9) {
            img.setBackgroundResource(R.drawable.good);
            t1.setText("BAIK");
        }
        if (point > 3 && point <= 8) {
            img.setBackgroundResource(R.drawable.average);
            t1.setText("CUKUP");
        }
        if (point <= 3) {
            t1.setText("KURANG BAIK");
            img.setBackgroundResource(R.drawable.poor);
        }

        int[] ques = {R.drawable.poor, R.drawable.average, R.drawable.good, R.drawable.excelent};


        ///////////////////////////////////////////////////////////
        final View Button = findViewById(R.id.home);
        Button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Result.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
        builder.setMessage("Yakin ingin keluar?").setCancelable(
                false).setPositiveButton("Ya",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Result.this.finish();
                        Intent intent = new Intent(Result.this, MainActivity.class);
                        startActivity(intent);

                    }
                }).setNegativeButton("Batal",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.level, menu);
        return true;
    }
//2011141871 Ryo Sutrisno

}
//2011141871 Ryo Sutrisno


