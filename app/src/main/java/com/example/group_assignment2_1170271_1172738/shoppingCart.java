package com.example.group_assignment2_1170271_1172738;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class shoppingCart extends AppCompatActivity {
    public  static int i;
    String split1[];
    String sf="\n=====================================\n\t\t\t\t\t\t\t                        ORDERS\n=====================================\n";
    double totalPrice=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);
        //TextView before = (TextView) findViewById(R.id.textView5);

        Intent intent = getIntent();
        String s = intent.getStringExtra("S1");
        if (s.equalsIgnoreCase("s1s2s3"))
            s = "";
        else
            s = s.replaceAll("s1s2s3", "");
        ArrayList<gymItem> gymItems = new ArrayList<gymItem>();
        if (s.isEmpty()) {
            Toast.makeText(this, "Cart Is Empty", Toast.LENGTH_SHORT).show();
        } else {
            split1 = s.split("!");
            for (int i = 0; i < split1.length; i++) {
                String split2[] = split1[i].trim().split("@");
                gymItems.add(new gymItem(split2[1], split2[2], Integer.parseInt(split2[0]), Double.parseDouble(split2[4]), Double.parseDouble(split2[3])));
           totalPrice+=gymItems.get(i).getPrice();
                sf=sf+("\t\t"+(i+1)+") Name: "+gymItems.get(i).getName()+"\n\t\t\t\t\tPrice: "+gymItems.get(i).getPrice()+" $"+"\n=====================================\n");
            }

        }
        if (s!="") {
            RecyclerView recycler = findViewById(R.id.rv2);
            String[] names = new String[split1.length];
            String[] descriptions = new String[split1.length];
            int[] ids = new int[split1.length];
            double[] prices = new double[split1.length];
            double[] ratings = new double[split1.length];
            for (int i = 0; i < names.length; i++) {
                names[i] = gymItems.get(i).getName();
                ids[i] = gymItems.get(i).getImageID();
                descriptions[i] = gymItems.get(i).getDescription();
                prices[i] = gymItems.get(i).getPrice();
                ratings[i] = gymItems.get(i).getRating();

            }
            recycler.setLayoutManager(new GridLayoutManager(this, 2));
            CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(names, ids, descriptions, prices, ratings, this);
            recycler.setAdapter(adapter);

        }
    }



    public void show(View view) {
        Intent intent = new Intent(this, Purchase.class);
        intent.putExtra("TP",totalPrice);
        intent.putExtra("SF",sf);
        startActivity(intent);
    }
}