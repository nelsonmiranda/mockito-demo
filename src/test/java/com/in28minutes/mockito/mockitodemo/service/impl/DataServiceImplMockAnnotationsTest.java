package com.in28minutes.mockito.mockitodemo.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.in28minutes.mockito.mockitodemo.service.DataService;

@ExtendWith(MockitoExtension.class)
public class DataServiceImplMockAnnotationsTest {

	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	DataServiceImpl dataService;
	
	@Test
	void findTheGreatestFromAllData() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,16,12});
		int result = dataService.findTheGreatestFromAllData();
		assertEquals(24, result);		
	}

	//We can easily create another scenario
	@Test
	void findTheGreatestFromAllData_ForOneValue() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
		int result = dataService.findTheGreatestFromAllData();
		assertEquals(15, result);		
	}
}
