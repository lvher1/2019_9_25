package com.example.mynewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText idd,pww;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        idd = findViewById(R.id.userid);
        pww = findViewById(R.id.userpw);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intent);
                finish();*/
                if(idd.getText().toString().equals("lvher")&&pww.getText().toString().equals("lee")){
                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                    startActivity(intent);
                    finish();
                }
                else{
                    //Toast.makeText(context: Main2Activity.this.text:"id or passwd error occured".Toast.LENGTH_LONG).show();
                    //Toast.makeText( context: Main2Activity.this.text:"id or pwd error",Toast.LENGTH_LONG).show();
                    Toast.makeText(Main2Activity.this,"id or pwd error occured",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
