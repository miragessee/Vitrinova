package com.hakan.vitrinova.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Collection implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("definition")
    @Expose
    private String definition;
    @SerializedName("start")
    @Expose
    private String start;
    @SerializedName("end")
    @Expose
    private Object end;
    @SerializedName("share_url")
    @Expose
    private String shareUrl;
    @SerializedName("cover")
    @Expose
    private Cover cover;
    @SerializedName("logo")
    @Expose
    private Logo logo;
    public final static Parcelable.Creator<Collection> CREATOR = new Creator<Collection>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Collection createFromParcel(Parcel in) {
            return new Collection(in);
        }

        public Collection[] newArray(int size) {
            return (new Collection[size]);
        }

    }
            ;
    private final static long serialVersionUID = 6730337585460283124L;

    protected Collection(Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.definition = ((String) in.readValue((String.class.getClassLoader())));
        this.start = ((String) in.readValue((String.class.getClassLoader())));
        this.end = ((Object) in.readValue((Object.class.getClassLoader())));
        this.shareUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.cover = ((Cover) in.readValue((Cover.class.getClassLoader())));
        this.logo = ((Logo) in.readValue((Logo.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Collection() {
    }

    /**
     *
     * @param cover
     * @param start
     * @param logo
     * @param definition
     * @param end
     * @param shareUrl
     * @param id
     * @param title
     */
    public Collection(Integer id, String title, String definition, String start, Object end, String shareUrl, Cover cover, Logo logo) {
        super();
        this.id = id;
        this.title = title;
        this.definition = definition;
        this.start = start;
        this.end = end;
        this.shareUrl = shareUrl;
        this.cover = cover;
        this.logo = logo;
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

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public Object getEnd() {
        return end;
    }

    public void setEnd(Object end) {
        this.end = end;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    public Logo getLogo() {
        return logo;
    }

    public void setLogo(Logo logo) {
        this.logo = logo;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(title);
        dest.writeValue(definition);
        dest.writeValue(start);
        dest.writeValue(end);
        dest.writeValue(shareUrl);
        dest.writeValue(cover);
        dest.writeValue(logo);
    }

    public int describeContents() {
        return 0;
    }

}
