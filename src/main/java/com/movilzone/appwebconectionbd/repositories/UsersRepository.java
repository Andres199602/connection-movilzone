package com.movilzone.appwebconectionbd.repositories;

import com.movilzone.appwebconectionbd.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<UserModel, Long> {
    List<UserModel> findByCorreoAndPassword(String email, String password);
}