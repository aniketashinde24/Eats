package com.app.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.app.dao.CustomerDao;
import com.app.pojos.Address;
import com.app.pojos.Cards;
import com.app.pojos.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerDao ud;
	
	@Value("${project.image}")
	private String path;

	@Override
	public Customer validate(Customer customer) {
		// TODO Auto-generated method stub
		Customer c=ud.findByUsernameAndPassword(customer.getUsername(),customer.getPassword());
		System.out.println("User is as follow "+c);
		return c;
		
		
	}

	@Override
	public List<Customer> findAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer registerCustomer(Customer newUser, MultipartFile file) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findCustomer(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int removecustomer(Long cust_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addAddress(Address newUserAddress, Long cust_Id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCard(Cards newUserDebitCard, Long cust_Id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Customer forgotCustomerPassword(Customer newUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer addUser(Customer newUserdata) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerCustomerphoto(MultipartFile file, Long cust_id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Customer getCustomerDetails(Long custid) {
		// TODO Auto-generated method stub
		return null;
	}

}
