package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.junit.jupiter.api.Test;

class FileExistTest {

	@Test
	void testFileExist() 
		 {
			File file = new File("C:\\Bindu\\mytext.txt");
			File file1 = new File("C:\\Bindu\\mytex.txt");
			
			
	
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			assertEquals(true, file.exists());
			assertEquals(true, file.isFile());
		}

}
