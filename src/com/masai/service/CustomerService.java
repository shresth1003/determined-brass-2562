package com.masai.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.masai.entities.Passenger;
import com.masai.entities.Bus;
import com.masai.entities.Transaction;
import com.masai.exceptions.DuplicateDataException;
import com.masai.exceptions.InvalidDetailsException;
import com.masai.exceptions.ProductException;
import com.masai.exceptions.TransactionException;

public interface CustomerService {

	public boolean login(String email,String password, Map<String, Passenger> customers) throws InvalidDetailsException;

	public void signUp(Passenger cus, Map<String, Passenger> customers) throws DuplicateDataException;

	public boolean buyProduct(int id, int qty, String email, Map<Integer, Bus> products,
			Map<String, Passenger> customers, List<Transaction> transactions)
			throws InvalidDetailsException, ProductException;

	public boolean addMoneyToWallet(double amount, String email, Map<String, Passenger> customers);

	public double viewWalletBalance(String email, Map<String, Passenger> customers);

	public Passenger viewCustomerDetails(String email, Map<String, Passenger> customers);

	public List<Passenger> viewAllCustomers(Map<String, Passenger> customers) throws ProductException;

}
