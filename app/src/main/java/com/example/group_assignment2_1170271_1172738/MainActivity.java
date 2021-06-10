package com.example.group_assignment2_1170271_1172738;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        s = intent.getStringExtra("STRING");
        if(s==null)
            s="s1s2s3";
        RecyclerView recycler = findViewById(R.id.itemsRv);
        String[] names = new String[gymItem.items.length];
        String[] descriptions = new String[gymItem.items.length];
        int[] ids = new int[gymItem.items.length];
        double [] prices=new double[gymItem.items.length];
        double[]ratings=new double[gymItem.items.length];
        for(int i = 0; i<names.length;i++){
            names[i] = gymItem.items[i].getName();
            ids[i] = gymItem.items[i].getImageID();
            descriptions[i]=gymItem.items[i].getDescription();
            prices[i]=gymItem.items[i].getPrice();
            ratings[i]=gymItem.items[i].getRating();
        }
        recycler.setLayoutManager(new GridLayoutManager(this,2));
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(names, ids,descriptions,prices,ratings,this,s);
        recycler.setAdapter(adapter);
    }

    public void onClick_toShoppingCart(View view) {
        Intent intent = new Intent(this, shoppingCart.class);
        intent.putExtra("S1",s);
        startActivity(intent);
    }
}