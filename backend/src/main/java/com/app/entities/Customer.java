package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "customertable")

public class Customer extends BaseEntity{
	@Column(name = "firstName",length = 50)
	private String firstName;
	
	@Column(name = "lastName",length = 50)
	private String lastName;
	
	@Column(name = "email",length = 50,unique = true)
	private String email;
	
	@Column(name = "password",length = 50)
	private String password;
	
	@Column(name = "username",length = 50)
	private String userName;
	
	@Column(name = "gender",length = 50)
	private Gender gender;
	
	@Column(name = "photo",length = 50)
	private String photo;
	
	@Column(name = "mobileNo",length = 10)
	private String mobileNo;
	
	
	
	
	//cart and remove cart fucntionality and Joining remaining.
	
	

}
