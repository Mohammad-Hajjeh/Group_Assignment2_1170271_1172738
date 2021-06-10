package com.example.group_assignment2_1170271_1172738;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import static androidx.core.content.ContextCompat.startActivity;

public class CaptionedImagesAdapter
        extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder> {

    private String[] captions;
    private int[] imageIds;
    private String[] descriptions;
    private double[] prices;
    private double[] ratings;
    MainActivity mainActivity;
    shoppingCart shoppingCart;
    String s;

    public CaptionedImagesAdapter(String[] captions, int[] imageIds, String[] descriptions, double[] prices, double[] ratings, MainActivity mainActivity,String s) {
        this.captions = captions;
        this.imageIds = imageIds;
        this.descriptions = descriptions;
        this.prices = prices;
        this.ratings = ratings;
        this.mainActivity = mainActivity;
        this.s=s;

    }
    public CaptionedImagesAdapter(String[] captions, int[] imageIds, String[] descriptions, double[] prices, double[] ratings, shoppingCart shoppingCart) {
        this.captions = captions;
        this.imageIds = imageIds;
        this.descriptions = descriptions;
        this.prices = prices;
        this.ratings = ratings;
        this.shoppingCart=shoppingCart;


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card,
                parent,
                false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.item_image);
        Drawable dr = ContextCompat.getDrawable(cardView.getContext(), imageIds[position]);
        imageView.setImageDrawable(dr);
        TextView nametxt = (TextView) cardView.findViewById(R.id.item_name);
        nametxt.setText(captions[position]);
        TextView pricetxt = (TextView) cardView.findViewById(R.id.price);
        pricetxt.setText(String.valueOf(prices[position]));
        TextView ratingtxt = (TextView) cardView.findViewById(R.id.rating);
        ratingtxt.setText(String.valueOf(ratings[position]));
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainActivity, ItemDescription.class);
                intent.putExtra("ID", imageIds[position]);
                intent.putExtra("name", captions[position]);
                intent.putExtra("price", prices[position]);
                intent.putExtra("rate", ratings[position]);
                intent.putExtra("desc", descriptions[position]);
                intent.putExtra("S",s);
                v.getContext().startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return captions.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;

        public ViewHolder(CardView cardView) {
            super(cardView);
            this.cardView = cardView;
        }

    }
}

