package day24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;

import javax.management.RuntimeErrorException;

import io.bean.SuffixFilter;

/*
 * 程序功能：文件的合并
 * 程序员：魏国平
 * 编写时间：3月10日
 */

public class MergeFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File dir = new File("G:\\Filepart");

		MergeFile_2(dir);
	}

	private static void MergeFile_2(File dir) throws IOException {
		// TODO Auto-generated method stub

		// 使用过滤器来过滤出配置文件
		File[] files = dir.listFiles(new SuffixFilter(".properties"));

		if (files.length != 1) {
			throw new RuntimeException(dir + "，该文件夹下没有配置文件或者不唯一！");
		}

		// 记录配置文件的对象
		File confile = files[0];

		// 在这里我们使用properties对象加载文件
		Properties prop = new Properties();
		// 先在我们来读取配置文件
		FileInputStream fis = new FileInputStream(confile);

		// 将配置文件加载到集合当中
		prop.load(fis);
		String filename = prop.getProperty("filename");
		int count = Integer.parseInt(prop.getProperty("partcount"));

		// 在这里我们就可以用到ArrayList<>集合数组来遍历配文件
		// 获取文件夹下的破碎文件
		File[] partFiles = dir.listFiles(new SuffixFilter(".part"));
		ArrayList<FileInputStream> a1 = new ArrayList<FileInputStream>();

		if (partFiles.length != (count - 1)) {
			throw new RuntimeException("碎片个数不对啊，应该是" + count + "个");
		}

		for (int x = 0; x < partFiles.length; x++) {
			a1.add(new FileInputStream(partFiles[x]));
		}

		Enumeration<FileInputStream> en = Collections.enumeration(a1);

		// 序列读取流
		SequenceInputStream sis = new SequenceInputStream(en);

		FileOutputStream fos = new FileOutputStream(new File(dir, filename));

		byte[] buf = new byte[1024];

		int len = 0;

		while ((len = sis.read(buf)) != -1) {
			fos.write(buf, 0, len);
		}
		sis.close();
		fos.close();
	}

	private static void MergeFile(File dir) throws IOException {
		// TODO Auto-generated method stub

		// 首先我们读取被切割的文件在这里我们有数组,vector效率太低了
		ArrayList<FileInputStream> a1 = new ArrayList<FileInputStream>();

		// 我们循环遍历那些文件
		for (int x = 1; x <= 9; x++) {
			a1.add(new FileInputStream(new File(dir, x + ".part")));
		}

		Enumeration<FileInputStream> en = Collections.enumeration(a1);

		// 序列读取流
		SequenceInputStream sis = new SequenceInputStream(en);

		FileOutputStream fos = new FileOutputStream(new File(dir, "1.mp3"));

		byte[] buf = new byte[1024];

		int len = 0;

		while ((len = sis.read(buf)) != -1) {
			fos.write(buf, 0, len);
		}
		sis.close();
		fos.close();
	}

}
