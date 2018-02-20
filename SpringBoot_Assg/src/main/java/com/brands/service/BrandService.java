package com.brands.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.brands.dao.BrandDaoInterface;
import com.brands.entity.Brands;

@Service
public class BrandService implements IBrandService {

	@Autowired
	private BrandDaoInterface springDataBrandDaoImpl;

	public Collection<Brands> getBrands() {
		return springDataBrandDaoImpl.getBrands();
	}

	public Brands getBrand(int id) {
		return springDataBrandDaoImpl.getBrand(id);
	}
	
	public Brands createBrand(Brands brand) {
		return springDataBrandDaoImpl.createBrand(brand);
	}
	
	public Brands updateBrand(Brands brand) {
		return springDataBrandDaoImpl.updateBrand(brand);
	}
	
	public void deleteBrand(Brands brand) {
		springDataBrandDaoImpl.deleteBrand(brand);
	}

}
	
