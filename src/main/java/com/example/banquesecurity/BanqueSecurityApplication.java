package com.example.banquesecurity;

import com.example.banquesecurity.model.Client;
import com.example.banquesecurity.model.Role;
import com.example.banquesecurity.repositories.ClientRepository;
import com.example.banquesecurity.repositories.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class BanqueSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(BanqueSecurityApplication.class, args);
    }

    @Bean
    BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    //@Bean
    /*CommandLineRunner run(ClientRepository clientRepository, RoleRepository roleRepository) {
        return args -> {
            Role roleUser = roleRepository.save(new Role(null, "USER"));
            Role roleAdmin = roleRepository.save(new Role(null, "ADMIN"));

            Client User1 = clientRepository.save(new Client(null, "user1", "user1", new ArrayList<>()));
            Client Admin = clientRepository.save(new Client(null, "admin1", "admin1", new ArrayList<>()));

            User1.addRole(roleUser);
            Admin.addRole(roleAdmin);
        };
    }*/
}
