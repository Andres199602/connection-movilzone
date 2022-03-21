package com.movilzone.appwebconectionbd.repositories;

import com.movilzone.appwebconectionbd.models.BrandsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandsRepository extends JpaRepository<BrandsModel, Long> { }
