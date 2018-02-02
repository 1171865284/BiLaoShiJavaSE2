package day22.IO;

import java.io.IOException;
import java.io.InputStream;

/*
 * 程序功能：读取一个键盘录入的数据，并打印在控制台上
 * 程序员：魏国平
 * 编写时间：12月27日
 */


/*
 * 思路：
 * 键盘本身就是一个输入设备
 * 对java而言，对于这种输入设备都有对应的对象。
 */
public class ReadKey {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		readKey2();
		
	}

	private static void readKey2() throws IOException {
		
		/*
		 * 获取用户键盘录入的数据
		 * 并将数据变成大写显示在控制台上，
		 * 如果用户输入的over，结束键盘录入
		 * 
		 * 思路：
		 * 1.因为键盘录入只读取一个字节，要判断是否时over，需要先将读取到的字节拼成字符串。
		 * 2.需要一个容器。StringBuilder
		 * 3.在用户回车之前将录入的数据变成字符串判断即可。
		 */
		
		//1.创建容器
		StringBuilder sb = new StringBuilder();
		
		//2.获取键盘读取流
		InputStream in = System.in;
		
		//3.定义变量记录读取到的字节，并循环获取
		int ch = 0;
		
		while((ch = in.read()) != -1){
			
			//在存储之前需要判断判断是否是换行标记，因为换行标记不存储
			if(ch == '\r')
				continue;
			if(ch == '\n'){
				String temp = sb.toString();
				if ("over".equals(temp))
					break;
				System.out.println(temp.toUpperCase());
				sb.delete(0, sb.length());
			}
			
			else {
				//将读取到的字节存储到StringBuilder中
				sb.append((char)ch);
				
				//将没有录入到sb.append((char)ch)的数据都打印出来
//				System.out.println((char)ch);
			}
			
			
		}
	}

//	//键盘录入数据
//	private static void readKey() throws IOException {
//		// TODO Auto-generated method stub
//		
//		
//		InputStream in = System.in;
//		
//		int ch = in.read();
//		System.out.println(ch);
//	}

}
