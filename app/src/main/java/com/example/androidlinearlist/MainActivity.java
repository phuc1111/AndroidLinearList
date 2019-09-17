package com.example.androidlinearlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] name = new String[]{"lan", "Huong", "Nam"};
        TextView[] tv = new TextView[3];

        for(int i = 0; i< name.length ; i++){
            tv[i] = new TextView(MainActivity.this); //new text view
            tv[i].setText(name[i]); //set text for text view

            Button bt = new Button(MainActivity.this);
            bt.setText("Adc");



            LinearLayout child = new LinearLayout(MainActivity.this);
            child.setOrientation(LinearLayout.HORIZONTAL);

            child.addView(tv[i]);
            child.addView(bt);
            LinearLayout main = findViewById(R.id.main); //find linearLayout
            main.addView(child); //add text view for linearLayout

            LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    1.0f
            );
            tv[i].setLayoutParams(param);
        }
    }
}
