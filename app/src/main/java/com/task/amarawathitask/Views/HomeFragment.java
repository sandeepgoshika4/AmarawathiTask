package com.task.amarawathitask.Views;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.task.amarawathitask.Adapters.BestDealsAdapterVertical;
import com.task.amarawathitask.Adapters.CategoryRecyclerAdapter;
import com.task.amarawathitask.Adapters.UltraPagerAdapter;
import com.task.amarawathitask.Adapters.ViewPagerAdapter;
import com.task.amarawathitask.model.AllProduct;
import com.task.amarawathitask.model.CommonModel;
import com.task.amarawathitask.model.OfferBanner;
import com.task.amarawathitask.model.ParentCommonModel;
import com.task.amarawathitask.model.ProtineModel;
import com.task.amarawathitask.ViewModel.MainViewModel;
import com.task.amarawathitask.databinding.FragmentHomeBinding;
import com.task.amarawathitask.model.TrendingProduct;
import com.task.amarawathitask.ultraviewpager.UltraViewPager;
import com.task.amarawathitask.ultraviewpager.UltraViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    MainViewModel homeViewModel;
    private FragmentHomeBinding fragmentBinding;
    private CategoryRecyclerAdapter adapter;
    private BestDealsAdapterVertical adapterVertical;
    List<String> titles = new ArrayList<>();
    List<ParentCommonModel> parentCommonModels = new ArrayList<>();
    List<CommonModel> commonModelsOne = new ArrayList<>();
    List<CommonModel> commonModelsTwo = new ArrayList<>();
    private UltraPagerAdapter ultraPagerAdapter;
    private ViewPagerAdapter viewPagerAdapter;
    private final ArrayList<String> imagesViewPager = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        fragmentBinding = FragmentHomeBinding.inflate(getLayoutInflater());

        titles.add("Today's Best Deal");
        titles.add("Popular Cuts");


//        imagesViewPager.add("mutton.png");
//        imagesViewPager.add("prawns.png");
//        imagesViewPager.add("readytocook.png");
        return fragmentBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        homeViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        homeViewModel.getModelMutableLiveData().observe(requireActivity(),GetData);
    }

    Observer<ProtineModel> GetData = new Observer<ProtineModel>() {
        @Override
        public void onChanged(ProtineModel protineModel) {
            commonModelsOne.clear();
            commonModelsTwo.clear();
            parentCommonModels.clear();
//            imagesViewPager.clear();

//            for (int i=0;i<protineModel.getHome().getOffer_banners().size();i++){
//                OfferBanner images = protineModel.getHome().getOffer_banners().get(i);
////                images.getImage();
//                imagesViewPager.add(images.getImage());
//            }
//            imagesViewPager.add("banner_one.jpg");
//            imagesViewPager.add("banner_two.jpg");
//            imagesViewPager.add("banner_three.jpg");

//            imagesViewPager.add("mutton.png");
//            imagesViewPager.add("prawns.png");
//            imagesViewPager.add("readytocook.png");

            imagesViewPager.add("https://i.picsum.photos/id/439/200/200.jpg?hmac=Aig4UrUSSGah1WrKUdIlJOecKTpPZDiUFpnllH4YPOY");
            imagesViewPager.add("https://i.picsum.photos/id/989/200/200.jpg?hmac=YmaagsSArKDGDSeyRJ9aYRxKM6KdP49ZGYtyhLHlCcY");
            imagesViewPager.add("https://i.picsum.photos/id/1064/200/200.jpg?hmac=xUH-ovzKEHg51S8vchfOZNAOcHB6b1TI_HzthmqvcWU");

            fragmentBinding.ultraViewPager.setInfiniteRatio(100);
            UltraViewPager.Orientation gravity_indicator = UltraViewPager.Orientation.HORIZONTAL;

            SparseIntArray special = new SparseIntArray();
            special.put(0, 5000);
            special.put(1, 1500);

            fragmentBinding.ultraViewPager.setAutoScroll(3000, special);
            if (fragmentBinding.ultraViewPager.getIndicator() == null) {
                fragmentBinding.ultraViewPager.initIndicator();
                fragmentBinding.ultraViewPager.getIndicator().setOrientation(gravity_indicator);
            }
            ultraPagerAdapter = new UltraPagerAdapter(getContext(), imagesViewPager);
            fragmentBinding.ultraViewPager.setAdapter(ultraPagerAdapter);
            fragmentBinding.ultraViewPager.getWrapAdapter().notifyDataSetChanged();

            ultraPagerAdapter.notifyDataSetChanged();

            fragmentBinding.ultraViewPager2.setInfiniteRatio(100);

            fragmentBinding.ultraViewPager2.setAutoScroll(3000, special);
            if (fragmentBinding.ultraViewPager2.getIndicator() == null) {
                fragmentBinding.ultraViewPager2.initIndicator();
                fragmentBinding.ultraViewPager2.getIndicator().setOrientation(gravity_indicator);
            }
            viewPagerAdapter = new ViewPagerAdapter(getContext(), imagesViewPager);
            fragmentBinding.ultraViewPager2.setAdapter(ultraPagerAdapter);
            fragmentBinding.ultraViewPager2.getWrapAdapter().notifyDataSetChanged();

            viewPagerAdapter.notifyDataSetChanged();


            for (int i=0;i<protineModel.getHome().getAll_products().size();i++){
                AllProduct product = protineModel.getHome().getAll_products().get(i);
                commonModelsOne.add(new CommonModel(product.getProduct_name(),product.getDescription(),product.getImage()));
            }
            for (int i=0;i<protineModel.getHome().getTrending_products().size();i++){
                TrendingProduct product = protineModel.getHome().getTrending_products().get(i);
                commonModelsTwo.add(new CommonModel(product.getProduct_name(),product.getDescription(),product.getImage()));
            }
            parentCommonModels.add(new ParentCommonModel(commonModelsOne,"Today's Best Deal"));
            parentCommonModels.add(new ParentCommonModel(commonModelsTwo,"Popular Cuts") );


            adapter = new CategoryRecyclerAdapter(protineModel.getHome().getParent_categories(),getContext());
            fragmentBinding.recyclerTwo.setAdapter(adapter);
            adapterVertical = new BestDealsAdapterVertical(parentCommonModels,getContext());
            fragmentBinding.recyclerOne.setAdapter(adapterVertical);
        }
    };
}