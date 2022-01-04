package com.example.banquesecurity.repositories;

import com.example.banquesecurity.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends JpaRepository<Client,Integer> {

    Client findClientByNom(String nom);
}
