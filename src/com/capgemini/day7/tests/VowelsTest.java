package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.Vowels;

class VowelsTest {

	@Test
	void test() {
		File file=new File("C:\\Bindu\\String.txt");
		assertEquals(10,Vowels.countVowels(file));
		
	}

}
