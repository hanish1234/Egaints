package com.brands.dao;
import java.util.Collection;

import com.brands.entity.Brands;

public interface BrandDaoInterface {
	
	public Collection<Brands> getBrands();
	public Brands getBrand(int id) ;
	public Brands createBrand(Brands brand);
	public Brands updateBrand(Brands brand);
	public void deleteBrand(Brands brand);

}
