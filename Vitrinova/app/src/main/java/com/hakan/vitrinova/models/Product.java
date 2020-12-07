package com.hakan.vitrinova.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Product implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("code")
    @Expose
    private Object code;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("definition")
    @Expose
    private String definition;
    @SerializedName("old_price")
    @Expose
    private Integer oldPrice;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("stock")
    @Expose
    private Integer stock;
    @SerializedName("max_installment")
    @Expose
    private Object maxInstallment;
    @SerializedName("commission_rate")
    @Expose
    private Integer commissionRate;
    @SerializedName("cargo_time")
    @Expose
    private Integer cargoTime;
    @SerializedName("is_cargo_free")
    @Expose
    private Boolean isCargoFree;
    @SerializedName("is_new")
    @Expose
    private Boolean isNew;
    @SerializedName("reject_reason")
    @Expose
    private Object rejectReason;
    @SerializedName("category_id")
    @Expose
    private Integer categoryId;
    @SerializedName("difference")
    @Expose
    private String difference;
    @SerializedName("is_editor_choice")
    @Expose
    private Boolean isEditorChoice;
    @SerializedName("comment_count")
    @Expose
    private Integer commentCount;
    @SerializedName("is_owner")
    @Expose
    private Boolean isOwner;
    @SerializedName("is_approved")
    @Expose
    private Boolean isApproved;
    @SerializedName("is_active")
    @Expose
    private Boolean isActive;
    @SerializedName("share_url")
    @Expose
    private String shareUrl;
    @SerializedName("is_liked")
    @Expose
    private Boolean isLiked;
    @SerializedName("like_count")
    @Expose
    private Integer likeCount;
    @SerializedName("shop")
    @Expose
    private Shop shop;
    @SerializedName("category")
    @Expose
    private Category category;
    @SerializedName("images")
    @Expose
    private List<Image> images = null;
    public final static Parcelable.Creator<Product> CREATOR = new Creator<Product>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        public Product[] newArray(int size) {
            return (new Product[size]);
        }

    }
            ;
    private final static long serialVersionUID = 8667994217435324690L;

    protected Product(Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.code = ((Object) in.readValue((Object.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.slug = ((String) in.readValue((String.class.getClassLoader())));
        this.definition = ((String) in.readValue((String.class.getClassLoader())));
        this.oldPrice = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.price = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.stock = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.maxInstallment = ((Object) in.readValue((Object.class.getClassLoader())));
        this.commissionRate = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.cargoTime = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.isCargoFree = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.isNew = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.rejectReason = ((Object) in.readValue((Object.class.getClassLoader())));
        this.categoryId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.difference = ((String) in.readValue((String.class.getClassLoader())));
        this.isEditorChoice = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.commentCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.isOwner = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.isApproved = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.isActive = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.shareUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.isLiked = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.likeCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.shop = ((Shop) in.readValue((Shop.class.getClassLoader())));
        this.category = ((Category) in.readValue((Category.class.getClassLoader())));
        this.images = new ArrayList<Image>();
        in.readList(this.images, (Image.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Product() {
    }

    /**
     *
     * @param commissionRate
     * @param code
     * @param shop
     * @param likeCount
     * @param title
     * @param isActive
     * @param rejectReason
     * @param isOwner
     * @param price
     * @param definition
     * @param id
     * @param stock
     * @param isApproved
     * @param slug
     * @param images
     * @param oldPrice
     * @param maxInstallment
     * @param isLiked
     * @param isNew
     * @param isEditorChoice
     * @param commentCount
     * @param isCargoFree
     * @param difference
     * @param shareUrl
     * @param category
     * @param categoryId
     * @param cargoTime
     */
    public Product(Integer id, Object code, String title, String slug, String definition, Integer oldPrice, Integer price, Integer stock, Object maxInstallment, Integer commissionRate, Integer cargoTime, Boolean isCargoFree, Boolean isNew, Object rejectReason, Integer categoryId, String difference, Boolean isEditorChoice, Integer commentCount, Boolean isOwner, Boolean isApproved, Boolean isActive, String shareUrl, Boolean isLiked, Integer likeCount, Shop shop, Category category, List<Image> images) {
        super();
        this.id = id;
        this.code = code;
        this.title = title;
        this.slug = slug;
        this.definition = definition;
        this.oldPrice = oldPrice;
        this.price = price;
        this.stock = stock;
        this.maxInstallment = maxInstallment;
        this.commissionRate = commissionRate;
        this.cargoTime = cargoTime;
        this.isCargoFree = isCargoFree;
        this.isNew = isNew;
        this.rejectReason = rejectReason;
        this.categoryId = categoryId;
        this.difference = difference;
        this.isEditorChoice = isEditorChoice;
        this.commentCount = commentCount;
        this.isOwner = isOwner;
        this.isApproved = isApproved;
        this.isActive = isActive;
        this.shareUrl = shareUrl;
        this.isLiked = isLiked;
        this.likeCount = likeCount;
        this.shop = shop;
        this.category = category;
        this.images = images;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Integer getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Integer oldPrice) {
        this.oldPrice = oldPrice;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Object getMaxInstallment() {
        return maxInstallment;
    }

    public void setMaxInstallment(Object maxInstallment) {
        this.maxInstallment = maxInstallment;
    }

    public Integer getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(Integer commissionRate) {
        this.commissionRate = commissionRate;
    }

    public Integer getCargoTime() {
        return cargoTime;
    }

    public void setCargoTime(Integer cargoTime) {
        this.cargoTime = cargoTime;
    }

    public Boolean getIsCargoFree() {
        return isCargoFree;
    }

    public void setIsCargoFree(Boolean isCargoFree) {
        this.isCargoFree = isCargoFree;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public Object getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(Object rejectReason) {
        this.rejectReason = rejectReason;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getDifference() {
        return difference;
    }

    public void setDifference(String difference) {
        this.difference = difference;
    }

    public Boolean getIsEditorChoice() {
        return isEditorChoice;
    }

    public void setIsEditorChoice(Boolean isEditorChoice) {
        this.isEditorChoice = isEditorChoice;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Boolean getIsOwner() {
        return isOwner;
    }

    public void setIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
    }

    public Boolean getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(Boolean isApproved) {
        this.isApproved = isApproved;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public Boolean getIsLiked() {
        return isLiked;
    }

    public void setIsLiked(Boolean isLiked) {
        this.isLiked = isLiked;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(code);
        dest.writeValue(title);
        dest.writeValue(slug);
        dest.writeValue(definition);
        dest.writeValue(oldPrice);
        dest.writeValue(price);
        dest.writeValue(stock);
        dest.writeValue(maxInstallment);
        dest.writeValue(commissionRate);
        dest.writeValue(cargoTime);
        dest.writeValue(isCargoFree);
        dest.writeValue(isNew);
        dest.writeValue(rejectReason);
        dest.writeValue(categoryId);
        dest.writeValue(difference);
        dest.writeValue(isEditorChoice);
        dest.writeValue(commentCount);
        dest.writeValue(isOwner);
        dest.writeValue(isApproved);
        dest.writeValue(isActive);
        dest.writeValue(shareUrl);
        dest.writeValue(isLiked);
        dest.writeValue(likeCount);
        dest.writeValue(shop);
        dest.writeValue(category);
        dest.writeList(images);
    }

    public int describeContents() {
        return 0;
    }

}