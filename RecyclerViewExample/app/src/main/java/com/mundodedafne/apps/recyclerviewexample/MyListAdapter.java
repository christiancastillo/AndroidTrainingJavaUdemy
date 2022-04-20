package com.mundodedafne.apps.recyclerviewexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/*
* https://www.javatpoint.com/android-recyclerview-list-example
* */

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder> {
    private MyListData[] listData;

    //recyclerView
    public MyListAdapter(MyListData[] listData){
        this.listData = listData;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View listItem = inflater.inflate(R.layout.list_item,parent,false);
        ViewHolder holder = new ViewHolder(listItem);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyListAdapter.ViewHolder holder, int position) {
        final MyListData myListData = listData[position];
        holder.textView.setText(listData[position].getDescription());
        holder.imageView.setImageResource(listData[position].getImageId());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+myListData.getDescription(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listData.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;
        public RelativeLayout relativeLayout;

        public ViewHolder(View itemView){
            super(itemView);

            this.imageView = (ImageView) itemView.findViewById(R.id.imageView_list);
            this.textView = (TextView) itemView.findViewById(R.id.textView_list);
            this.relativeLayout = (RelativeLayout) itemView.findViewById(R.id.relativeLayout_listItem);
        }
    }
}
