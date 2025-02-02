package com.in28minutes.mockito.mockitodemo.service.impl;

import com.in28minutes.mockito.mockitodemo.service.DataService;

public class DataServiceImpl {

	private DataService dataService;
	
	public DataServiceImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	int findTheGreatestFromAllData() {
		int[] data = dataService.retrieveAllData();
		int greatest = Integer.MIN_VALUE;
		
		for (int value : data) {
			if(value > greatest) {
				greatest = value;
			}
		}
		
		return greatest;
	}
	
}
