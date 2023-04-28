package com.task.amarawathitask.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.task.amarawathitask.databinding.BestdealLayoutBinding;
import com.task.amarawathitask.model.AllProduct;
import com.task.amarawathitask.model.ParentCommonModel;
import com.task.amarawathitask.model.TrendingProduct;

import java.util.List;

public class BestDealsAdapterVertical extends RecyclerView.Adapter<BestDealsAdapterVertical.ViewHolder> {
    List<ParentCommonModel> parentCommonModels;
    Context context;
    private OnItemClickListener mListener;

    public BestDealsAdapterVertical(List<ParentCommonModel> parentCommonModels, Context context) {
        this.parentCommonModels = parentCommonModels;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        BestdealLayoutBinding layoutBinding = BestdealLayoutBinding.inflate(inflater,parent,false);
        return new ViewHolder(layoutBinding,mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String title = parentCommonModels.get(position).getTitle();
        holder.binding.name.setText(title);
        holder.binding.recyclerThree.setAdapter(new BestDealsAdapterHorizontal(parentCommonModels.get(position).getModels(),context));
    }

    @Override
    public int getItemCount() {
        return parentCommonModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        BestdealLayoutBinding binding;
        public ViewHolder(@NonNull BestdealLayoutBinding binding, OnItemClickListener listener) {
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
