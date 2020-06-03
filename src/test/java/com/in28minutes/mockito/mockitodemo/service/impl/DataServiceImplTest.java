package com.in28minutes.mockito.mockitodemo.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.in28minutes.mockito.mockitodemo.service.DataService;

class DataServiceImplTest {

	@Test
	void findTheGreatestFromAllData() {
		DataServiceImpl dataService = new DataServiceImpl(new DataServiceStub());
		int result = dataService.findTheGreatestFromAllData();
		assertEquals(24, result);		
	}

}

//When create a new scenario, we create a new DataServiceStub
//So we don't reutilize code
class DataServiceStub implements DataService{
	@Override
	public int[] retrieveAllData() {
		return new int[] {24,16,12};
	}
}
