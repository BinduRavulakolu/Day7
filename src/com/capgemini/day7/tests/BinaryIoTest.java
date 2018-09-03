package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.BinaryInteger;

class BinaryIoTest {

	@Test
	void test() {
		File file = new File("C:\\Bindu\\mytext.txt");
		assertEquals(1,BinaryInteger.writeBinary(file));
	}

}
