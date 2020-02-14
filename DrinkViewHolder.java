package com.example.too.Adapter;



import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.too.Interface.IitemClickListner;
import com.example.too.R;


public class DrinkViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView img_product;
    TextView txt_drink_name,txt_price;

    IitemClickListner iitemClickListner;

    ImageView btnAddtoCart,btnFavourites;

    public void setIitemClickListner(IitemClickListner iitemClickListner) {
        this.iitemClickListner = iitemClickListner;
    }

    public DrinkViewHolder(View itemView) {
        super(itemView);

        img_product=itemView.findViewById(R.id.imageproduct);
        txt_drink_name=itemView.findViewById(R.id.txt_drink_name);
        txt_price=itemView.findViewById(R.id.txt_price);

        btnAddtoCart=itemView.findViewById(R.id.btn_add_cart);
        btnFavourites=itemView.findViewById(R.id.btn_favorite);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        iitemClickListner.onClick(v);

    }
}