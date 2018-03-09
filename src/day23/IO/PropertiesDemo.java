package day23.IO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 * 程序功能：Properties集合
 * 程序员：魏国平
 * 编写时间：2018年3月7日
 */

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		myLoad();
	}

	
	private static void myLoad() throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		
//		FileInputStream fis = new FileInputStream("G:\\info.txt");
		
		//使用缓冲区，然后读取文件
		BufferedReader bufr = new BufferedReader(new FileReader("G:\\info.txt"));
		
		String line = null;
		
		while((line = bufr.readLine()) != null){
			
			//判断字符的第一个是否是“#”，若是的话就直接跳过这个一行字符串
			if (line.startsWith("#")) {
				continue;
			}
			
			
			String[] arr = line.split("=");
			
			System.out.println(arr[0] + "::" + arr[1]);
		}
	}

	/*
	 * 使用Properties对象对配置文件进行修改
	 * 1.我们先要读取文件
	 * 2.我将读取的文件数据进行修改
	 * 3.将修改完成的数据再次写入到文件当中
	 * 要注意的事项：
	 * 1.先确定读取的那个文件是否为空
	 * 2.若是不存在的活我们就创建文件
	 */
	private static void test() throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("G:\\info.txt");
		
		//使用exists()方法判断指定地址中的文件是否存在
		if (!file.exists()) {
			//如实不存在我们就创建一个人文件
			file.createNewFile();
		}
		
		//在这里我们就要读取这个文件了
		FileReader fr = new FileReader(file);
		
		//然后使用Properties集合来存储修改的集合
		Properties prop = new Properties();
		
		//将流中的信息存储到集合当中
		prop.load(fr);
		
		//对文件中的数据进行修改
		prop.setProperty("wang", "18");
		
		//将修改的文件写入到指定的文件家中
		FileWriter fw = new FileWriter(file);
		
		//使用store()方法,将修改好的数据写入进去
		prop.store(fw, "");
		
//		prop.list(System.out);
		
		fw.close();
		fr.close();
		
	}

	private static void methodDemo_3() throws IOException {
		// TODO Auto-generated method stub
		
		//使用Properties对象
		Properties prop = new Properties();
		
		// 与文件相关联，使用FileInputStream对文件进行读取
		FileInputStream fis = new FileInputStream("G:\\info.txt");
		
		//使用Properties对象中的load()方法读取文件
		//但是文件中的数据必须是键值对形式的
		prop.load(fis);
		
		//使用list()方法将文件打印出来
		prop.list(System.out);
		
		
	}

	private static void methodDemo_2() throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();

		// 存储数据
		prop.setProperty("zhangsan", "30");
		prop.setProperty("lisi", "30");
		prop.setProperty("wangwu", "30");
		prop.setProperty("zhaoliu", "30");
		
		//我们使用字节流将数据写入指定的文件中
		FileOutputStream fos = new FileOutputStream("G:\\info.txt");
		
		prop.store(fos, "name+age");
		
		fos.close();
	}

	private static void methodDemo() {
		// TODO Auto-generated method stub

		Properties prop = new Properties();

		// 存储数据
		prop.setProperty("zhangsan", "30");
		prop.setProperty("lisi", "30");
		prop.setProperty("wangwu", "30");
		prop.setProperty("zhaoliu", "30");
		
		prop.list(System.out);
		
	}

	private static void PropertiesDemo() {
		// TODO Auto-generated method stub

		Properties prop = new Properties();

		// 存储数据
		prop.setProperty("zhangsan", "30");
		prop.setProperty("lisi", "30");
		prop.setProperty("wangwu", "30");
		prop.setProperty("zhaoliu", "30");

		// 取出所有的数据
		Set<String> names = prop.stringPropertyNames();

		for (String name : names) {
			// 获取数据
			String value = prop.getProperty(name);
			System.out.println(name + ":" + value);
		}

	}

}
