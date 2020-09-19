
package com.pkminor.pagingwithfragments.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ApiResponse {

    @SerializedName("error")
    @Expose
    private Boolean error;
    @SerializedName("errors")
    @Expose
    private List<String> errors = null;
    @SerializedName("hasNext")
    @Expose
    private boolean hasNext;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ApiResponse() {
    }

    /**
     *
     * @param data
     * @param error
     * @param errors
     * @param hasNext
     */
    public ApiResponse(Boolean error, List<String> errors, boolean hasNext, List<Datum> data) {
        this.error = error;
        this.errors = errors;
        this.hasNext = hasNext;
        this.data = data;
    }




    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public boolean getHasNext() {  return hasNext;    }

    public void setHasNext(boolean hasNext) {  this.hasNext = hasNext;   }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

}
