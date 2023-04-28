package com.task.amarawathitask.Adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.task.amarawathitask.model.ParentCategory;
import com.task.amarawathitask.databinding.ParentCategoryLayoutBinding;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class CategoryRecyclerAdapter extends RecyclerView.Adapter<CategoryRecyclerAdapter.ViewHolder> {
    List<ParentCategory> modelList;
    Context context;
    private OnItemClickListener mListener;

    public CategoryRecyclerAdapter(List<ParentCategory> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        ParentCategoryLayoutBinding layoutBinding = ParentCategoryLayoutBinding.inflate(inflater,parent,false);
        return new ViewHolder(layoutBinding,mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ParentCategory modal = modelList.get(position);
        holder.binding.setModel(modal);
        try {

            InputStream ims = context.getAssets().open(modal.getIcon());

            //Drawable d = Drawable.createFromStream(ims, null);
            Bitmap bitmap = BitmapFactory.decodeStream(ims);
            holder.binding.roundedimage.setImageBitmap(bitmap);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ParentCategoryLayoutBinding binding;
        public ViewHolder(@NonNull ParentCategoryLayoutBinding binding,OnItemClickListener listener) {
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
