package com.bignerdranch.android.stopwatchplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button submit_button;
    private TextView answer_box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set components - start
        //probability_input = (EditText) findViewById(R.id.edit_probability);
        //projected_return_input = (EditText) findViewById(R.id.edit_return);
        //calculate_button = (Button) findViewById(R.id.calculate_button);
        submit_button = (Button) findViewById(R.id.submit_button);
        answer_box = (TextView) findViewById(R.id.answer_box);
        //set components - end
    }
}
