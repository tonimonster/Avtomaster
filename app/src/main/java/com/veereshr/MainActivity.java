package com.veereshr;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public final static String MESSAGE_NAME = "MESSAGE_NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ParserString (String data){

        String[] result = data.split("\n");
        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra(MESSAGE_NAME,result);
        startActivity(intent);
    }
}