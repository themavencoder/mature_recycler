package com.aloine.mature_recycler.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.aloine.mature_recycler.R;
import com.aloine.mature_recycler.contract.ExpertsClickListener;
import com.aloine.mature_recycler.model.Datas;
import com.aloine.mature_recycler.model.Model;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private ExpertsClickListener mExpertClickListener;
    private List<Model> mList;

    public Adapter(List<Model> mList) {
        this.mList = mList;


    }

    public Adapter(List<Model> mList,ExpertsClickListener mExpertClickListener) {
        this.mExpertClickListener = mExpertClickListener;
        this.mList = mList;


    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recycler, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        Model model = mList.get(i);
        myViewHolder.bind(mExpertClickListener,model);

    }

    @Override
    public int getItemCount() {
        return  null != mList ? mList.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView iv;
        private TextView name, location, description;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.image_header);
            name = itemView.findViewById(R.id.text_name);
            location = itemView.findViewById(R.id.text_country);
            description = itemView.findViewById(R.id.text_description);

        }

        public void bind(ExpertsClickListener clickListener, Model model) {
            itemView.setOnClickListener(view -> {
                clickListener.showDetails(model);
            });
            iv.setImageResource(model.getImage());
            name.setText(model.getName());
            location.setText(model.getLocation());
            description.setText(model.getDescription());




        }



    }
}
