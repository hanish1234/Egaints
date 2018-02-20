package com.brands.dao;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.brands.dao.IBrandsRepository;
import com.brands.dao.BrandDaoInterface;

import com.brands.entity.Brands;

@Repository
public class SpringDataBrandDaoImpl implements BrandDaoInterface {
	@Autowired
	 IBrandsRepository brandsRepo;
 
	@Override
	public Collection<Brands> getBrands() {
		return brandsRepo.findAll();
	}
	public Brands getBrand(int id) {
		return brandsRepo.findOne(id);
	}
	
	public Brands createBrand(Brands brand) {
		return brandsRepo.save(brand);
	}
	
	public Brands updateBrand(Brands brand) {
		return brandsRepo.save(brand);
	}
	
	public void deleteBrand(Brands brand) {
		brandsRepo.delete(brand);
	}

}
