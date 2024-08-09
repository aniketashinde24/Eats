package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "cartstable")
public class Cart extends BaseEntity{
	
	@Column(name = "totalAmount")
	private double totalAmount;
	
	@Column(name = "quantity")
	private int quantity;
	
	@OneToOne
	private Customer customer;
	
	@OneToMany(mappedBy = "cart",  orphanRemoval = true)
	List <CartItem> cartItems= new ArrayList<>();

	public Cart(double totalAmount, int quantity, Customer customer) {
		super();
		this.totalAmount = totalAmount;
		this.quantity = quantity;
		this.customer = customer;
		
	}
	
	//add to items table
	
	
	

}
