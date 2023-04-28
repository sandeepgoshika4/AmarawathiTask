package com.task.amarawathitask.Network;

import com.task.amarawathitask.model.ProtineModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

//    @POST("getProducts")
//    Call<ArrayList<ProductsModel>> getAllProducts(@Query("category")String category, @Query("species")String species);

    @GET("getParentCategories")
    Call<ProtineModel> getAllProducts();
}
