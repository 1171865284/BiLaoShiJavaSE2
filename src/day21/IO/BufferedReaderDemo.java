package day21.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	/**
	 * 
	 * @param args
	 * @throws IOException 
	 */
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr = new FileReader("buf.txt");
		
		BufferedReader bufr = new BufferedReader(fr);
		
		String line = null;
		
		while((line = bufr.readLine()) != null){
			System.out.println(line);
		}
		
		/*//readLine()方法是只读一行
		String line1 = bufr.readLine();
		System.out.println(line1);
		String line2 = bufr.readLine();
		System.out.println(line2);
		String line3 = bufr.readLine();
		System.out.println(line3);
		String line4 = bufr.readLine();
		System.out.println(line4);
		String line5 = bufr.readLine();
		System.out.println(line5);*/
	}

	/**
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void demo_1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("buf.txt");
		
		char[] buf = new char[1024];
		
		int len = 0;
		//阅读buf.txt中的内容
		while((len = fr.read(buf)) != -1){
			System.out.println(new String(buf, 0, len));
		}
		
		fr.close();
	}

}
