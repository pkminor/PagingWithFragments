package com.pkminor.pagingwithfragments.ui.home;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.PageKeyedDataSource;

import com.pkminor.pagingwithfragments.Api;
import com.pkminor.pagingwithfragments.Client;
import com.pkminor.pagingwithfragments.model.ApiResponse;
import com.pkminor.pagingwithfragments.model.Datum;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeDataSource extends PageKeyedDataSource<Integer,Datum> {

    public static final int PAGE_NUMBER = 1;
    public static final int ITEM_COUNT = 10;

    @Override
    public void loadInitial(@NonNull PageKeyedDataSource.LoadInitialParams<Integer> params, @NonNull final PageKeyedDataSource.LoadInitialCallback<Integer, Datum> callback) {

        Api api = Client.getInstance().getClient();
        Call<ApiResponse> call = api.getStaffPaged(PAGE_NUMBER,ITEM_COUNT);
        call.enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                Log.d("TAG API","Load initial successful");
                if(response.body()!=null){
                    Log.d("TAG API","load initial count: "+response.body().getData().size()+"");
                    callback.onResult(response.body().getData(),null,2);

                }else{
                    Log.d("TAG API","res body is null");
                }
            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                Log.e("TAG API",call.request().url()+" - Load initial failed with "+t.getLocalizedMessage());
            }
        });
    }

    @Override
    public void loadBefore(@NonNull final PageKeyedDataSource.LoadParams<Integer> params, @NonNull final PageKeyedDataSource.LoadCallback<Integer, Datum> callback) {

        Api api = Client.getInstance().getClient();
        Call<ApiResponse> call = api.getStaffPaged(params.key,ITEM_COUNT);
        call.enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                Log.d("TAG API","Load before successful");

                Integer adjacentKey = params.key > 1? params.key-1 : null;
                if(response.body()!=null){
                    callback.onResult(response.body().getData(),adjacentKey);
                }
            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                Log.e("TAG API","Load before failed with "+t.getMessage());
            }
        });
    }

    @Override
    public void loadAfter(@NonNull final PageKeyedDataSource.LoadParams<Integer> params, @NonNull final PageKeyedDataSource.LoadCallback<Integer, Datum> callback) {

        Api api = Client.getInstance().getClient();
        Call<ApiResponse> call = api.getStaffPaged(params.key,ITEM_COUNT);
        call.enqueue( new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                Log.d("TAG API","Load after successful");
                if(response.body()!=null){
                    Log.d("TAG API","Load after count: "+response.body().getData().size());
                    Integer key = response.body().getHasNext()? params.key+1:null;
                    callback.onResult(response.body().getData(),key);
                }
            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                Log.e("TAG API","Load after failed with "+t.getMessage());
            }
        });

    }
    
}
