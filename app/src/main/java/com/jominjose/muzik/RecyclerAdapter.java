package com.jominjose.muzik;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private ArrayList<Song> songList;

    public RecyclerAdapter(ArrayList<Song> songList) {
        this.songList = songList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView songTextView;

        public MyViewHolder(final View view) {
            super(view);
            songTextView = view.findViewById(R.id.txtsongname);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            
        }
    }

    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyViewHolder holder, int position) {
        String name = songList.get(position).getSongName();
        holder.songTextView.setText(name);
    }

    @Override
    public int getItemCount() {
        if(songList != null)
            return songList.size();
        else
            return 0;
    }
}
