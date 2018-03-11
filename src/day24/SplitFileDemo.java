package day24;

/*
 * 程序功能：IO流---文件的切割
 * 程序员：魏国平
 * 编写时间：2018年3月10日
 */

/*
 * 思路：
 * 	1.这个是一个文件的切割功能，所以我们首先要明确源文件和文件目的
 * 	2.说到目的我们就应该好好想了，因为我们要把文件切割成文一个个定量大小的文件，例如都是1M大小的文件
 * 	3.所以文件的目的我们要写好，就是读1M写一个文件然后在读1M文件的数据，再写一个1M文件数据。
 * 	4.在这里我们要写好文件的目的地
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class SplitFileDemo {

	// 在这里我们再次进行了一次运算其实是浪费了资源哦！其实我们可以直接运算哦！
	private static final int SIZE = 1024 * 1024;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("G:\\1.mp3");

		split_2(file);

	}
	
	/*为了更加优化这个分割以及合并我们需要的是：
	 * 	我们不知道文件名甚至被分割成为了多少个破碎文件
	 * 	所以接下来的分割动作我们就要做一下添加功能：
	 * 	我们需要获取到：我们在分割动作的时候我们切割的是什么文件，我们切割到了多少个破碎文件。
	 * 	而为了做到这个动作我们可以使用properties集合：
	 *	我们可以通过我们切割了多少次（count）知道我们切割了多少个破碎文件
	 *	还有使用file.getName()知道被切割的源文件是什么。
	 *	在这里我们就很好的再次创了一个配置文件，在其中记录了我们切割了多少个破碎文件，以及源文件是什么名字的信息。
	 *	为下面的合并做好了准备。
	 * 	
	 */
	private static void split_2(File file) throws IOException {

		// 我们使用File类对象将这个文件封装起来
		// 输出流FileInputStream是一个字节流的对象
		FileInputStream fis = new FileInputStream(file);

		// 为了用户提体验我们不能把这个要切割的数值随意的暴露在用户面前
		byte[] buf = new byte[SIZE];

		// 在这里我们可以将文件写到某个指定的文件夹来更好的安排文件
		File dir = new File("G:\\Filepart");
		// 若是没有我们就创建
		if (!dir.exists()) {
			dir.mkdirs();
		}

		int len = 0;
		int count = 1;

		// 在这里我们使用properties对象用于记录切割文件的信息
		Properties prop = new Properties();

		// 因为我们不知道我们写入到那个文件夹中，甚至可以说我们不知道要写到那些文件夹中
		FileOutputStream fos = null;

		while ((len = fis.read(buf)) != -1) {

			fos = new FileOutputStream(new File(dir, (count++) + ".part"));
			fos.write(buf, 0, len);
			fos.close();
		}

		// 将文件的数据存储到集合当中
		prop.setProperty("partcount", count + "");
		prop.setProperty("filename", file.getName());

		// 记录切割的配置信息
		fos = new FileOutputStream(new File(dir, count + ".properties"));

		prop.store(fos, "save file info");

		// fis.close();
		fos.close();

	}

	public static void split(File file) throws IOException {

		// 我们使用File类对象将这个文件封装起来
		// 输出流FileInputStream是一个字节流的对象
		FileInputStream fis = new FileInputStream(file);

		// 为了用户提体验我们不能把这个要切割的数值随意的暴露在用户面前
		byte[] buf = new byte[SIZE];

		// 在这里我们可以将文件写到某个指定的文件夹来更好的安排文件
		File dir = new File("G:\\Filepart");
		// 若是没有我们就创建
		if (!dir.exists()) {
			dir.mkdirs();
		}

		int len = 0;
		int count = 1;

		// 因为我们不知道我们写入到那个文件夹中，甚至可以说我们不知道要写到那些文件夹中
		FileOutputStream fos = null;

		while ((len = fis.read(buf)) != -1) {

			fos = new FileOutputStream(new File(dir, (count++) + ".part"));
			fos.write(buf, 0, len);
			fos.close();
		}

		// fis.close();
		fos.close();

	}

}
