package com.app.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.app.pojos.Address;
import com.app.pojos.Cards;
import com.app.pojos.Customer;

public interface CustomerService {
	//validating customer//sign in
	Customer validate(Customer customer);

	//show the c
	List<Customer> findAllUser();
	
	
	Customer registerCustomer(Customer newUser, MultipartFile file )throws IOException;
	
	Customer findCustomer(Long id);
	
	int removecustomer(Long cust_id);
	
	void addAddress(Address newUserAddress, Long cust_Id);
	
	void addCard(Cards newUserDebitCard, Long cust_Id);
	
	Customer forgotCustomerPassword(Customer newUser);
	
	Customer addUser(Customer newUserdata); 
	
	void registerCustomerphoto(MultipartFile file, Long cust_id);
	
	Customer getCustomerDetails(Long custid);
	
}
