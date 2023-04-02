package com.masai.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.masai.entities.Passenger;
import com.masai.entities.Bus;
import com.masai.entities.Transaction;
import com.masai.exceptions.ProductException;
import com.masai.exceptions.TransactionException;

public class BusServicesImpl implements BusService {

	@Override
	public String addBuses(Bus prod, Map<Integer, Bus> products) {
		// TODO Auto-generated method stub
//as our ids are always unique thats why directly putting into products
		products.put(prod.getId(), prod);

		return "Bus added successfully";

	}

	@Override
	public void viewAllBuses(Map<Integer, Bus> products) throws ProductException {
		// TODO Auto-generated method stub
		if (products != null && products.size() > 0) {
			for (Map.Entry<Integer, Bus> me : products.entrySet()) {
				System.out.println(me.getValue());
			}

		} else {
			throw new ProductException("Bus List is empty");
		}
	}

	@Override
	public void deleteBus(int id, Map<Integer, Bus> products) throws ProductException {

		// System.out.println(products);
		if (products != null && products.size() > 0) {

			if (products.containsKey(id)) {
				products.remove(id);
				System.out.println("Bus deleted successfully");

			} else {
				throw new ProductException("Bus not found");
			}

		} else {
			throw new ProductException("Bus list is empty");
		}

	}

	@Override
	public String updateBus(int id, Bus prod, Map<Integer, Bus> products) throws ProductException {

		if (products != null && products.size() > 0) {

			if (products.containsKey(id)) {
				products.put(id, prod);
				return "Bus has successfully updated";
			} else {
				throw new ProductException("Bus not found");
			}

		} else {
			throw new ProductException("Bus list is empty");
		}

	}

}
