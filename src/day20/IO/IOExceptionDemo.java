package day20.IO;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 程序功能：IO流异常的处理
 * 程序员：魏国平
 * 编写时间：12月24日
 */

public class IOExceptionDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.sperarator");

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			 fw = new FileWriter("k:\\demo.txt", true);

			fw.write("abcde" + LINE_SEPARATOR + "hahaha");

			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}finally {
			if(fw != null)
				try {
					fw.close();
				} catch (IOException e) {
					throw new RuntimeException("关闭失败");
					}
		}
	}

}
