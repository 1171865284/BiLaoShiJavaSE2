package day24;

/*
 * 程序功能：编码和解码
 * 程序员：魏国平
 * 编写时间：2018年3月12日
 */

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class EnCodeDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * 编码：
		 * 字符串--》字节数组
		 * 解码：
		 * 字节数组--》字符串
		 * UTF-8:-28 -67 -96 -27 -91 -67 
		 * GBK:-60 -29 -70 -61 
		 */
		
		EnCode_1();
	}

	/**
	 * @throws UnsupportedEncodingException
	 */
	public static void EnCode_1() throws UnsupportedEncodingException {
		//编码：
		String str = "大家好";
		
		//字符串转换为字节数组
		byte[] buf = str.getBytes("gbk");
		
//		printByte(buf);
		
		//解码：
		//字节数组转换为字符串	
		String s1 = new String(buf,"iso8859-1");
		
		System.out.println(s1);
		
		//这样的话我们提取储文件的源码,但是我们先要读取之前读取的那个数据
		byte[] buf2 = s1.getBytes("iso8859-1");//获取原字节
		String s2 = new String(buf2,"gbk");
		
		System.out.println(s2);
	}

	private static void printByte(byte[] buf) {
		// TODO Auto-generated method stub
		
		for(byte b : buf){
			System.out.print(b + " ");
		}
	}

}
