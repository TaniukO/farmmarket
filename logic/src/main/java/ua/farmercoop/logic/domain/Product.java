package ua.saniok.web.shop.model.entity;

import java.util.List;

/**
 * Created by sAnCho on 17.08.2016.
 * @version 1.1 (03.12.2017)
 */
public class Product{

    private long id;
    private String name;
    private String description;
    private double price;
    private String mainImg;
    private String cetegory;
    private int avaibility;
    private int depot;
    private List<String> images;
    private List<ProductsFeatures> features;
    
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public double getPrice() {
		return price;
	}
	public String getMainImg() {
		return mainImg;
	}
	public String getCetegory() {
		return cetegory;
	}
	public int getAvaibility() {
		return avaibility;
	}
	public List<String> getImages() {
		return images;
	}
	public List<ProductsFeatures> getFeatures() {
		return features;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setMainImg(String mainImg) {
		this.mainImg = mainImg;
	}
	public void setCetegory(String cetegory) {
		this.cetegory = cetegory;
	}
	public void setAvaibility(int avaibility) {
		this.avaibility = avaibility;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}
	public void setFeatures(List<ProductsFeatures> features) {
		this.features = features;
	}


}
