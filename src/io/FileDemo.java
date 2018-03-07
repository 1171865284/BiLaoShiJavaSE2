package io;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//书写文件地址
		File f1 = new File("G:\\b.txt");
		
		File f2 = new File("G:\\", "a.txt");
		
		File f = new File("G:\\");
		File f3 = new File(f, "a.txt");
		
		File f4 = new File("G:" + File.separator + "a.txt");
		
		System.out.println(f1);
		
	}

}
