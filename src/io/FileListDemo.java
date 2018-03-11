package io;

/*
 * 功能：文件的过滤
 */
import java.io.File;
import java.util.Iterator;

import io.bean.FilterByHidden;
import io.bean.FilterByName;
import io.bean.SuffixFilter;

public class FileListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		listDemo_3();
	}

	private static void listDemo_4() {
		// TODO Auto-generated method stub
		File file = new File("G:\\soft");

		String[] names = file.list(new SuffixFilter(".txt"));
		for (String name : names) {
			System.out.println(name);
		}
	}

	private static void listDemo_3() {
		// TODO Auto-generated method stub
		File file = new File("D:\\");

		File[] names = file.listFiles(new FilterByHidden());

		for (File name : names) {
			System.out.println(name);
		}
	}

	private static void listDemo_2() {
		// TODO Auto-generated method stub

		File file = new File("G:\\");

		String[] names = file.list(new FilterByName());

		for (String name : names) {
			System.out.println(name);
		}
	}

	private static void listDemo() {
		// TODO Auto-generated method stub

		File file = new File("G:\\");

		String[] names = file.list();

		for (String name : names) {
			System.out.println(name);
		}

	}

}
