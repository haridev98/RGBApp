package com.hd.rgbapp;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView o;
     View d;
    Button b1,b2,b3,b4;  int b = 0; int g =0; int r=0; int k=0;
    SharedPreferences data;
    public static String filename = "RGB_data";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        data = getSharedPreferences(filename, 0);
        d= this.getWindow().getDecorView();
        o = (TextView)findViewById(R.id.ram);
        b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener(this);
        b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(this);
        b3 = (Button)findViewById(R.id.button3);
        b3.setOnClickListener(this);
        b4 = (Button)findViewById(R.id.button4);
        b4.setOnClickListener(this);
         o.setTextColor(Color.MAGENTA);
        r= data.getInt("r", 0);
        g= data.getInt("g", 0);
        b= data.getInt("b",0);
        d.setBackgroundColor(Color.rgb(r,g,b));
        o.setText("RGB VALues: R:"+r+"\tG:"+g+"\tB:"+b);




    }



    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button) {
            b += 50;
            if (b > 255)
                b = 0;

        }
        if(v.getId()==R.id.button2) {
            g+=50;
            if (g > 255)
                g = 0;

        }
        if(v.getId()==R.id.button3) {
            r+=50;
            if (r > 255)
                r = 0;

        }
        if (v.getId()==R.id.button4)
        {   r=0; g=0; b=0; }
        d.setBackgroundColor(Color.rgb(r,g,b));
        o.setText("RGB VALues: R:"+r+"\tG:"+g+"\tB:"+b);

    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences.Editor editor = data.edit();
        editor.putInt("r", r).apply();
        editor.putInt("b", b).apply();
        editor.putInt("g", g).apply();

    }
}
