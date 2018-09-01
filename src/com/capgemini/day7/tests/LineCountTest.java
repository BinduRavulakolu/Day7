package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class LineCountTest {
	int count=0;

	@Test
	void test() {
		File file = new File("C:\\Bindu\\mytext.txt");
		try(FileReader fileReader=new FileReader(file);
				BufferedReader reader = new BufferedReader(fileReader);)
		{
			String s;
			while( (s = reader.readLine()) != null)
			 count++;
			System.out.println(+count);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		assertEquals(3,count);
	}

}
