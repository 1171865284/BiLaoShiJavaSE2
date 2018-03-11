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

	private static File file;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File dir = new File("G:\\Filepart");

		MergeFile_2(dir);
	}

	/*
	 * 在我们在切割文件的时候我们就已经知道了我们切割了多少个文件，以及我们切割的文件源是什么名称。
	 * 但是我们是放在了一个（.properties）的配置文件里面了
	 * 所以接下来的第一步动作就是，我们需要读取这个配置文件中的数据来知道我们切割的配置文件有多少个碎片，源文件名称是什么
	 * 1.我们要将配置文件过滤出来
	 * 2.判断是否有或者配置文件是否有或则唯一
	 * 3.定义一个对象记录配置文件
	 * 定义一个对象记录配置的文件就是从FileList中找到那个配置文件记录起来
	 * File confile = files[0];
	 * 4.使用properties集合对象加载配置文件
	 * 5.将配置文件信息进行读取
	 * 6.将配置文件加载到集合当中
	 * 7.将配置文件中的我们需要的数据封装起来
	 * 接下来就和争创合并一个样
	 * 值得说的是合并就是使用SequenceInputStream对象来进行排序独处然后再写入
	 * 就和copy一样
	 */
	private static void MergeFile_2(File dir) throws IOException {
		// TODO Auto-generated method stub

		//将文件中的配置文件,既然用到了过滤器我们就想到了Filelist
		File[] files = dir.listFiles(new SuffixFilter(".properties"));
		
		//判断是否有或者配置文件是否有或则唯一
		if (files.length != 1) {
			throw new RuntimeException(dir+",该文件目录下配置文件不唯一");
		}
		
		//定义一个对象记录配置文件
		File confile = files[0];
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(confile);
		
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
