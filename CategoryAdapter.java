package com.example.too.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.too.DrinkActivity;
import com.example.too.Interface.IitemClickListner;
import com.example.too.Model.Category;
import com.example.too.R;
import com.example.too.Utils.Common;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryViewHolder> {

    Context context;
    List<Category> categories;

    public CategoryAdapter(Context context, List<Category> categories) {
        this.context = context;
        this.categories = categories;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.menu_item_layout, null);

        return new CategoryViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, final int position) {
// Load Image

        Picasso.with(context)
                .load(categories.get(position).Link)
                .into(holder.imgProduct);
        holder.txtProduct.setText(categories.get(position).Name);

        //event
        holder.setItemClickListner(new IitemClickListner() {
            @Override
            public void onClick(View v) {
                Common.currentCategory = categories.get(position);
                //start new activity
               context.startActivity(new Intent(context, DrinkActivity.class));

            }
        });

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }
}
