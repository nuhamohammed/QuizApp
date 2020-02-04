package com.mohammednuha.quizapp.quizapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button submitButton;//use Alt+Enter to auto-import Button
    private Button  colorButton;
    EditText responseText;
    TextView numberText;
    TextView displayText;
    private int  counter=0;

    public int getRandomColor(){
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }
    public void changeColor(View view){
        colorButton.setBackgroundColor(getRandomColor());
        counter+=1;
        numberText.setText(counter+"");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberText=findViewById(R.id.numberText);
        displayText=findViewById(R.id.textBox);
        responseText=findViewById(R.id.responseEditText);
        submitButton = findViewById(R.id.clickButton);
        colorButton = findViewById(R.id.colorbtn);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = getString(R.string.button_greeting);
                System.out.println(str);
                Log.i("testButton",str);
               // displayText.setText(displayText.getText().toString()+" "+responseText.getText().toString());
                displayText.setText("Hi "+responseText.getText().toString()+"!");
            }
        });
        responseText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus){
                    if(responseText.getText().toString().equals("TJ")){
                        displayText.setText("TJ Rocks!");
                        responseText.setText("");
                        responseText.setHint("That's a good name.");
                    }
                }
            }
        });
    }
}
