package com.example.treetha.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;


public class MainActivity extends Activity {

    EditText c_text = null;
    EditText f_text = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c_text = (EditText) findViewById(R.id.c_text);

        f_text = (EditText) findViewById(R.id.f_text);
        c_text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(c_text.hasFocus())
                {
                    double d = 0;
                    try {
                        d = Double.valueOf(String.valueOf(c_text.getText()));
                    }
                    catch (Exception e) {
                        d = 0;
                    }
                    double c = d * 9.0 / 5.0 + 32;
                    f_text.setText(String.valueOf(c));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });

        f_text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (f_text.hasFocus())
                {
                    double d = 0;
                    try {
                        d = Double.valueOf(String.valueOf(f_text.getText()));
                    }
                    catch (Exception e) {
                        d = 0;
                    }
                    double f = (d- 32.0)*5.0/9.0;
                    c_text.setText(String.valueOf(f));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

}
