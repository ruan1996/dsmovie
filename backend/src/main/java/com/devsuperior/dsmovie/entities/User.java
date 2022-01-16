package com.devsuperior.dsmovie.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ig;
	private String email;
	
	public User() {

}

	public User(Long ig, String email) {

		this.ig = ig;
		this.email = email;
	}

	public Long getIg() {
		return ig;
	}

	public void setIg(Long ig) {
		this.ig = ig;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}