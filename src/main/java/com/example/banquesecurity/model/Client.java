package com.example.banquesecurity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue
    private Integer id;
    private String nom;
    private String prenom;

    @ManyToMany
    private List<Role> roleList = new ArrayList<>();

    public void addRole(Role role) {
        this.roleList.add(role);
    }
}
