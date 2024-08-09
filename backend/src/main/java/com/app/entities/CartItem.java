package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "cartitemstable")
public class CartItem {

	
	//quantity , totalPrice , cart , product/menu
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "totalPrice")
	private double totalPrice;
	
	@OneToOne
	private Menu menu;
	
	@ManyToOne
	@JoinColumn(name = "cartId")
	private Cart cart;


	public CartItem(int quantity, double totalPrice, Menu menu, Cart cart) {
		super();
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.menu = menu;
		this.cart = cart;
	}
	
	
	
	
	
	
}
