package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pId;
	private String pName;
	private String pDesc;
	private String pPhoto;
	private Integer pPrice;
	private Integer pDiscount;
	private Integer pQuality;
	
	@ManyToOne
	private Category category;

	public Product(Integer pId, String pName, String pDesc, String pPhoto, Integer pPrice, Integer pDiscount,
			Integer pQuality, Category category) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pDesc = pDesc;
		this.pPhoto = pPhoto;
		this.pPrice = pPrice;
		this.pDiscount = pDiscount;
		this.pQuality = pQuality;
		this.category = category;
	}

	public Product() {
		super();
		
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpDesc() {
		return pDesc;
	}

	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}

	public String getpPhoto() {
		return pPhoto;
	}

	public void setpPhoto(String pPhoto) {
		this.pPhoto = pPhoto;
	}

	public Integer getpPrice() {
		return pPrice;
	}

	public void setpPrice(Integer pPrice) {
		this.pPrice = pPrice;
	}

	public Integer getpDiscount() {
		return pDiscount;
	}

	public void setpDiscount(Integer pDiscount) {
		this.pDiscount = pDiscount;
	}

	public Integer getpQuality() {
		return pQuality;
	}

	public void setpQuality(Integer pQuality) {
		this.pQuality = pQuality;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pDesc=" + pDesc + ", pPhoto=" + pPhoto + ", pPrice="
				+ pPrice + ", pDiscount=" + pDiscount + ", pQuality=" + pQuality + ", category=" + category
				+ ", getpId()=" + getpId() + ", getpName()=" + getpName() + ", getpDesc()=" + getpDesc()
				+ ", getpPhoto()=" + getpPhoto() + ", getpPrice()=" + getpPrice() + ", getpDiscount()=" + getpDiscount()
				+ ", getpQuality()=" + getpQuality() + ", getCategory()=" + getCategory() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
