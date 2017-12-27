package day21.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReaderDemo {

	/**
	 * 
	 * @param args
	 * @throws IOException 
	 */
	
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("buf.txt");
		
		MyBufferedReader bufr = new MyBufferedReader(fr);
		
		String line = null;
		
		while((line=bufr.myReadLine())!=null){
			System.out.println(line);
		}
		
		bufr.myClose();
	}

}
