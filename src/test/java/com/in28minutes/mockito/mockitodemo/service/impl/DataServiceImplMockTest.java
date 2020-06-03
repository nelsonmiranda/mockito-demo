package com.in28minutes.mockito.mockitodemo.service.impl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import com.in28minutes.mockito.mockitodemo.service.DataService;

class DataServiceImplMockTest {

	@Test
	void findTheGreatestFromAllData() {
		
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,16,12});
		
		DataServiceImpl dataService = new DataServiceImpl(dataServiceMock);
		int result = dataService.findTheGreatestFromAllData();
		assertEquals(24, result);		
	}

	//We can easily create another scenario
	@Test
	void findTheGreatestFromAllData_ForOneValue() {
		
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
		
		DataServiceImpl dataService = new DataServiceImpl(dataServiceMock);
		int result = dataService.findTheGreatestFromAllData();
		assertEquals(15, result);		
	}
}
