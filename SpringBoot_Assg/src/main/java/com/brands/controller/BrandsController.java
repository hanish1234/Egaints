package com.brands.controller;

import java.util.Collection;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.brands.entity.Brands;
import com.brands.service.IBrandService;

@RestController(value="/brands")
public class BrandsController {
	
	@Autowired
	private IBrandService brandService;

		@RequestMapping(method=RequestMethod.GET,produces= {"application/json","application/xml"})
		public @ResponseBody Collection<Brands> getAllBrand(){
			return brandService.getBrands();
		}
		
		@RequestMapping(value="/brand/{brandId}",method=RequestMethod.GET,produces= {"application/json","application/xml"})
		public @ResponseBody Brands getBrand(@PathVariable("brandId") int id){
			return brandService.getBrand(id);
		}
		
		@RequestMapping(value="/brand",method=RequestMethod.POST,consumes="application/json")
		public  Brands createBrand(@Valid @RequestBody Brands brand) {
			return brandService.createBrand(brand);
		} 	
		
		@RequestMapping(value="/brand/{brandId}",method=RequestMethod.PUT,consumes="application/json",produces="application/json")
		public  void updateBrand(@PathVariable("brandId") int brandId,@Valid @RequestBody Brands brand) {
			if(brandId==brand.getBrandID()) {
				brandService.updateBrand(brand);
			}else
				return;
		} 

		@DeleteMapping ("/brand/{id}")
		public ResponseEntity<Brands> createUser(@PathVariable(value = "id") int brandId) {
				Brands brand = brandService.getBrand(brandId);
				if(brand == null)
			{
				return ResponseEntity.notFound().build();
			}
			 brandService.deleteBrand(brand);
			 return ResponseEntity.ok().build();
		}

}

		

