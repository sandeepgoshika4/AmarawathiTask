package com.task.amarawathitask.ViewModel;

import android.app.Application;
import android.util.Log;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.google.gson.Gson;
import com.task.amarawathitask.model.ProtineModel;
import com.task.amarawathitask.Network.ApiClient;
import com.task.amarawathitask.Network.ApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainViewModel extends AndroidViewModel {
    MutableLiveData<ProtineModel> modelLiveData;
//    ArrayList<ProductsModel> p = new ArrayList<>();
    Application application;
    private ApiService apiService;



    public MainViewModel(Application application) {
        super(application);
        this.application = application;
        modelLiveData = new MutableLiveData<>();
        apiService  = ApiClient.getRetrofit().create(ApiService.class);
        // call your Rest API in init method
        init();
    }

    public MutableLiveData<ProtineModel> getModelMutableLiveData() {
        return modelLiveData;
    }



    public void init(){
        populateList();
    }

    public void populateList() {

        apiService.getAllProducts().enqueue(new Callback<ProtineModel>() {
            @Override
            public void onResponse(Call<ProtineModel> call, Response<ProtineModel> response) {
                Gson gson = new Gson();
                String jsonInString = gson.toJson(response.body());
                Log.e("response",jsonInString);
                modelLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<ProtineModel> call, Throwable t) {
                Log.e("Response",call.toString());
                t.printStackTrace();
            }
        });
    }
}
