package com.masai.service;

import java.util.List;
import java.util.Map;

import com.masai.entities.Passenger;
import com.masai.entities.Bus;
import com.masai.entities.Transaction;
import com.masai.exceptions.DuplicateDataException;
import com.masai.exceptions.ProductException;
import com.masai.exceptions.TransactionException;

public interface BusService {

	public String addBuses(Bus pro, Map<Integer, Bus> Buses);

	public void viewAllBuses(Map<Integer, Bus> Buses) throws ProductException;

	public void deleteBus(int id, Map<Integer, Bus> Buses) throws ProductException;

	public String updateBus(int id, Bus prod, Map<Integer, Bus> Buses) throws ProductException;

	
	
}
