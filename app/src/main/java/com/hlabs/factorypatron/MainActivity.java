package com.hlabs.factorypatron;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.texviewPruebaFactory);

        BreadFactory breadFactory = new BreadFactory();
        Bread bread = breadFactory.getBread("BAG");

        textView.setText(new StringBuilder().append(bread.name()).append(breadFactory.getBread("ROL").name()).append(breadFactory.getBread("SLI").name()));

    }
}
