package com.hakan.vitrinova.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Thumbnail implements Serializable, Parcelable
{

    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("url")
    @Expose
    private String url;
    public final static Parcelable.Creator<Thumbnail> CREATOR = new Creator<Thumbnail>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Thumbnail createFromParcel(Parcel in) {
            return new Thumbnail(in);
        }

        public Thumbnail[] newArray(int size) {
            return (new Thumbnail[size]);
        }

    }
            ;
    private final static long serialVersionUID = -7287691948578129883L;

    protected Thumbnail(Parcel in) {
        this.width = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.height = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Thumbnail() {
    }

    /**
     *
     * @param width
     * @param url
     * @param height
     */
    public Thumbnail(Integer width, Integer height, String url) {
        super();
        this.width = width;
        this.height = height;
        this.url = url;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(width);
        dest.writeValue(height);
        dest.writeValue(url);
    }

    public int describeContents() {
        return 0;
    }

}
