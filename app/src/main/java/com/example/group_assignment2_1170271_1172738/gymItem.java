package com.example.group_assignment2_1170271_1172738;

public class gymItem {
    private  String name;
    private String description;
    private int ImageID;
    private double price;
    private double rating;

    public gymItem(String name, String description, int imageID, double price, double rating) {
        this.name = name;
        this.description = description;
        ImageID = imageID;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageID() {
        return ImageID;
    }

    public void setImageID(int imageID) {
        ImageID = imageID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public static final gymItem[] items= {
            new gymItem("Nike Shoes", "this is the last brand new nike shoe make you comfort in the gym so you can excersize comfotably with no feets hurting any more", R.drawable.shoe2, 250, 7.5),
            new gymItem("Under Armor Shoes", "this is the last brand new  shoe make you comfort in the gym so you can excersize comfotably with no feets hurting any more", R.drawable.shoe1, 200, 8),
            new gymItem("Adidas Shoes", "this is the last brand new  shoe make you comfort in the gym so you can excersize comfotably with no feets hurting any more", R.drawable.shoe3, 180, 8.7),
            new gymItem("Ball", "this is the last brand new  shoe make you comfort in the gym so you can excersize comfotably with no feets hurting any more", R.drawable.ball, 83, 5.5),
            new gymItem("Gloves", "this is the last brand new  shoe make you comfort in the gym so you can excersize comfotably with no feets hurting any more", R.drawable.gloves2, 50, 8.3),
            new gymItem("Gloves", "this is the last brand new  shoe make you comfort in the gym so you can excersize comfotably with no feets hurting any more", R.drawable.gloves, 70, 9),
            new gymItem("5 KG Dumbbel", "this is the last brand new  shoe make you comfort in the gym so you can excersize comfotably with no feets hurting any more", R.drawable.dumbbel5kg, 55, 7.8),
            new gymItem("10 KG Dumbbel", "this is the last brand new  shoe make you comfort in the gym so you can excersize comfotably with no feets hurting any more", R.drawable.dumbbel10kg, 112, 8.1),
            new gymItem("Nike Short", "this is the last brand new  shoe make you comfort in the gym so you can excersize comfotably with no feets hurting any more", R.drawable.short2, 65.4, 9),
            new gymItem("Under Armor Short", "this is the last brand new  shoe make you comfort in the gym so you can excersize comfotably with no feets hurting any more", R.drawable.short1, 50, 8.8),
            new gymItem("Under Armor Shirt", "this is the last brand new  shoe make you comfort in the gym so you can excersize comfotably with no feets hurting any more", R.drawable.shirt2, 70, 7.8),
            new gymItem("Nike Shirt", "this is the last brand new  shoe make you comfort in the gym so you can excersize comfotably with no feets hurting any more", R.drawable.shirt, 89.99, 9.1),
            new gymItem("Belt", "this is the last brand new  shoe make you comfort in the gym so you can excersize comfotably with no feets hurting any more", R.drawable.belt, 42.99, 7.8),
            new gymItem("Belt", "this is the last brand new  shoe make you comfort in the gym so you can excersize comfotably with no feets hurting any more", R.drawable.belt2, 38.5, 7.2),
            new gymItem("Water Bottle", "this is the last brand new  shoe make you comfort in the gym so you can excersize comfotably with no feets hurting any more", R.drawable.bottle1, 34.99, 8.8),
            new gymItem("Water Bottle", "this is the last brand new  shoe make you comfort in the gym so you can excersize comfotably with no feets hurting any more", R.drawable.bottle2, 14.99, 7.8),
            new gymItem("Water Bottle", "this is the last brand new  shoe make you comfort in the gym so you can excersize comfotably with no feets hurting any more", R.drawable.bottle3, 29.99, 8.3)
    } ;


}
