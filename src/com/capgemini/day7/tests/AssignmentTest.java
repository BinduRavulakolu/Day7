package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.Assignment;

class AssignmentTest {

	@Test
	void test() {
		
		File f1=new File("C:\\Bindu\\sub1.txt");
		File f2=new File("C:\\Bindu\\sub2.txt");
		File f3=new File("C:\\Bindu\\sub3.txt");
		File f4=new File("C:\\Bindu\\sub4.txt");
		
		Assignment a1=new Assignment(f1, LocalDate.of(2018,9,5));
		Assignment a2=new Assignment(f2, LocalDate.of(2018,9,8));
		Assignment a3=new Assignment(f3, LocalDate.of(2018,9,6));
		Assignment a4=new Assignment(f4, LocalDate.of(2018,9,9));
		
		assertEquals(true,Assignment.adding(a1));
		assertEquals(true,Assignment.adding(a2));
		assertEquals(true,Assignment.adding(a3));
		assertEquals(true,Assignment.adding(a4));
		
		assertEquals(true,Assignment.remove(a4));
		
		Assignment.show();
			System.out.println("\n");
			
		assertEquals(a1,Assignment.search());	
	 }

}
