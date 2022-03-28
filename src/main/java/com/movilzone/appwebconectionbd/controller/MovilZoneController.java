package com.movilzone.appwebconectionbd.controller;

import com.movilzone.appwebconectionbd.models.ClientsModel;
import com.movilzone.appwebconectionbd.models.UserModel;
import com.movilzone.appwebconectionbd.repositories.ClientsRepository;
import com.movilzone.appwebconectionbd.repositories.UsersRepository;
import com.movilzone.appwebconectionbd.services.MovilZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3500)
public class MovilZoneController {

    @Autowired
    MovilZoneService movilZoneService;

    @Autowired
    ClientsRepository clientsRepository;

    @Autowired
    UsersRepository usersRepository;

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

    @PostMapping("/add-client")
    public String addClient(@RequestBody ClientsModel clientsModel){
        return movilZoneService.addClient(clientsModel);
    }

    @PostMapping("/login")
    public UserModel userModel(@RequestBody UserModel userModel) throws Exception {
        UserModel user = movilZoneService.findByCorreo(userModel.getCorreo());
        if ( user == null)
            throw new Exception();

        if (userModel.getPassword().equals(user.getPassword()))
            return user;

        throw new Exception();
    }


}