package com.pkminor.pagingwithfragments.ui.home;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.paging.DataSource;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PageKeyedDataSource;
import androidx.paging.PagedList;

import com.pkminor.pagingwithfragments.model.Datum;

public class HomeViewModel extends ViewModel {

    private LiveData<PagedList<Datum>> pagedListLiveData;

    private LiveData<PageKeyedDataSource<Integer,Datum>> liveDataSourcce;

    DataSource<Integer, Datum> dataSource;

    public HomeViewModel() {
        Log.d("TAG","ViewModel");
        HomeDataSourceFactory dataSourceFactory = new HomeDataSourceFactory();
        liveDataSourcce = dataSourceFactory.getLiveDataSource();

        PagedList.Config pagedListConfig = (new PagedList.Config.Builder())
                .setEnablePlaceholders(false)
                .setInitialLoadSizeHint(10)
                .setPrefetchDistance(30)
                .setPageSize(HomeDataSource.ITEM_COUNT).build();

        pagedListLiveData = new LivePagedListBuilder(dataSourceFactory,pagedListConfig).build();
    }

    public LiveData<PagedList<Datum>> getPagedListLiveData()  {
        Log.d("TAG","ViewModel getPagedListLiveData");
        return pagedListLiveData;
    }

}