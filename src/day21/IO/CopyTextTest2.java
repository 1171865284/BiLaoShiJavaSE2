package day21.IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextTest2 {

	private static final int BUFFER_SIZE = 1024;

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("IO流笔记.txt");
			fw = new FileWriter("CopyText.txt");
			
			//创建一个临时容器，用于缓存读取到的字符。
			char[] buf = new char[BUFFER_SIZE];
			
			//定义一个变量记录读取到的字符数，（其实就是往数组里装字符个数）
			int len = 0;
			while((len = fr.read(buf)) != -1){
				fw.write(buf, 0, len);
			}
			
		} catch (IOException e) {
//			System.out.println("读写失败");
			
			throw new RuntimeException("读写失败");
		}finally {
			try {
				if (fw != null) {
					fw.close();
				}
				if (fr != null) {

					fr.close();
				} 
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

	}

}
