package com.hakan.vitrinova.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Medium implements Serializable, Parcelable
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
    public final static Parcelable.Creator<Medium> CREATOR = new Creator<Medium>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Medium createFromParcel(Parcel in) {
            return new Medium(in);
        }

        public Medium[] newArray(int size) {
            return (new Medium[size]);
        }

    }
            ;
    private final static long serialVersionUID = -257429775158308671L;

    protected Medium(Parcel in) {
        this.width = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.height = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Medium() {
    }

    /**
     *
     * @param width
     * @param url
     * @param height
     */
    public Medium(Integer width, Integer height, String url) {
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
