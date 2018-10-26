package com.alena.univer2;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt, bt2;
    TextView tv, tv2;
    CheckBox cb;
    ImageButton ib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (Button) findViewById(R.id.bt);
        bt2 = (Button) findViewById(R.id.bt2);
        tv = (TextView) findViewById(R.id.tv);
        cb = (CheckBox) findViewById(R.id.cb);
        tv2 = (TextView) findViewById(R.id.tv2);
        ib = (ImageButton) findViewById(R.id.ib);

        bt.setOnClickListener(this);
        cb.setOnClickListener(this);
        bt2.setOnClickListener(this);
        ib.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt: {
                tv.setText(R.string.TextView2);
                break;
            }
            case R.id.cb: {
                if (cb.isChecked()) {
                    tv2.setText(R.string.TextView2);
                }
                else {
                    tv2.setText(R.string.TextViewUndo);
                }
                break;
            }
            case R.id.bt2: {
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.ib: {
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
            }
            default: break;
        }
    }
}
