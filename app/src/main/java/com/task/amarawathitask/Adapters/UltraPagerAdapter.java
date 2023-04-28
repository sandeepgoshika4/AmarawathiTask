package com.task.amarawathitask.Adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.task.amarawathitask.R;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class UltraPagerAdapter extends PagerAdapter {
    private Context context;
    private ArrayList<String> imageUrlsPojos = new ArrayList<>();

    public UltraPagerAdapter(Context context, ArrayList<String> imageUrlsPojos) {
        this.context = context;
        this.imageUrlsPojos = imageUrlsPojos;
//        ()notifyDataSetChanged;
    }

    @Override
    public int getCount() {
        return imageUrlsPojos.size();
    }

    public void setData(ArrayList<String> imageUrlsPojos){

        this.imageUrlsPojos = imageUrlsPojos;
//        notifyDataSetChanged();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
    @NotNull
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View linearLayout =  LayoutInflater.from(container.getContext()).inflate(R.layout.viewpager_layout_info, null);
        ImageView imageView = linearLayout.findViewById(R.id.view_pager_image);
//        imageView.setImageUrl(imageUrlsPojos.get(position), ConnectionManager.getImageLoader(context));
        Glide.with(imageView)
                .load(imageUrlsPojos.get(position))
                .into(imageView);
        container.addView(linearLayout);
//        try {
//
//            InputStream ims = context.getAssets().open(imageUrlsPojos.get(position));
//
//            //Drawable d = Drawable.createFromStream(ims, null);
//            Bitmap bitmap = BitmapFactory.decodeStream(ims);
//            imageView.setImageBitmap(bitmap);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return linearLayout;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        LinearLayout view = (LinearLayout) object;
//        container.removeView(view);
        ViewPager vp = (ViewPager)container;
        View view = (View) object;
        vp.removeView(view);
    }
}
