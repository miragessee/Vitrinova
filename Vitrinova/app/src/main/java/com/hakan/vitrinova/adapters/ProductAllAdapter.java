package com.hakan.vitrinova.adapters;

import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.hakan.vitrinova.R;
import com.hakan.vitrinova.models.Product;

import java.util.List;

public class ProductAllAdapter  extends RecyclerView.Adapter<ProductAllAdapter.ViewHolder> {

    private List<Product> data;

    public ProductAllAdapter(List<Product> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ProductAllAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.item_product_all, parent, false);
        return new ProductAllAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ProductAllAdapter.ViewHolder holder, int position) {
        Glide.with(holder.itemView.getContext())
                .load(data.get(position).getImages().get(0).getUrl())
                .into(holder.image);
        holder.tv_product_title.setText(data.get(position).getTitle());
        holder.tv_product_subTitle.setText(data.get(position).getShop().getName());
        if (data.get(position).getOldPrice() == null)
        {
            holder.tv_product_price.setText(data.get(position).getPrice().toString() + " TL");
        }
        else
        {
            holder.tv_product_price.setText(data.get(position).getPrice().toString() + " TL");
            holder.tv_product_old_price.setText(data.get(position).getOldPrice().toString() + " TL");
            holder.tv_product_old_price.setPaintFlags(holder.tv_product_old_price.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView image;
        private TextView tv_product_title;
        private TextView tv_product_subTitle;
        private TextView tv_product_price;
        private TextView tv_product_old_price;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            tv_product_title = itemView.findViewById(R.id.tv_product_title);
            tv_product_subTitle = itemView.findViewById(R.id.tv_product_subTitle);
            tv_product_price = itemView.findViewById(R.id.tv_product_price);
            tv_product_old_price = itemView.findViewById(R.id.tv_product_old_price);
        }
    }
}
