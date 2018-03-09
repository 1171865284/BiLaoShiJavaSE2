package day23.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StringCopyDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		CopyTxt();
	}

	private static void CopyTxt() throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bufr = new BufferedReader(new FileReader("G:\\PrintW.txt"));
		
		BufferedWriter bufw = new BufferedWriter(new FileWriter("G:\\PrintW_2.txt"));
		
		String line = null;
		
		while((line = bufr.readLine()) != null){
			bufw.write(line);
			bufw.newLine();
		}
		
		bufr.close();
		bufw.close();
	}

}
