package com.pkminor.pagingwithfragments;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Client {

    private static Retrofit retrofit = null;
    private static final String BASE_URL="https://syncpractice.herokuapp.com";

    private static Client instance;

    public Client() {

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(logging);

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();
    }

    public static  synchronized Client getInstance(){
        if(instance==null){
            instance = new Client();
        }
        return instance;
    }

    public  Api getClient(){
        return retrofit.create(Api.class);
    }
}
