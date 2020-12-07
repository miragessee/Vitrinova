package com.hakan.vitrinova.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Featured implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("cover")
    @Expose
    private Cover cover;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("sub_title")
    @Expose
    private String subTitle;
    public final static Parcelable.Creator<Featured> CREATOR = new Creator<Featured>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Featured createFromParcel(Parcel in) {
            return new Featured(in);
        }

        public Featured[] newArray(int size) {
            return (new Featured[size]);
        }

    }
            ;
    private final static long serialVersionUID = 2355968660620812207L;

    protected Featured(Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.cover = ((Cover) in.readValue((Cover.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.subTitle = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Featured() {
    }

    /**
     *
     * @param cover
     * @param subTitle
     * @param id
     * @param type
     * @param title
     */
    public Featured(Integer id, String type, Cover cover, String title, String subTitle) {
        super();
        this.id = id;
        this.type = type;
        this.cover = cover;
        this.title = title;
        this.subTitle = subTitle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(type);
        dest.writeValue(cover);
        dest.writeValue(title);
        dest.writeValue(subTitle);
    }

    public int describeContents() {
        return 0;
    }

}
