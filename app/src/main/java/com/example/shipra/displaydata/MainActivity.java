package com.example.shipra.displaydata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_tx;
    Button bt;
    TextView display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_tx=(EditText)findViewById(R.id.edit1);
        bt=(Button)findViewById(R.id.btn);
        display=(TextView)findViewById(R.id.dis);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                display.setText(et_tx.getText().toString());

            }
        });


    }
}
