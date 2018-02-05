package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter fw = new FileWriter("G:\\HelloWorld.txt");
		
		fw.write("cc" +LINE_SEPARATOR + "lll");
		
		fw.close();
	}

}
