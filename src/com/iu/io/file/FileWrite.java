package com.iu.io.file;

import java.io.File;
import java.io.FileWriter;

public class FileWrite {
	
	public void write() throws Exception {
		File file = new File("c:\\study", "test.txt");
		FileWriter fw = new FileWriter(file, true);
		
		fw.write("Toaday is Friday\r\n");
		//fw.flush();
		
		fw.write("내일은 토요일\r\n");
		fw.flush();
		
	}

}