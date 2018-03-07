package day23.IO;

import java.io.File;

public class FileDelte {

	/*
	 * 遍历文件经行删除 一键删除所有文件以及文件夹的原理是先从里面向外删除
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File dir = new File("G:\\Test");

		removeDir(dir);
	}

	private static void removeDir(File dir) {
		// TODO Auto-generated method stub
		File[] files = dir.listFiles();

		for (File file : files) {

			if (file.isDirectory()) {
				// 这是我们就进行递归删除
				removeDir(file);
			} else {
				System.out.println("file:" + file.getName() + file.delete());
			}
		}
		System.out.println("dir:" + dir.getName() + dir.delete());
	}

}
