package com.example.projekt;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    public TextView size;
    public TextView name;
    public TextView company;
    public TextView id;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.nameprint);
        size = itemView.findViewById(R.id.sizeprint);
        company = itemView.findViewById(R.id.companyprint);
        id = itemView.findViewById(R.id.IDprint);
    }
}
