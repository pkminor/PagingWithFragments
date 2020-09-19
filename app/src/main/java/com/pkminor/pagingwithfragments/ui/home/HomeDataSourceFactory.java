package com.pkminor.pagingwithfragments.ui.home;


import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import androidx.paging.PageKeyedDataSource;

import com.pkminor.pagingwithfragments.model.Datum;

public class HomeDataSourceFactory extends DataSource.Factory {

    MutableLiveData<PageKeyedDataSource<Integer, Datum>> liveDataSource =  new MutableLiveData<>();

    @NonNull
    @Override
    public DataSource<Integer, Datum> create() {
        Log.d("TAG","DataSourceFactory create");

        HomeDataSource dataSource =  new HomeDataSource();
        liveDataSource.postValue(dataSource);

        return dataSource;
    }

    public MutableLiveData<PageKeyedDataSource<Integer, Datum>> getLiveDataSource() {
        return liveDataSource;
    }
}
