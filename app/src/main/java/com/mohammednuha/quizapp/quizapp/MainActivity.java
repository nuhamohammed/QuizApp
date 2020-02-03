package com.mohammednuha.quizapp.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button submitButton;//use Alt+Enter to auto-import Button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitButton = findViewById(R.id.clickButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = getString(R.string.button_greeting);
                System.out.println(str);
                Log.i("testButton",str);
            }
        });
    }
}
