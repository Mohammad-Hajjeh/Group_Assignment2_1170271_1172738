package com.example.group_assignment2_1170271_1172738;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Purchase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase);
        TextView before = (TextView) findViewById(R.id.textView50);
        TextView after = (TextView) findViewById(R.id.textView60);
        TextView sft = (TextView) findViewById(R.id.textView20);
        double price = 0;
        double priceTax;
        String sf;
        Intent intent=getIntent();
        price=intent.getDoubleExtra("TP",0.0);
        priceTax=price+(price*0.14);
        sf=intent.getStringExtra("SF");
        sft.setMovementMethod(new ScrollingMovementMethod());
        sft.setText(sf);
        before.setText(Math.round(price*100.0)/100.0+" $");
        after.setText(Math.round(priceTax*100.0)/100.0+" $");


    }


}