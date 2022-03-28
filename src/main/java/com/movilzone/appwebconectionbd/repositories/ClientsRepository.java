package com.movilzone.appwebconectionbd.repositories;

import com.movilzone.appwebconectionbd.models.ClientsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientsRepository extends JpaRepository <ClientsModel, Long> { }
