package com.hackingbuzz.customfontproject;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView v1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v1 = (TextView) findViewById(R.id.text1);
        TextView v2 = (TextView) findViewById(R.id.textView);
        TextView v3 = (TextView ) findViewById(R.id.textView2);

       Typeface  myCustomFont= Typeface.createFromAsset(getAssets(), "fonts/post rock.ttf");

        Typeface myCustomFont2= Typeface.createFromAsset(getAssets(), "fonts/painting the light.ttf");
        Typeface myCustomFont3 = Typeface.createFromAsset(getAssets(), "fonts/bunga melati putih.ttf");
        v1.setTypeface(myCustomFont);
        v2.setTypeface(myCustomFont2);
        v3.setTypeface(myCustomFont3);

    }
}
