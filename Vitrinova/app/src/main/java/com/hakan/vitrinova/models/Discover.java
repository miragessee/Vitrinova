package com.hakan.vitrinova.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Discover implements Serializable, Parcelable
{

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("featured")
    @Expose
    private List<Featured> featured = null;
    @SerializedName("products")
    @Expose
    private List<Product> products = null;
    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;
    @SerializedName("collections")
    @Expose
    private List<Collection> collections = null;
    @SerializedName("shops")
    @Expose
    private List<Shop> shops = null;
    public final static Parcelable.Creator<Discover> CREATOR = new Creator<Discover>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Discover createFromParcel(Parcel in) {
            return new Discover(in);
        }

        public Discover[] newArray(int size) {
            return (new Discover[size]);
        }

    }
            ;
    private final static long serialVersionUID = 5031075689180202159L;

    protected Discover(Parcel in) {
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.featured, (Featured.class.getClassLoader()));
        in.readList(this.products, (Product.class.getClassLoader()));
        in.readList(this.categories, (Category.class.getClassLoader()));
        in.readList(this.collections, (Collection.class.getClassLoader()));
        in.readList(this.shops, (Shop.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Discover() {
    }

    /**
     *
     * @param featured
     * @param collections
     * @param shops
     * @param categories
     * @param type
     * @param title
     * @param products
     */
    public Discover(String type, String title, List<Featured> featured, List<Product> products, List<Category> categories, List<Collection> collections, List<Shop> shops) {
        super();
        this.type = type;
        this.title = title;
        this.featured = featured;
        this.products = products;
        this.categories = categories;
        this.collections = collections;
        this.shops = shops;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Featured> getFeatured() {
        return featured;
    }

    public void setFeatured(List<Featured> featured) {
        this.featured = featured;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Collection> getCollections() {
        return collections;
    }

    public void setCollections(List<Collection> collections) {
        this.collections = collections;
    }

    public List<Shop> getShops() {
        return shops;
    }

    public void setShops(List<Shop> shops) {
        this.shops = shops;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(type);
        dest.writeValue(title);
        dest.writeList(featured);
        dest.writeList(products);
        dest.writeList(categories);
        dest.writeList(collections);
        dest.writeList(shops);
    }

    public int describeContents() {
        return 0;
    }

}
