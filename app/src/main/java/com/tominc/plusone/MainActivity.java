package com.tominc.plusone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText enterNum;
    Button add;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterNum = (EditText) findViewById(R.id.num);
        add = (Button) findViewById(R.id.add);
        result = (TextView) findViewById(R.id.res);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = enterNum.getText().toString();
                int n = Integer.parseInt(number);
                result.setVisibility(View.VISIBLE);
                result.setText(String.valueOf(++n));
            }
        });
    }
}
