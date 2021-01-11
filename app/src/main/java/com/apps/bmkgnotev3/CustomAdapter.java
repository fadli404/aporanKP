package com.apps.bmkgnotev3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    Context context;
    ArrayList data_id, data_azimuth,data_elevasi;

    CustomAdapter(Context context,
                  ArrayList data_id,
                  ArrayList data_azimuth,
                  ArrayList data_elevasi){
        this.context = context;
        this.data_id = data_id;
        this.data_azimuth = data_azimuth;
        this.data_elevasi = data_elevasi;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.data_id_txt.setText(String.valueOf(data_id.get(position)));
        holder.data_azimuth_txt.setText(String.valueOf(data_azimuth.get(position)));
        holder.data_elevasi_txt.setText(String.valueOf(data_elevasi.get(position)));

    }

    @Override
    public int getItemCount() {
        return data_id.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView data_id_txt,data_azimuth_txt,data_elevasi_txt;
        LinearLayout mainLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            data_id_txt = itemView.findViewById(R.id.id_txt);
            data_azimuth_txt = itemView.findViewById(R.id.azimuth_txt);
            data_elevasi_txt = itemView.findViewById(R.id.elevasi_txt);

            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}
