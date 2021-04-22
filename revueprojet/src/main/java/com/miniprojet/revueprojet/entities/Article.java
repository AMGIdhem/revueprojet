package com.miniprojet.revueprojet.entities;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Article {
	@Id
	@GeneratedValue
	private Long idArticle;
	private String titre;
	private String resume;
	private String affiliation;
	@ElementCollection
	@CollectionTable(name = "keywords")
	private List<String> keyWord;
	private String contenu;
	
	public Article() {
		
	}
}
