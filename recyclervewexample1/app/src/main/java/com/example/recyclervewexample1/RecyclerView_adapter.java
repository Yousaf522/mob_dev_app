package com.example.recyclervewexample1;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

public abstract class RecyclerView_adapter<parent> extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements recyclervadapter {
    List<data> list = Collections.emptyList();
    Context context;

    public RecyclerView_adapter(List<data> data, Application application) {
        this.list = data;
        this.context = application;
    }

    @NonNull
    @Override
    public View_Holder OnCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        View_Holder holder = new View_Holder(v);
        return holder;

    }
    @Override
    public void OnBindViewHolder(@NonNull View_Holder holder, int position){
        holder.name.setText(list.get(position).name);
        holder.imageView.setImageResource(list.get(position).imageId);
    }
    public int getItemCount(){
        return list.size();
    }

}

