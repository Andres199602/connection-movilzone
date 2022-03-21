package com.movilzone.appwebconectionbd.repositories;

import com.movilzone.appwebconectionbd.models.ProductsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<ProductsModel, Long> { }
