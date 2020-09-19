
package com.pkminor.pagingwithfragments.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class Datum {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("firstname")
    @Expose
    private String firstname;
    @SerializedName("secondname")
    @Expose
    private String secondname;
    @SerializedName("surname")
    @Expose
    private String surname;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("profilepicture")
    @Expose
    private String profilepicture;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("updated")
    @Expose
    private String updated;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("role_count")
    @Expose
    private Integer roleCount;
    @SerializedName("engagements")
    @Expose
    private List<Engagement> engagements = null;
    @SerializedName("engagement_count")
    @Expose
    private Integer engagementCount;
    @SerializedName("documents")
    @Expose
    private List<Document> documents = null;
    @SerializedName("document_count")
    @Expose
    private Integer documentCount;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Datum() {
    }

    /**
     * 
     * @param documentCount
     * @param firstname
     * @param roleCount
     * @param gender
     * @param documents
     * @param created
     * @param title
     * @param secondname
     * @param engagementCount
     * @param password
     * @param phone
     * @param surname
     * @param profilepicture
     * @param engagements
     * @param id
     * @param updated
     * @param email
     * @param status
     */
    public Datum(Integer id, String firstname, String secondname, String surname, String gender, String phone, String email, String profilepicture, String status, String title, String created, String updated, String password, Integer roleCount, List<Engagement> engagements, Integer engagementCount, List<Document> documents, Integer documentCount) {
        super();
        this.id = id;
        this.firstname = firstname;
        this.secondname = secondname;
        this.surname = surname;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.profilepicture = profilepicture;
        this.status = status;
        this.title = title;
        this.created = created;
        this.updated = updated;
        this.password = password;
        this.roleCount = roleCount;
        this.engagements = engagements;
        this.engagementCount = engagementCount;
        this.documents = documents;
        this.documentCount = documentCount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilepicture() {
        return profilepicture;
    }

    public void setProfilepicture(String profilepicture) {
        this.profilepicture = profilepicture;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRoleCount() {
        return roleCount;
    }

    public void setRoleCount(Integer roleCount) {
        this.roleCount = roleCount;
    }

    public List<Engagement> getEngagements() {
        return engagements;
    }

    public void setEngagements(List<Engagement> engagements) {
        this.engagements = engagements;
    }

    public Integer getEngagementCount() {
        return engagementCount;
    }

    public void setEngagementCount(Integer engagementCount) {
        this.engagementCount = engagementCount;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public Integer getDocumentCount() {
        return documentCount;
    }

    public void setDocumentCount(Integer documentCount) {
        this.documentCount = documentCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Datum datum = (Datum) o;
        return id.equals(datum.id) &&
                Objects.equals(firstname, datum.firstname) &&
                Objects.equals(secondname, datum.secondname) &&
                Objects.equals(surname, datum.surname) &&
                Objects.equals(gender, datum.gender) &&
                Objects.equals(phone, datum.phone) &&
                email.equals(datum.email) &&
                Objects.equals(profilepicture, datum.profilepicture) &&
                Objects.equals(status, datum.status) &&
                Objects.equals(title, datum.title) &&
                Objects.equals(created, datum.created) &&
                Objects.equals(updated, datum.updated) &&
                Objects.equals(password, datum.password) &&
                Objects.equals(roleCount, datum.roleCount) &&
                Objects.equals(engagements, datum.engagements) &&
                Objects.equals(engagementCount, datum.engagementCount) &&
                Objects.equals(documents, datum.documents) &&
                Objects.equals(documentCount, datum.documentCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, secondname, surname, gender, phone, email, profilepicture, status, title, created, updated, password, roleCount, engagements, engagementCount, documents, documentCount);
    }
}
