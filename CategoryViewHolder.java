package com.example.too.Adapter;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.too.Interface.IitemClickListner;
import com.example.too.R;


public class CategoryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView imgProduct;
    TextView txtProduct;

    IitemClickListner itemClickListner;

    public void setItemClickListner(IitemClickListner itemClickListner) {
        this.itemClickListner = itemClickListner;
    }

    public CategoryViewHolder(View itemView) {
        super(itemView);

        imgProduct=itemView.findViewById(R.id.imageproduct);
        txtProduct=itemView.findViewById(R.id.txt_menu_name);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        itemClickListner.onClick(v);
    }
}