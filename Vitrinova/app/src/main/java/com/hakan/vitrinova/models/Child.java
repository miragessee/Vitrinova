package com.hakan.vitrinova.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Child implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("parent_id")
    @Expose
    private Integer parentId;
    @SerializedName("order")
    @Expose
    private Integer order;
    @SerializedName("parent_category")
    @Expose
    private ParentCategory parentCategory;
    @SerializedName("logo")
    @Expose
    private Logo logo;
    @SerializedName("cover")
    @Expose
    private Cover cover;
    @SerializedName("children")
    @Expose
    private List<Object> children = null;
    public final static Parcelable.Creator<Child> CREATOR = new Creator<Child>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Child createFromParcel(Parcel in) {
            return new Child(in);
        }

        public Child[] newArray(int size) {
            return (new Child[size]);
        }

    }
            ;
    private final static long serialVersionUID = 3051625263490907403L;

    protected Child(Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.parentId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.order = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.parentCategory = ((ParentCategory) in.readValue((ParentCategory.class.getClassLoader())));
        this.logo = ((Logo) in.readValue((Logo.class.getClassLoader())));
        this.cover = ((Cover) in.readValue((Cover.class.getClassLoader())));
        in.readList(this.children, (java.lang.Object.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Child() {
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
    public Child(Integer id, String name, Integer parentId, Integer order, ParentCategory parentCategory, Logo logo, Cover cover, List<Object> children) {
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

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public ParentCategory getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(ParentCategory parentCategory) {
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

    public List<Object> getChildren() {
        return children;
    }

    public void setChildren(List<Object> children) {
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

