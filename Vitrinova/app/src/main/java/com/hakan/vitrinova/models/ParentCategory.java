package com.hakan.vitrinova.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ParentCategory implements Serializable, Parcelable
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
    public final static Parcelable.Creator<ParentCategory> CREATOR = new Creator<ParentCategory>() {


        @SuppressWarnings({
                "unchecked"
        })
        public ParentCategory createFromParcel(Parcel in) {
            return new ParentCategory(in);
        }

        public ParentCategory[] newArray(int size) {
            return (new ParentCategory[size]);
        }

    }
            ;
    private final static long serialVersionUID = 8149604693200001676L;

    protected ParentCategory(Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.parentId = ((Object) in.readValue((Object.class.getClassLoader())));
        this.order = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.parentCategory = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public ParentCategory() {
    }

    /**
     *
     * @param name
     * @param parentCategory
     * @param id
     * @param parentId
     * @param order
     */
    public ParentCategory(Integer id, String name, Object parentId, Integer order, Object parentCategory) {
        super();
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.order = order;
        this.parentCategory = parentCategory;
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

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(name);
        dest.writeValue(parentId);
        dest.writeValue(order);
        dest.writeValue(parentCategory);
    }

    public int describeContents() {
        return 0;
    }

}
