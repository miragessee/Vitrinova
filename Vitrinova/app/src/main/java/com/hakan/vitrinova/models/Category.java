package com.hakan.vitrinova.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Category implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("parent_id")
    @Expose
    private Object parentId;
    @SerializedName("order")
    @Expose
    private Integer order;
    @SerializedName("parent_category")
    @Expose
    private Object parentCategory;
    @SerializedName("logo")
    @Expose
    private Logo logo;
    @SerializedName("cover")
    @Expose
    private Cover cover;
    @SerializedName("children")
    @Expose
    private List<Child> children = null;
    public final static Parcelable.Creator<Category> CREATOR = new Creator<Category>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Category createFromParcel(Parcel in) {
            return new Category(in);
        }

        public Category[] newArray(int size) {
            return (new Category[size]);
        }

    }
            ;
    private final static long serialVersionUID = -3666768595487729798L;

    protected Category(Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.parentId = ((Object) in.readValue((Object.class.getClassLoader())));
        this.order = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.parentCategory = ((Object) in.readValue((Object.class.getClassLoader())));
        this.logo = ((Logo) in.readValue((Logo.class.getClassLoader())));
        this.cover = ((Cover) in.readValue((Cover.class.getClassLoader())));
        in.readList(this.children, (Child.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Category() {
    }

    /**
     *
     * @param cover
     * @param children
     * @param name
     * @param parentCategory
     * @param logo
     * @param id
     * @param parentId
     * @param order
     */
    public Category(Integer id, String name, Object parentId, Integer order, Object parentCategory, Logo logo, Cover cover, List<Child> children) {
        super();
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.order = order;
        this.parentCategory = parentCategory;
        this.logo = logo;
        this.cover = cover;
        this.children = children;
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

    public Object getParentId() {
        return parentId;
    }

    public void setParentId(Object parentId) {
        this.parentId = parentId;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Object getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Object parentCategory) {
        this.parentCategory = parentCategory;
    }

    public Logo getLogo() {
        return logo;
    }

    public void setLogo(Logo logo) {
        this.logo = logo;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(name);
        dest.writeValue(parentId);
        dest.writeValue(order);
        dest.writeValue(parentCategory);
        dest.writeValue(logo);
        dest.writeValue(cover);
        dest.writeList(children);
    }

    public int describeContents() {
        return  0;
    }

}