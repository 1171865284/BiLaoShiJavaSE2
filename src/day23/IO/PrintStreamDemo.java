package day23.IO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		PrintStream pr = new PrintStream("G:\\print.txt");
		
		//把内容答应到指定的文件当中
//		pr.print("jkl;");
		
//		pr.write(99);//将字节写入该流当中
		
		
		
		pr.close();
	}

}
