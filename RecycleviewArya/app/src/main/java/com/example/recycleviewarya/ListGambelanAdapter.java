package com.example.recycleviewarya;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListGambelanAdapter extends RecyclerView.Adapter<ListGambelanAdapter.ListViewHolder> {
    private ArrayList<Gambelan> listGambelan;

    public ListGambelanAdapter(ArrayList<Gambelan> list) {
        this.listGambelan = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_gambelan, parent, false );
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Gambelan gambelan = listGambelan.get(position);
        Glide.with(holder.itemView.getContext())
                .load(gambelan.getPhoto())
                .apply(new RequestOptions().override(70,70))
                .into(holder.imgPhoto);
        holder.tvName.setText(gambelan.getNama());
        holder.tvDetail.setText(gambelan.getDetail());
    }

    @Override
    public int getItemCount() {
        return listGambelan.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

       ListViewHolder(View itemview) {
            super(itemview);
            imgPhoto = itemView.findViewById(R.id.img_item_gambelan);
            tvName = itemView.findViewById(R.id.tv_item_nama);
            tvDetail = itemView.findViewById(R.id.tv_detail_gambelan);
        }
    }
}
