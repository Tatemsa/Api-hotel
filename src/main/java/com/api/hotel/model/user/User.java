package com.api.hotel.model.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity()
@Table(name = "USERS")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "US_ID")
	private int id;

	@Column(name = "US_FIRST_NAME")
	private String  firstName;

	@Column(name = "US_SECOND_NAME")
	private String  secondName;

	@Column(name = "US_Email")
	private String email;

	@Enumerated(EnumType.STRING)
	@Column(name = "US_ROLE")
	private Role  role;

	public User() {

	}

	public User(int id, String firstName, String secondName, String email, Role role) {
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.email = email;
		this.role = role;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Role getRole() {
		return role;
	}
	public void setCode(Role role) {
		this.role = role;
	}

	public enum Role {
		CLIENT,
		EMPLOYEE,
		ADMIN
	}

	@Override
	public String toString() {
		return "User{" +
			"id=" + id +
			", firstName='" + firstName + '\'' +
			", secondName='" + secondName + '\'' +
			", email='" + email + '\'' +
			", role=" + role +
			'}';
	}
}
