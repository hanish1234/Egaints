package com.brands.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.brands.entity.Brands;

public interface IBrandsRepository extends JpaRepository<Brands,Integer>{

} 