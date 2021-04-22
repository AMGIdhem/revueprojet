package com.miniprojet.revueprojet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miniprojet.revueprojet.entities.Auteur;
@Repository
public interface AuteurRepository extends JpaRepository<Auteur, Long>  {

}
