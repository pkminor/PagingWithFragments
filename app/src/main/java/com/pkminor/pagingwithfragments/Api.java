package com.pkminor.pagingwithfragments;

import com.pkminor.pagingwithfragments.model.ApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {

    @GET("/staff/page/{page_number}/items/{item_count}")
    Call<ApiResponse> getStaffPaged(@Path("page_number") Integer page_number, @Path("item_count") Integer item_count);

}
