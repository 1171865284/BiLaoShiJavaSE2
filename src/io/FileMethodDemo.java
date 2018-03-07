package io;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class FileMethodDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		renameToDemo();
		getDemo();

	}

	private static void listRoots() {
		// TODO Auto-generated method stub
		
		/*File[] files = File.listRoots();
		
		for(File file : files){
			
			System.out.println(file);
		}*/

		String [] names = {"Tom","Jack", "pater"};
		
		for(String name :  names){
			System.out.println(name);
		}
	}

	private static void renameToDemo() {
		// TODO Auto-generated method stub
		
		
		File f1 = new File("G:\\google.mp3");
		
		File f2 = new File("G:\\SQL Server\\google.mp3");
		
		boolean b = f2.renameTo(f1);
		
		System.out.println(b);
	}

	//File判断
	private static void isDemo() {
		// TODO Auto-generated method stub
		
		File file = new File("G:\\a.txt");
		
//		boolean b = file.isDirectory();//判断该目录下是否有这个文件
		boolean b = file.isFile();
		System.out.println(b);
		
	}

	private static void CreateAndDeleteDemo() throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("G:\\file\\j\\k");
		
//		file.createNewFile();//创建文件
		
//		file.delete();//删除文件
		
		
		//创建一大串文件夹目录
		file.mkdirs();
	}

	private static void getDemo() {
		// TODO Auto-generated method stub
		
		/*
		 * File的方法
		 * 	获取：
		 * 		1.1：获取文件的名字
		 * 		1.1：获取文件的路径
		 * 		1.1：获取文件的大小
		 * 		1.1：获取文件的修改时间
		 */
		File file = new File("G:\\a.txt");
		
		//获取文件的名称
		String name = file.getName();
		//获取文件的绝对路径
		String Abspath = file.getAbsolutePath();
		//获取文件的相对路径
		String path = file.getPath();
		//获取文件的大小
		long len = file.length();
		//最后修改的时间
		long time = file.lastModified();
		
		//使用Date类使时间变的格式化
		Date date = new Date(time);
		
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		
		String str_time = dateFormat.format(date);
		
		System.out.println(Abspath);
		System.out.println(path);
//		System.out.println(date);
		System.out.println(str_time);
		System.out.println(len);
		
	}

}
