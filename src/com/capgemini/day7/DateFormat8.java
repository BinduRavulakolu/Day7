package com.capgemini.day7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.tests.WeekDay;

class DateFormat8 {

	@Test
	void testWeekDay() {
	
			assertEquals("Saturday,September 01,2018",WeekDay.displayWeekDay());
			 
		}


}
