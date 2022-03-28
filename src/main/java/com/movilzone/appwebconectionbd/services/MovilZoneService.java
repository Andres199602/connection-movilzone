package com.movilzone.appwebconectionbd.services;

import com.movilzone.appwebconectionbd.models.BrandsModel;
import com.movilzone.appwebconectionbd.models.ClientsModel;
import com.movilzone.appwebconectionbd.models.ProductsModel;
import com.movilzone.appwebconectionbd.models.UserModel;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public interface MovilZoneService {

    List<ProductsModel> showProducts();

    List<BrandsModel> showBrands();

    String addClient(@RequestBody ClientsModel clientsModel);

    List<UserModel>login(String email, String password);

}
