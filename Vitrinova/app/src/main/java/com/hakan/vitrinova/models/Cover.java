package com.hakan.vitrinova.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Cover implements Serializable, Parcelable
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
    @SerializedName("medium")
    @Expose
    private Medium medium;
    @SerializedName("thumbnail")
    @Expose
    private Thumbnail thumbnail;
    public final static Parcelable.Creator<Cover> CREATOR = new Creator<Cover>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Cover createFromParcel(Parcel in) {
            return new Cover(in);
        }

        public Cover[] newArray(int size) {
            return (new Cover[size]);
        }

    }
            ;
    private final static long serialVersionUID = -8018085460054450445L;

    protected Cover(Parcel in) {
        this.width = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.height = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.medium = ((Medium) in.readValue((Medium.class.getClassLoader())));
        this.thumbnail = ((Thumbnail) in.readValue((Thumbnail.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Cover() {
    }

    /**
     *
     * @param thumbnail
     * @param width
     * @param medium
     * @param url
     * @param height
     */
    public Cover(Integer width, Integer height, String url, Medium medium, Thumbnail thumbnail) {
        super();
        this.width = width;
        this.height = height;
        this.url = url;
        this.medium = medium;
        this.thumbnail = thumbnail;
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

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(width);
        dest.writeValue(height);
        dest.writeValue(url);
        dest.writeValue(medium);
        dest.writeValue(thumbnail);
    }

    public int describeContents() {
        return 0;
    }

}
