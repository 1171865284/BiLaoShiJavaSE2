package day21.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyMP3Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Copy_4();
	}

	//特别慢不介意使用
	private static void Copy_4() throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("D://0.mp3");
		FileOutputStream fos = new FileOutputStream("D://4.mp3");
		
		int ch = 0;
		
		while((ch = fis.read()) != -1){
			fos.write(ch);
		}
		
		fos.close();
		fis.close();
		
	}

	private static void Copy_3() throws IOException {
		// TODO Auto-generated method stub
		//使用available()进行输出
		FileInputStream fis = new FileInputStream("D://0.mp3");
		FileOutputStream fos = new FileOutputStream("D://3.mp3");
		
		byte [] buf = new byte[fis.available()];
		
		fis.read(buf);
		fos.write(buf);
		
		fis.close();
		fos.close();
	}

	private static void Copy_2() throws IOException {
		// TODO Auto-generated method stub
		
		//使用缓冲区的方法进行copy，但要记得刷新哦
		//还是不要刷新了，太慢了
		FileInputStream fis = new FileInputStream("D://0.mp3");
		BufferedInputStream bufis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("D://2.mp3");
		BufferedOutputStream bufos = new BufferedOutputStream(fos);
		
		byte[] buf = new byte[1024];
		int ch = 0;
		
		while((ch = bufis.read()) != -1){
			bufos.write(ch);
			bufos.flush();
		}
		
		bufis.close();
		bufos.close();
		
		
	}

	public static void Copy_1() throws IOException {
		// TODO Auto-generated method stub
		
		//读取文件
		FileInputStream fis = new FileInputStream("D://0.mp3");
		//写入文件（Copy）
		FileOutputStream fos = new FileOutputStream("D://1.mp3");
		
		byte[] buf = new byte[1024];
		int len = 0;
		while((len = fis.read(buf)) != -1){
			fos.write(buf, 0, len);
		}
		
		fis.close();
		fos.close();
		
	}

}
