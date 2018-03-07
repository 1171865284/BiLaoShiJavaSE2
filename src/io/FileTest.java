package io;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File dir = new File("G:\\Test");

		listAll(dir, 0);
	}

	public static void listAll(File dir, int levle) {
		// TODO Auto-generated method stub

		System.out.println(getSpace(levle) + dir.getName());
		//设置文件夹目录的阶层
		levle++;

		// 获取指定目录下的文件以及文件夹目录
		File[] files = dir.listFiles();
		
		/*for (int x = 0; x < files.length; x++) {

			if (files[x].isDirectory()) {
				listAll(files[x]);
			} else {
				System.out.println("file:" + files[x].getAbsolutePath());
			}

		}*/

		// 遍历指定目录下的文件名称
		for (File file : files) {

			// 如果是文件夹的话深入遍历
			if (file.isDirectory()) {
				listAll(file, levle);
			} else {
				System.out.println(getSpace(levle)+file.getName());
			}

		}
	}

	private static String getSpace(int levle) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		
		//输出打印levle为"|--"
		sb.append("|--");
		for(int x = 0; x < levle; x++)
		{
			//使用insert()方法在0之前插入"|  "
			sb.insert(0, "|  ");
		}
		
		return sb.toString();
	}
}
