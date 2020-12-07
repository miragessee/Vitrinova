package com.hakan.vitrinova.adapters;

import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.hakan.vitrinova.R;
import com.hakan.vitrinova.models.Category;

import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.ViewHolder> {

    private List<Category> data;

    public CategoriesAdapter(List<Category> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public CategoriesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.item_category_card, parent, false);
        return new CategoriesAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CategoriesAdapter.ViewHolder holder, int position) {
        Glide.with(holder.itemView.getContext())
                .load(data.get(position).getLogo().getUrl())
                .into(holder.image);
        holder.tv_category_title.setText(data.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView image;
        private TextView tv_category_title;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageCategory);
            tv_category_title = itemView.findViewById(R.id.tv_category_title);
        }
    }
}
