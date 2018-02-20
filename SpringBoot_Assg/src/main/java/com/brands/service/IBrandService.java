package com.brands.service;

import java.util.Collection;
import com.brands.entity.Brands;

public interface IBrandService {
	public Collection<Brands> getBrands() ;
	public Brands getBrand(int id);
	public Brands createBrand(Brands brand);
	public Brands updateBrand(Brands brand);
	public void deleteBrand(Brands brand);

}
