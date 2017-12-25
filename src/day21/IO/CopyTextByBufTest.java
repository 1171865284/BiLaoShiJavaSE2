package day21.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextByBufTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr = new FileReader("buf.txt");
		//读取缓冲区
		BufferedReader bufr = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("buf_Copy.txt");
		//写入缓冲区
		BufferedWriter bufw = new BufferedWriter(fw);
		
		String line = null;
		while((line = bufr.readLine()) != null){
			bufw.write(line);
			bufw.newLine();
			bufw.flush();
		}
		
		/*int ch = 0;
		
		while((ch = bufr.read()) != -1){
			bufw.write(ch);
		}*/
		
		bufr.close();
		bufw.close();
		
	}

}
