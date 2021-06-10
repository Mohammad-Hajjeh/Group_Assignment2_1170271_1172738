package com.example.group_assignment2_1170271_1172738;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ItemDescription extends AppCompatActivity {
    int image;
    String name;
    String desc;
    double rate;
    double price;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_description);
        ImageView itemImage = findViewById(R.id.iv_itemImage);
        TextView itemName=findViewById(R.id.tv_name);
        TextView itemPrice=findViewById(R.id.tv_price);
        TextView itemRate=findViewById(R.id.tv_rate);
        TextView itemDesc=findViewById(R.id.tv_description);
        Intent intent = getIntent();
         image = intent.getIntExtra("ID", R.drawable.ic_launcher_background);
         name = intent.getStringExtra("name");
         desc = intent.getStringExtra("desc");
         rate=intent.getDoubleExtra("rate",0.0);
         price=intent.getDoubleExtra("price",0.0);
         s=intent.getStringExtra("S");
        itemImage.setBackgroundResource(image);
        itemName.setText(name);
        itemDesc.setText(desc);
        itemRate.setText(String.valueOf(rate)+"⭐");
        itemPrice.setText(String.valueOf(price)+"💲");

    }

    public void onclick_buy(View view) {
        Intent intent = new Intent(ItemDescription.this, MainActivity.class);
            intent.putExtra("STRING",s+image+"@"+name+"@"+desc+"@"+rate+"@"+price+"!");
        startActivity(intent);
    }
}