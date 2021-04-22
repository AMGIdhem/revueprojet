package com.miniprojet.revueprojet.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Auteur {
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	private String prenom;
	private String mdp;
	
	public Auteur() {
		
	}
}
