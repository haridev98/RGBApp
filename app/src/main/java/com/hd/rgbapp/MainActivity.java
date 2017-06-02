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
    String text = "RGB Value";
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

        d.setBackgroundColor(Color.rgb(0,0,0));
        k= data.getInt("key", 0);
        switch (k) {
            case 1:
                d.setBackgroundColor(Color.rgb(0, 0, 50));
                text = "Blue Value = 50";
                break;
            case 2:
                d.setBackgroundColor(Color.rgb(0, 0, 100));
                text = "Blue Value = 100";
                break;
            case 3:
                d.setBackgroundColor(Color.rgb(0, 0, 150));
                text = "Blue Value = 150";
                break;
            case 4:
                d.setBackgroundColor(Color.rgb(0, 0, 200));
                text = "Blue Value = 200";
                break;
            case 5:
                d.setBackgroundColor(Color.rgb(0, 0, 255));
                text = "Blue Value = 255";
                break;
            case 6:
                d.setBackgroundColor(Color.rgb(0, 50, 0));
                text = "Green Value = 50";
                break;
            case 7:
                d.setBackgroundColor(Color.rgb(0, 100, 0));
                text = "Green Value = 100";
                break;


            case 8:
                d.setBackgroundColor(Color.rgb(0, 150, 0));
                text = "Green Value = 150";

                break;
            case 9:
                d.setBackgroundColor(Color.rgb(0, 200, 0));
                text = "Green Value = 200";

                break;
            case 10:
                d.setBackgroundColor(Color.rgb(0, 255, 0));
                text = "Green Value = 255";
                break;
            case 11:
                d.setBackgroundColor(Color.rgb(50, 0, 0));
                text = "Red Value = 50";
                break;
            case 12:
                d.setBackgroundColor(Color.rgb(100, 0, 0));
                text = "Red Value = 100";
                break;
            case 13:
                d.setBackgroundColor(Color.rgb(150, 0, 0));
                text = "Red Value = 150";
                break;
            case 14:
                d.setBackgroundColor(Color.rgb(200, 0, 0));
                text = "Red Value = 200";
                break;
            case 15:
                d.setBackgroundColor(Color.rgb(255, 0, 0));
                text = "Red Value = 255";
                break;
        }    o.setText(text);

    }



    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button) {
            ++b;
            if (b > 5)
                b = 0;
            switch (b) {
                case 1:
                    d.setBackgroundColor(Color.rgb(0,0,50));
                    text="Blue Value = 50";
                    k=1;

                    break;
                case 2:
                    d.setBackgroundColor(Color.rgb(0,0,100));
                    text="Blue Value = 100";
                    k=2;
                    break;
                case 3:
                    d.setBackgroundColor(Color.rgb(0,0,150));
                    text="Blue Value = 150";
                    k=3;
                    break;
                case 4:
                    d.setBackgroundColor(Color.rgb(0,0,200));
                    text="Blue Value = 200";
                    k=4;
                    break;
                case 5:
                    d.setBackgroundColor(Color.rgb(0,0,255));
                    text="Blue Value = 255";
                    k=5;
                    break;
                default:
                    d.setBackgroundColor(Color.rgb(0,0,0));
                    text="RGB Value";
            }
            o.setText(text);
        }
        if(v.getId()==R.id.button2) {
            ++g;
            if (g > 5)
                g = 0;
            switch (g) {
                case 1:
                    d.setBackgroundColor(Color.rgb(0,50,0));
                    text="Green Value = 50";
                    k=6;

                    break;
                case 2:
                    d.setBackgroundColor(Color.rgb(0,100,0));
                    text="Green Value = 100";
                    k =7;
                    break;


                case 3:
                    d.setBackgroundColor(Color.rgb(0,150,0));
                    text="Green Value = 150";
                    k=8;
                    break;
                case 4:
                    d.setBackgroundColor(Color.rgb(0,200,0));
                    text="Green Value = 200";
                    k=9;
                    break;
                case 5:
                    d.setBackgroundColor(Color.rgb(0,255,0));
                    text="Green Value = 255";
                    k=10;
                    break;
                default:
                    d.setBackgroundColor(Color.rgb(0,0,0));
                    text="RGB Value";
            }
            o.setText(text);
        }
        if(v.getId()==R.id.button3) {
            ++r;
            if (r > 5)
                r = 0;
            switch (r) {
                case 1:
                    d.setBackgroundColor(Color.rgb(50,0,0));
                    text="Red Value = 50";
                    k=11;
                    break;
                case 2:
                    d.setBackgroundColor(Color.rgb(100,0,0));
                    text="Red Value = 100";
                    k=12;
                    break;
                case 3:
                    d.setBackgroundColor(Color.rgb(150,0,0));
                    text="Red Value = 150";
                    k=13;
                    break;
                case 4:
                    d.setBackgroundColor(Color.rgb(200,0,0));
                    text="Red Value = 200";
                    k=14;
                    break;
                case 5:
                    d.setBackgroundColor(Color.rgb(255,0,0));
                    text="Red Value = 255";
                    k=15;
                    break;
                default:
                    d.setBackgroundColor(Color.rgb(0,0,0));
                    text="RGB Value";
            }
            o.setText(text);
        }
        if (v.getId()==R.id.button4)
        { d.setBackgroundColor(Color.rgb(0,0,0));
            text="RGB Value";
            o.setText(text);
            r=0; g=0; b=0; k=0;}

    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences.Editor editor = data.edit();
        editor.putInt("key", k).apply();
    }
}
