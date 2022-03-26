package com.movilzone.appwebconectionbd.controller;

import com.movilzone.appwebconectionbd.models.ProductsModel;
import com.movilzone.appwebconectionbd.services.MovilZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class MovilZoneController {

    @Autowired
    MovilZoneService movilZoneService;

    @Autowired

    @GetMapping("/")
    public String movilZone(){
        return "Welcome to MovilZone";
    }

    @GetMapping("/products")
    public List showProducts(){
        return movilZoneService.showProducts();
    }

    @GetMapping("/brands")
    public List showBrands(){
        return movilZoneService.showBrands();
    }
}