package com.fitness.userservice.models;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	@Column(unique = true)
	private String email;
	@Column(nullable = false)
	private String password;
	private String firstName;
	private String lastname;
	@Enumerated(EnumType.STRING)
	private UserRole role = UserRole.USER;
	@CreationTimestamp
	private LocalDateTime createdAT;
	@UpdateTimestamp
	private LocalDateTime updatedAT;
	public User(String id, String email, String password, String firstName, String lastname, UserRole role,
			LocalDateTime createdAT, LocalDateTime updatedAT) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastname = lastname;
		this.role = role;
		this.createdAT = createdAT;
		this.updatedAT = updatedAT;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public UserRole getRole() {
		return role;
	}
	public void setRole(UserRole role) {
		this.role = role;
	}
	public LocalDateTime getCreatedAT() {
		return createdAT;
	}
	public void setCreatedAT(LocalDateTime createdAT) {
		this.createdAT = createdAT;
	}
	public LocalDateTime getUpdatedAT() {
		return updatedAT;
	}
	public void setUpdatedAT(LocalDateTime updatedAT) {
		this.updatedAT = updatedAT;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
