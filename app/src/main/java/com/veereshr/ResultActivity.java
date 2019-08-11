package com.veereshr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.sql.SQLData;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        LinearLayout error = findViewById(R.id.error);
        LinearLayout correct = findViewById(R.id.correct);
        TextView name = findViewById(R.id.name);
        TextView balance = findViewById(R.id.balance);
        TextView company = findViewById(R.id.company);
        String[] data = intent.getStringArrayExtra(MainActivity.MESSAGE_NAME);
        if((data[0]==null) || (data[0]=="")){
           error.setVisibility(View.VISIBLE);
           correct.setVisibility(View.INVISIBLE);
        }
        name.setText(data[0]);
        balance.setText(data[1]);
        company.setText(data[2]);
    }

    public void OpenMain(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
