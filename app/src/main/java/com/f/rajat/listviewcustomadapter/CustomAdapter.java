package com.f.rajat.listviewcustomadapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    private Context mContext;

    CustomAdapter(Context mContext) {
        this.mContext = mContext;
    }

    private int[] dish_images = {R.drawable.all_frescho, R.drawable.baked_potatoes, R.drawable.brocalli_roasted, R.drawable.confetti_rice, R.drawable.spanish_rice,
            R.drawable.tofu, R.drawable.vegan_beans, R.drawable.zucchini, R.drawable.flair_metal, R.drawable.new_orleans};

    private String[] dish_names = {"Fresco", "Baked Potatoes", "Broccoli roasted", "Confetti Rice", "Spanish Rice", "Tofu", "Vegan Beans", "Zucchini", "Flair Metal", "New Orleans"};

    private String[] dish_description = {"Is there anything better than a bowl of curry to make you feel good? Indian is some of my all-time favorite comfort food, and a vegetarian korma is right up there with my fav curries.",
            "Is there anything better than a bowl of curry to make you feel good? Indian is some of my all-time favorite comfort food, and a vegetarian korma is right up there with my fav curries.",
            "Is there anything better than a bowl of curry to make you feel good? Indian is some of my all-time favorite comfort food, and a vegetarian korma is right up there with my fav curries.",
            "Is there anything better than a bowl of curry to make you feel good? Indian is some of my all-time favorite comfort food, and a vegetarian korma is right up there with my fav curries.",
            "Is there anything better than a bowl of curry to make you feel good? Indian is some of my all-time favorite comfort food, and a vegetarian korma is right up there with my fav curries.",
            "Is there anything better than a bowl of curry to make you feel good? Indian is some of my all-time favorite comfort food, and a vegetarian korma is right up there with my fav curries.",
            "Is there anything better than a bowl of curry to make you feel good? Indian is some of my all-time favorite comfort food, and a vegetarian korma is right up there with my fav curries.",
            "Is there anything better than a bowl of curry to make you feel good? Indian is some of my all-time favorite comfort food, and a vegetarian korma is right up there with my fav curries.",
            "Is there anything better than a bowl of curry to make you feel good? Indian is some of my all-time favorite comfort food, and a vegetarian korma is right up there with my fav curries.",
            "Is there anything better than a bowl of curry to make you feel good? Indian is some of my all-time favorite comfort food, and a vegetarian korma is right up there with my fav curries."};

    @Override
    public int getCount() {
        return dish_images.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        @SuppressLint("ViewHolder")
        View view = View.inflate(mContext, R.layout.custom_list, null);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView name = view.findViewById(R.id.text_view_dishName);
        TextView description = view.findViewById(R.id.text_view_dish_description);

        imageView.setImageResource(dish_images[position]);
        name.setText(dish_names[position]);
        description.setText(dish_description[position]);

        return view;
    }
}
