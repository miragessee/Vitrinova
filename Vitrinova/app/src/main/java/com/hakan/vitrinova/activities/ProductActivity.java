package com.hakan.vitrinova.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hakan.vitrinova.R;
import com.hakan.vitrinova.adapters.ProductAllAdapter;
import com.hakan.vitrinova.databinding.ActivityProductBinding;
import com.hakan.vitrinova.models.Product;

import java.util.List;

public class ProductActivity extends AppCompatActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, ProductActivity.class);
    }

    private List<Product> productList;

    private ActivityProductBinding binding;
    private ProductAllAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProductBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        productList = getIntent().getParcelableArrayListExtra("productList");

        adapter = new ProductAllAdapter(productList);

        binding.recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        binding.recyclerView.scheduleLayoutAnimation();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}