package day24;

/*
 * 程序功能：IO---ByteArrayStream
 * 程序员：魏国平
 * 编写时间：2018年3月12日
 */

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ByteArrayInputStream bis = new ByteArrayInputStream("abcdef".getBytes());
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		//直接读取
		int ch = 0;
		
		while((ch = bis.read()) != -1){
			bos.write(ch);
		}
		
		//我们写到控制台上
		System.out.println(new String(bos.toString()));
		
	}

}
