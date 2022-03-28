package com.movilzone.appwebconectionbd.repositories;

import com.movilzone.appwebconectionbd.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<UserModel, Long> {
    UserModel findByCorreo(String correo);
}