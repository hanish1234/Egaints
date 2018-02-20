package com.brands.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "brand")
public class Brands {

@Id
@Column(name="brand_id")
	private int brandID;
@Column(name="brand_name")
	private String brandName;

public Brands() {
	
}
	
	public Brands(int brandID, String brandName) {
		this.brandID = brandID;
		this.brandName = brandName;
	}

	public int getBrandID() {
		return brandID;
	}

	public void setBrandID(int brandID) {
		this.brandID = brandID;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	
}
