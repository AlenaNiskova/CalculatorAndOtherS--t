package com.alena.univer2;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    Button bt3, bt4, bt5;
    TextView textView;
    ImageView iv;
    int[] images = new int[4];
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        textView = (TextView) findViewById(R.id.textView);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt5 = (Button) findViewById(R.id.bt5);
        iv = (ImageView) findViewById(R.id.iv);

        images[0] = R.drawable.image;
        images[1] = R.drawable.image1;
        images[2] = R.drawable.image2;
        images[3] = R.drawable.image3;

        a = images[0];

        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        iv.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt3: {
                textView.setText(R.string.ChangedBy3);
                a = images[1];
                iv.setImageResource(a);
                break;
            }
            case R.id.bt4: {
                textView.setText(R.string.ChangedBy4);
                a = images[2];
                iv.setImageResource(a);
                break;
            }
            case R.id.bt5: {
                textView.setText(R.string.ChangedBy5);
                a = images[3];
                iv.setImageResource(a);
                break;
            }
            case R.id.iv: {
                for (int i=0; i<images.length; i++) {
                    if (a == images[i]) {
                        if (i!=images.length-1) { a = images[i + 1]; }
                        else { a = images[0]; }
                        break;
                    }
                }
                iv.setImageResource(a);
                break;
            }
            default: break;
        }
    }
}
