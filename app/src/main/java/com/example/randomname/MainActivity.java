package com.example.randomname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView2 = (TextView)findViewById(R.id.name_textview2);
        final Button button_gen =  (Button)findViewById(R.id.button_gen);

        button_gen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String[] names =  {"Raghav", "abhimanyu", "aryan", "bhati", "manoj"};
                Random rand = new Random();
                int n;
                n = rand.nextInt(names.length -1);
                textView2.setText(names[n]);

            }         });

    }
}
