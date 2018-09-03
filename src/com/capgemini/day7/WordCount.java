package com.capgemini.day7;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class WordCount {
int count;
	@Test
	void test() {
		File file = new File("C:\\Bindu\\mytext.txt");
		try(FileReader fileReader=new FileReader(file);
				BufferedReader reader = new BufferedReader(fileReader);)
		{
			String s ;
			while( (s = reader.readLine()) != null) {
			 String word[]=s.split(" ");
			count+= word.length;
		} 
		
			}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		assertEquals(6,count);
	}


}
