package com.hakan.vitrinova.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Shop implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("definition")
    @Expose
    private String definition;
    @SerializedName("name_updateable")
    @Expose
    private Boolean nameUpdateable;
    @SerializedName("vacation_mode")
    @Expose
    private Integer vacationMode;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("shop_payment_id")
    @Expose
    private Integer shopPaymentId;
    @SerializedName("product_count")
    @Expose
    private Integer productCount;
    @SerializedName("shop_rate")
    @Expose
    private Integer shopRate;
    @SerializedName("comment_count")
    @Expose
    private Integer commentCount;
    @SerializedName("follower_count")
    @Expose
    private Integer followerCount;
    @SerializedName("is_editor_choice")
    @Expose
    private Boolean isEditorChoice;
    @SerializedName("is_following")
    @Expose
    private Boolean isFollowing;
    @SerializedName("cover")
    @Expose
    private Cover cover;
    @SerializedName("share_url")
    @Expose
    private String shareUrl;
    @SerializedName("logo")
    @Expose
    private Logo logo;
    public final static Parcelable.Creator<Shop> CREATOR = new Creator<Shop>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Shop createFromParcel(Parcel in) {
            return new Shop(in);
        }

        public Shop[] newArray(int size) {
            return (new Shop[size]);
        }

    }
            ;
    private final static long serialVersionUID = 3937139378039405975L;

    protected Shop(Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.slug = ((String) in.readValue((String.class.getClassLoader())));
        this.definition = ((String) in.readValue((String.class.getClassLoader())));
        this.nameUpdateable = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.vacationMode = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.createdAt = ((String) in.readValue((String.class.getClassLoader())));
        this.shopPaymentId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.productCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.shopRate = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.commentCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.followerCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.isEditorChoice = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.isFollowing = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.cover = ((Cover) in.readValue((Cover.class.getClassLoader())));
        this.shareUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.logo = ((Logo) in.readValue((Logo.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Shop() {
    }

    /**
     *
     * @param isFollowing
     * @param nameUpdateable
     * @param productCount
     * @param commentCount
     * @param isEditorChoice
     * @param cover
     * @param createdAt
     * @param vacationMode
     * @param shopPaymentId
     * @param name
     * @param logo
     * @param definition
     * @param shareUrl
     * @param id
     * @param shopRate
     * @param followerCount
     * @param slug
     */
    public Shop(Integer id, String name, String slug, String definition, Boolean nameUpdateable, Integer vacationMode, String createdAt, Integer shopPaymentId, Integer productCount, Integer shopRate, Integer commentCount, Integer followerCount, Boolean isEditorChoice, Boolean isFollowing, Cover cover, String shareUrl, Logo logo) {
        super();
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.definition = definition;
        this.nameUpdateable = nameUpdateable;
        this.vacationMode = vacationMode;
        this.createdAt = createdAt;
        this.shopPaymentId = shopPaymentId;
        this.productCount = productCount;
        this.shopRate = shopRate;
        this.commentCount = commentCount;
        this.followerCount = followerCount;
        this.isEditorChoice = isEditorChoice;
        this.isFollowing = isFollowing;
        this.cover = cover;
        this.shareUrl = shareUrl;
        this.logo = logo;
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

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public Boolean getNameUpdateable() {
        return nameUpdateable;
    }

    public void setNameUpdateable(Boolean nameUpdateable) {
        this.nameUpdateable = nameUpdateable;
    }

    public Integer getVacationMode() {
        return vacationMode;
    }

    public void setVacationMode(Integer vacationMode) {
        this.vacationMode = vacationMode;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getShopPaymentId() {
        return shopPaymentId;
    }

    public void setShopPaymentId(Integer shopPaymentId) {
        this.shopPaymentId = shopPaymentId;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Integer getShopRate() {
        return shopRate;
    }

    public void setShopRate(Integer shopRate) {
        this.shopRate = shopRate;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(Integer followerCount) {
        this.followerCount = followerCount;
    }

    public Boolean getIsEditorChoice() {
        return isEditorChoice;
    }

    public void setIsEditorChoice(Boolean isEditorChoice) {
        this.isEditorChoice = isEditorChoice;
    }

    public Boolean getIsFollowing() {
        return isFollowing;
    }

    public void setIsFollowing(Boolean isFollowing) {
        this.isFollowing = isFollowing;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public Logo getLogo() {
        return logo;
    }

    public void setLogo(Logo logo) {
        this.logo = logo;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(name);
        dest.writeValue(slug);
        dest.writeValue(definition);
        dest.writeValue(nameUpdateable);
        dest.writeValue(vacationMode);
        dest.writeValue(createdAt);
        dest.writeValue(shopPaymentId);
        dest.writeValue(productCount);
        dest.writeValue(shopRate);
        dest.writeValue(commentCount);
        dest.writeValue(followerCount);
        dest.writeValue(isEditorChoice);
        dest.writeValue(isFollowing);
        dest.writeValue(cover);
        dest.writeValue(shareUrl);
        dest.writeValue(logo);
    }

    public int describeContents() {
        return 0;
    }

}
