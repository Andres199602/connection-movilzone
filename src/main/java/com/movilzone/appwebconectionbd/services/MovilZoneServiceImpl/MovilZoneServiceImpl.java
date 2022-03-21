package com.movilzone.appwebconectionbd.services.MovilZoneServiceImpl;

import com.movilzone.appwebconectionbd.models.BrandsModel;
import com.movilzone.appwebconectionbd.models.ProductsModel;
import com.movilzone.appwebconectionbd.repositories.BrandsRepository;
import com.movilzone.appwebconectionbd.repositories.ProductsRepository;
import com.movilzone.appwebconectionbd.services.MovilZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovilZoneServiceImpl implements MovilZoneService {

    @Autowired
    ProductsRepository productsRepository;

    @Autowired
    BrandsRepository brandsRepository;

    @Override
    public List<ProductsModel> showProducts() {
        return productsRepository.findAll();
    }

    @Override
    public List<BrandsModel> showBrands() {
        return brandsRepository.findAll();
    }
}
