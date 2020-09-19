
package com.pkminor.pagingwithfragments.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Engagement {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("members")
    @Expose
    private Integer members;
    @SerializedName("pages")
    @Expose
    private Integer pages;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("reference")
    @Expose
    private String reference;
    @SerializedName("status")
    @Expose
    private String status;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Engagement() {
    }

    /**
     * 
     * @param reference
     * @param pages
     * @param code
     * @param members
     * @param id
     * @param title
     * @param status
     */
    public Engagement(Integer id, String title, Integer members, Integer pages, String code, String reference, String status) {
        super();
        this.id = id;
        this.title = title;
        this.members = members;
        this.pages = pages;
        this.code = code;
        this.reference = reference;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getMembers() {
        return members;
    }

    public void setMembers(Integer members) {
        this.members = members;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
