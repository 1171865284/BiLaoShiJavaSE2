package day23.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

/*
 * 程序功能：IO---SquenceStreamDemo序列流
 * 将三个文件合并成为一个文件
 * 程序员：魏国平
 * 编写时间：2018年3月9日
 */

public class SequenceInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*//在这里我们要使用到枚举类排列这些文件
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		//进行添加
		v.add(new FileInputStream("G:\\sequenceInputStream\\1.txt"));
		v.add(new FileInputStream("G:\\sequenceInputStream\\2.txt"));
		v.add(new FileInputStream("G:\\sequenceInputStream\\3.txt"));
		//使用枚举将这些枚举封装起来,将次向量的枚举数组返回到en里面
		Enumeration<FileInputStream> en = v.elements();*/
		
		//现在我们使用数组来将文件合并，但是我觉得用枚举经行合并更好更随意
		ArrayList<FileInputStream> a1 = new ArrayList<FileInputStream>();
		
		for(int x = 0; x >= 3; x++){
			a1.add(new FileInputStream("G:\\sequenceInputStream\\"+x+".txt"));
		}
		
		Enumeration<FileInputStream> en = Collections.enumeration(a1);
		
		SequenceInputStream sis = new SequenceInputStream(en);
		
		FileOutputStream fis = new FileOutputStream("G:\\sequenceInputStream\\4.txt");
		
		byte[] buf = new byte[1024];
		
		int c = 0;
		
		while((c = sis.read(buf)) != -1){
			fis.write(buf, 0, c);
		}
		
		sis.close();
		fis.close();
		
		
	}

}
