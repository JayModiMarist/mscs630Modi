package com.example.edstravelingbarbershop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;
    private Button scheduleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openAboutUsActivity();
            }
        });

        button2 = (Button) findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLocationActivity();
            }
        });
    }


    private void openLocationActivity() {
        Intent intent = new Intent (this, LocationActivity.class);
        startActivity(intent);
    }

    private void openAboutUsActivity() {
        Intent intent = new Intent(this, AboutUsActivity.class);
        startActivity(intent);
    }
}
