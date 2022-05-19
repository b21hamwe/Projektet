package com.example.projekt;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {

    private List<Blommor> blommorList = new ArrayList();


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder((LayoutInflater.from(parent.getContext()).inflate(R.layout.item_holder, parent, false)));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Blommor blommor = blommorList.get(position);

        holder.name.setText(blommor.name);
        holder.size.setText(String.valueOf(blommor.getSize()));
        holder.company.setText(blommor.company);
        holder.id.setText(blommor.getID());
    }

    @Override
    public int getItemCount() {
        return blommorList.size();
    };

    public void setblommorList(List<Blommor> blommorList) {
        this.blommorList = blommorList;
    };

}