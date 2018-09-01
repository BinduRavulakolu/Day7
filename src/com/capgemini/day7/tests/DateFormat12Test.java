package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateFormat12Test {

	@Test
	void test() {
		assertEquals(true, DateFormat12.checkMagic(2,2,04));
		assertEquals(false, DateFormat12.checkMagic(2,2,14));
	}

}
