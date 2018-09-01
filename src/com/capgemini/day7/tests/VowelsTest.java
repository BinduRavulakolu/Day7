package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class VowelsTest {

	@Test
	void test() {
		File file=new File("C:\\Bindu\\String.txt");
		assertEquals(19,Vowels.countVowels(file));
	}

}
