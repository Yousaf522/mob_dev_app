package com.example.recyclervewexample1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class View_Holder extends RecyclerView.ViewHolder {
    TextView name;
    ImageView imageView;

    public View_Holder(@NonNull View itemView){
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.discription);
        imageView = (ImageView) itemView.findViewById(R.id.image);


    }
}

