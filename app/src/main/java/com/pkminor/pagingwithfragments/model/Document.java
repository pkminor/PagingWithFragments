
package com.pkminor.pagingwithfragments.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Document {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("owner")
    @Expose
    private String owner;
    @SerializedName("uploaded")
    @Expose
    private String uploaded;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Document() {
    }

    /**
     * 
     * @param owner
     * @param path
     * @param name
     * @param uploaded
     * @param id
     * @param category
     */
    public Document(Integer id, String name, String path, String category, String owner, String uploaded) {
        super();
        this.id = id;
        this.name = name;
        this.path = path;
        this.category = category;
        this.owner = owner;
        this.uploaded = uploaded;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getUploaded() {
        return uploaded;
    }

    public void setUploaded(String uploaded) {
        this.uploaded = uploaded;
    }

}
