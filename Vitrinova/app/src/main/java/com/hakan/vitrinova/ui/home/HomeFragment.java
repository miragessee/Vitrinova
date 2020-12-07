package com.hakan.vitrinova.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.hakan.vitrinova.R;
import com.hakan.vitrinova.activities.ProductActivity;
import com.hakan.vitrinova.adapters.CategoriesAdapter;
import com.hakan.vitrinova.adapters.ProductAdapter;
import com.hakan.vitrinova.adapters.SliderAdapterExample;
import com.hakan.vitrinova.callbacks.DiscoverCallBack;
import com.hakan.vitrinova.controllers.DiscoverController;
import com.hakan.vitrinova.databinding.FragmentHomeBinding;
import com.hakan.vitrinova.models.Discover;
import com.hakan.vitrinova.models.SliderItem;
import com.kaopiz.kprogresshud.KProgressHUD;
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;
import com.yarolegovich.discretescrollview.DSVOrientation;
import com.yarolegovich.discretescrollview.DiscreteScrollView;
import com.yarolegovich.discretescrollview.InfiniteScrollAdapter;
import com.yarolegovich.discretescrollview.transform.ScaleTransformer;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private SliderAdapterExample adapter;

    private FragmentHomeBinding binding;

    private List<Discover> discoverList;

    private DiscoverController discoverController = DiscoverController.getInstance();

    //private InfiniteScrollAdapter<?> infiniteAdapter;

    private KProgressHUD hud;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);

        View view = binding.getRoot();

        hud = KProgressHUD.create(getContext())
                .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                .setGraceTime(1000)
                .show();

        adapter = new SliderAdapterExample(getContext());

        binding.itemPicker.setOrientation(DSVOrientation.HORIZONTAL);

        discoverController.getDiscover(new DiscoverCallBack() {
            @Override
            public void onSuccess(List<Discover> discoverList) {
                HomeFragment.this.discoverList = discoverList;

                renewItemsFeatured();
                renewItemsProducts();
                renewItemsCategories();

                hud.dismiss();
            }

            @Override
            public void onError() {

            }
        });

        binding.imageSlider.setOnIndicatorClickListener(new DrawController.ClickListener() {
            @Override
            public void onIndicatorClicked(int position) {
                Log.i("GGG", "onIndicatorClicked: " + binding.imageSlider.getCurrentPagePosition());
            }
        });

        binding.textView5.setOnClickListener((View v) -> {
            Intent intent = ProductActivity.newIntent(getContext());
            intent.putParcelableArrayListExtra ("productList", (ArrayList<? extends Parcelable>) discoverList.get(1).getProducts());
            startActivity(intent);
        });

        return view;
    }

    public void renewItemsFeatured() {
        List<SliderItem> sliderItemList = new ArrayList<>();

        for (int i = 0; i < discoverList.get(0).getFeatured().size(); i++) {
            SliderItem sliderItem = new SliderItem();
            sliderItem.setTitle(discoverList.get(0).getFeatured().get(i).getTitle());
            sliderItem.setSubTitle(discoverList.get(0).getFeatured().get(i).getSubTitle());
            sliderItem.setImageUrl(discoverList.get(0).getFeatured().get(i).getCover().getUrl());
            sliderItemList.add(sliderItem);
        }
        adapter.renewItems(sliderItemList);

        binding.imageSlider.setSliderAdapter(adapter);
        binding.imageSlider.setSliderTransformAnimation(SliderAnimations.CUBEINDEPTHTRANSFORMATION, 0);
    }

    public void renewItemsProducts() {
        //infiniteAdapter = InfiniteScrollAdapter.wrap(new ProductAdapter(discoverList.get(1).getProducts()));
        binding.itemPicker.setAdapter(new ProductAdapter(discoverList.get(1).getProducts()));
        binding.itemPicker.setItemTransformer(new ScaleTransformer.Builder()
                .setMinScale(0.8f)
                .build());
    }

    public void renewItemsCategories() {
        binding.itemPicker2.setAdapter(new CategoriesAdapter(discoverList.get(2).getCategories()));
        binding.itemPicker2.setItemTransformer(new ScaleTransformer.Builder()
                .setMinScale(0.8f)
                .build());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}