package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class GrepTest {

	@Test
	void testGrepApp() {
		File file=new File("C:\\Bindu\\String.txt");
		assertEquals(true,Grep.stringSearch(file,"in"));

	}

}
