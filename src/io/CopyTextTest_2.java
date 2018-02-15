package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 程序功能：文本的复制--- 二
 * 程序员：魏国平
 * 编写时间：2018年2月6日
 */

public class CopyTextTest_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//首先我们读写这个文本数据，但是我们使用更高效的方法读取，那就是数组
		FileReader fr = null;
		FileWriter fw = null;
		try {
			//咱们先读取这个源文件
			fr = new FileReader("G:\\HelloWorld.txt");
			//然后再写到指定的文件当中
			fw = new FileWriter("G:\\CopyTextTest_2.txt");
			//在这里我们要创建一个数组,做为容器
			char[] buf = new char[1024];
			//接下来我们创建一个变量咯
			int len = 0;
			//我们读的是这个数组中的数据文件
			while((len = fr.read(buf)) != -1){
				//然后呢，我们就要写下她来
				//为了节约资源更高效的运行，我们使用了write(buf,star, end)
				fw.write(buf, 0, len);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("读取失败");
		}finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
