package com.aloine.mature_recycler.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.aloine.mature_recycler.R;
import com.aloine.mature_recycler.model.Model;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private List<Model> mList;

    public Adapter(Context mContext, List<Model> mList) {
        this.mContext = mContext;
        this.mList = mList;
       mLayoutInflater = LayoutInflater.from(mContext);

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = mLayoutInflater.inflate(R.layout.item_recycler,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.iv.setImageResource(mList.get(i).getImage());
        myViewHolder.name.setText(mList.get(i).getName());
        myViewHolder.location.setText(mList.get(i).getLocation());
        myViewHolder.description.setText(mList.get(i).getDescription());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView iv;
        private TextView name, location, description;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.image_header);
            name = itemView.findViewById(R.id.text_name);
            location = itemView.findViewById(R.id.text_country);
            description = itemView.findViewById(R.id.text_description);

        }
    }
}
