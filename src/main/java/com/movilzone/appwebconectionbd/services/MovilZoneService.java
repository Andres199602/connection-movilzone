package com.movilzone.appwebconectionbd.services;

import com.movilzone.appwebconectionbd.models.BrandsModel;
import com.movilzone.appwebconectionbd.models.ProductsModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MovilZoneService {

    List<ProductsModel> showProducts();

    List<BrandsModel> showBrands();

}
