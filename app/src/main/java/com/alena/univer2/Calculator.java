package com.alena.univer2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity implements View.OnClickListener {

    String pole;
    Button bt_0, bt_1, bt_2, bt_3, bt_4, bt_5, bt_6, bt_7, bt_8, bt_9, bt_comma, bt_equall;
    Button bt_del, bt_div, bt_mul, bt_min, bt_plu;
    TextView space, input, yota;
    boolean isComma = false;
    double dSpace, dInput, res;
    char last;
    MenuItem gt_other;

    String stInput = "";
    String stSpace = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        bt_0 = (Button) findViewById(R.id.bt_0);
        bt_1 = (Button) findViewById(R.id.bt_1);
        bt_2 = (Button) findViewById(R.id.bt_2);
        bt_3 = (Button) findViewById(R.id.bt_3);
        bt_4 = (Button) findViewById(R.id.bt_4);
        bt_5 = (Button) findViewById(R.id.bt_5);
        bt_6 = (Button) findViewById(R.id.bt_6);
        bt_7 = (Button) findViewById(R.id.bt_7);
        bt_8 = (Button) findViewById(R.id.bt_8);
        bt_9 = (Button) findViewById(R.id.bt_9);
        bt_comma = (Button) findViewById(R.id.bt_comma);
        bt_equall = (Button) findViewById(R.id.bt_equall);
        bt_del = (Button) findViewById(R.id.bt_del);
        bt_div = (Button) findViewById(R.id.bt_div);
        bt_mul = (Button) findViewById(R.id.bt_mul);
        bt_min = (Button) findViewById(R.id.bt_min);
        bt_plu = (Button) findViewById(R.id.bt_plu);
        space = (TextView) findViewById(R.id.space);
        input = (TextView) findViewById(R.id.input);
        yota = (TextView) findViewById(R.id.yota);
        gt_other = (MenuItem) findViewById(R.id.gt_other);

        bt_0.setOnClickListener(this);
        bt_1.setOnClickListener(this);
        bt_2.setOnClickListener(this);
        bt_3.setOnClickListener(this);
        bt_4.setOnClickListener(this);
        bt_5.setOnClickListener(this);
        bt_6.setOnClickListener(this);
        bt_7.setOnClickListener(this);
        bt_8.setOnClickListener(this);
        bt_9.setOnClickListener(this);
        bt_comma.setOnClickListener(this);
        bt_equall.setOnClickListener(this);
        bt_del.setOnClickListener(this);
        bt_del.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                stInput = "";
                stSpace = "";
                isComma = false;
                input.setText(stInput);
                space.setText(stSpace);
                yota.setText(R.string.yota);
                yota.setBackgroundColor(getColor(R.color.yota));
                bt_del.setText(getText(R.string.del));
                return false;
            }
        });
        bt_div.setOnClickListener(this);
        bt_mul.setOnClickListener(this);
        bt_min.setOnClickListener(this);
        bt_plu.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.gt_other: {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            }
            default: break;
        }
    }

    @Override
    public void onClick(View v) {
        yota.setText(R.string.yota);
        yota.setBackgroundColor(getColor(R.color.yota));
        switch (v.getId()) {
            case R.id.bt_0: {
                if (input.getText().toString().contains("E")) { this.onClick(findViewById(R.id.bt_del)); }
                stInput += "0";
                input.setText(stInput);
                break;
            }
            case R.id.bt_1: {
                if (input.getText().toString().contains("E")) { this.onClick(findViewById(R.id.bt_del)); }
                stInput += "1";
                input.setText(stInput);
                break;
            }
            case R.id.bt_2: {
                if (input.getText().toString().contains("E")) { this.onClick(findViewById(R.id.bt_del)); }
                stInput += "2";
                input.setText(stInput);
                break;
            }
            case R.id.bt_3: {
                if (input.getText().toString().contains("E")) { this.onClick(findViewById(R.id.bt_del)); }
                stInput += "3";
                input.setText(stInput);
                break;
            }
            case R.id.bt_4: {
                if (input.getText().toString().contains("E")) { this.onClick(findViewById(R.id.bt_del)); }
                stInput += "4";
                input.setText(stInput);
                break;
            }
            case R.id.bt_5: {
                if (input.getText().toString().contains("E")) { this.onClick(findViewById(R.id.bt_del)); }
                stInput += "5";
                input.setText(stInput);
                break;
            }
            case R.id.bt_6: {
                if (input.getText().toString().contains("E")) { this.onClick(findViewById(R.id.bt_del)); }
                stInput += "6";
                input.setText(stInput);
                break;
            }
            case R.id.bt_7: {
                if (input.getText().toString().contains("E")) { this.onClick(findViewById(R.id.bt_del)); }
                stInput += "7";
                input.setText(stInput);
                break;
            }
            case R.id.bt_8: {
                if (input.getText().toString().contains("E")) { this.onClick(findViewById(R.id.bt_del)); }
                stInput += "8";
                input.setText(stInput);
                break;
            }
            case R.id.bt_9: {
                if (input.getText().toString().contains("E")) { this.onClick(findViewById(R.id.bt_del)); }
                stInput += "9";
                input.setText(stInput);
                break;
            }
            case R.id.bt_comma: {
                if (input.getText().toString().contains("E")) { this.onClick(findViewById(R.id.bt_del)); }
                yota.setText(R.string.yota);
                yota.setBackgroundColor(getColor(R.color.yota));
                if (!isComma) {
                    isComma = true;
                    if (stInput.equals("")) {
                        stInput = "0.";
                    } else {
                        stInput += ".";
                    }
                    input.setText(stInput);
                }
                break;
            }
            case R.id.bt_equall: {
                if (stSpace.equals(""))
                {
                    if (!stInput.equals("")) {
                        stInput = input.getText().toString();
                        dInput = Double.parseDouble(stInput);
                        stInput = Double.toString(dInput);
                        input.setText(stInput);
                    }
                }
                else {
                    if (stInput.equals("")) {
                        stInput = space.getText().subSequence(0, space.getText().length()-1).toString();
                        stSpace = "";
                        dInput = Double.parseDouble(stInput);
                        stInput = Double.toString(dInput);
                        space.setText(stSpace);
                        input.setText(stInput);
                    }
                    else {
                        switch (space.getText().charAt(space.getText().length() - 1)) {
                            case '/': {
                                stInput = input.getText().toString();
                                stSpace = space.getText().subSequence(0, space.getText().length() - 1).toString();
                                dSpace = Double.parseDouble(stSpace);
                                dInput = Double.parseDouble(stInput);
                                if (dInput == 0) {
                                    yota.setText(R.string.imNull);
                                    yota.setBackgroundColor(getColor(R.color.imNull));
                                    stInput = Double.toString(dSpace);
                                    input.setText(stInput);
                                    stSpace = "";
                                    space.setText(stSpace);
                                }
                                else {
                                    res = dSpace / dInput;
                                    stInput = Double.toString(res);
                                    input.setText(stInput);
                                    stSpace = "";
                                    space.setText(stSpace);
                                }
                                break;
                            }
                            case 'x': {
                                stInput = input.getText().toString();
                                stSpace = space.getText().subSequence(0, space.getText().length() - 1).toString();
                                dSpace = Double.parseDouble(stSpace);
                                dInput = Double.parseDouble(stInput);
                                res = dSpace * dInput;
                                stInput = Double.toString(res);
                                input.setText(stInput);
                                stSpace = "";
                                space.setText(stSpace);
                                break;
                            }
                            case '-': {
                                stInput = input.getText().toString();
                                stSpace = space.getText().subSequence(0, space.getText().length() - 1).toString();
                                dSpace = Double.parseDouble(stSpace);
                                dInput = Double.parseDouble(stInput);
                                res = dSpace - dInput;
                                stInput = Double.toString(res);
                                input.setText(stInput);
                                stSpace = "";
                                space.setText(stSpace);
                                break;
                            }
                            case '+': {
                                stInput = input.getText().toString();
                                stSpace = space.getText().subSequence(0, space.getText().length() - 1).toString();
                                dSpace = Double.parseDouble(stSpace);
                                dInput = Double.parseDouble(stInput);
                                res = dSpace + dInput;
                                stInput = Double.toString(res);
                                input.setText(stInput);
                                stSpace = "";
                                space.setText(stSpace);
                                break;
                            }
                            default: {
                                space.setText("");
                                input.setText(stInput);
                                break;
                            }
                        }
                    }
                }
                break;
            }
            case R.id.bt_del: {
                if (stInput.length()!=0) {
                    if (input.getText().toString().contains("E")) {
                        stInput = "";
                        input.setText(stInput);
                        isComma = false;
                    }
                    else {
                        last = input.getText().charAt(input.getText().length() - 1);
                        if (last == '.') {
                            isComma = false;
                        }
                        stInput = input.getText().subSequence(0, input.getText().length() - 1).toString();
                        input.setText(stInput);
                        bt_del.setText(getText(R.string.del));
                    }
                }
                break;
            }
            case R.id.bt_div: {
                if (stInput.length()==0) {
                    if (stSpace.length()!=0) {
                        last = space.getText().charAt(space.getText().length() - 1);
                        if (last == '+' || last == 'x' || last == '-' || last == '+') {
                            stSpace = space.getText().subSequence(0, space.getText().length() - 1).toString();
                        }
                        stSpace = stSpace + "/";
                        space.setText(stSpace);
                    }
                }
                else {
                    if (stSpace.length()!=0) {
                        this.onClick(findViewById(R.id.bt_equall));
                    }
                    stSpace = stInput + "/";
                    stInput = "";
                    isComma = false;
                    space.setText(stSpace);
                    input.setText(stInput);
                }
                break;
            }
            case R.id.bt_mul: {
                if (stInput.length()==0) {
                    if (stSpace.length()!=0) {
                        last = space.getText().charAt(space.getText().length() - 1);
                        if (last == '+' || last == '/' || last == '-' || last == 'x') {
                            stSpace = space.getText().subSequence(0, space.getText().length() - 1).toString();
                        }
                        stSpace = stSpace + "x";
                        space.setText(stSpace);
                    }
                }
                else {
                    if (stSpace.length()!=0) {
                        this.onClick(findViewById(R.id.bt_equall));
                    }
                    stSpace = stInput + "x";
                    stInput = "";
                    isComma = false;
                    space.setText(stSpace);
                    input.setText(stInput);
                }
                break;
            }
            case R.id.bt_min: {
                if (stInput.length()==0) {
                    if (stSpace.length()!=0) {
                        last = space.getText().charAt(space.getText().length() - 1);
                        if (last == '+' || last == 'x' || last == '/' || last == '-') {
                            stSpace = space.getText().subSequence(0, space.getText().length() - 1).toString();
                        }
                        stSpace = stSpace + "-";
                        space.setText(stSpace);
                    }
                }
                else {
                    if (stSpace.length()!=0) {
                        this.onClick(findViewById(R.id.bt_equall));
                    }
                    stSpace = stInput + "-";
                    stInput = "";
                    isComma = false;
                    space.setText(stSpace);
                    input.setText(stInput);
                }
                break;
            }
            case R.id.bt_plu: {
                if (stInput.length()==0) {
                    if (stSpace.length() != 0) {
                        last = space.getText().charAt(space.getText().length() - 1);
                        if (last == '/' || last == 'x' || last == '-' || last == '+') {
                            stSpace = space.getText().subSequence(0, space.getText().length() - 1).toString();
                        }
                        stSpace = stSpace + "+";
                        space.setText(stSpace);
                    }
                }
                else {
                    if (stSpace.length()!=0) {
                        this.onClick(findViewById(R.id.bt_equall));
                    }
                    stSpace = stInput + "+";
                    stInput = "";
                    isComma = false;
                    space.setText(stSpace);
                    input.setText(stInput);
                }
                break;
            }
            default: break;
        }
        if (stInput.contains("E")) {
            bt_del.setText(getText(R.string.clr));
        } else { bt_del.setText(getText(R.string.del)); }
    }
}
