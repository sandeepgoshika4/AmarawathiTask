package com.task.amarawathitask.Adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.task.amarawathitask.databinding.BestDealsHorizontalBinding;
import com.task.amarawathitask.databinding.ParentCategoryLayoutBinding;
import com.task.amarawathitask.model.CommonModel;
import com.task.amarawathitask.model.ParentCategory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Random;

public class BestDealsAdapterHorizontal extends RecyclerView.Adapter<BestDealsAdapterHorizontal.ViewHolder> {
    List<CommonModel> modelList;
    Context context;
    private OnItemClickListener mListener;

    public BestDealsAdapterHorizontal(List<CommonModel> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        BestDealsHorizontalBinding layoutBinding = BestDealsHorizontalBinding.inflate(inflater,parent,false);
        return new ViewHolder(layoutBinding,mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CommonModel model = modelList.get(position);
        holder.binding.setModel(model);
        try {

            InputStream ims = context.getAssets().open(model.getImage());

            //Drawable d = Drawable.createFromStream(ims, null);
            Bitmap bitmap = BitmapFactory.decodeStream(ims);
            holder.binding.imageView.setImageBitmap(bitmap);

        } catch (IOException e) {
            e.printStackTrace();
        }
        Random rnd = new Random();
        int currentColor = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        holder.binding.reative.setBackgroundColor(currentColor);
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        BestDealsHorizontalBinding binding;
        public ViewHolder(@NonNull BestDealsHorizontalBinding binding, OnItemClickListener listener) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
    public interface OnItemClickListener{
        void OnCellClicked(int position);
    }
    public void setOnItemClickListener(OnItemClickListener listener){
        mListener  = listener;
    }
}
