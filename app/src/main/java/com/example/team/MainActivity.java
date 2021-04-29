package com.example.team;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    Button android,web,hack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.t1);
        android= findViewById(R.id.android);
        web=findViewById(R.id.web);
        hack=findViewById(R.id.hack);

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent i=new Intent(getApplicationContext(),Main3Activity.class);
                    startActivity(i);
            }
        });

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent i=new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(i);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        hack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Main4Activity.class);
                startActivity(i);
            }
        });
    }
}
