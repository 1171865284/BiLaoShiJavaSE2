package day23.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import javax.management.RuntimeErrorException;

/*
 * 程序功能：实现功能：一个应用程序开启5次后要求用户注册
 * 程序员：魏国平
 * 编写时间：
 */

/*
 * 思路：
 * 	1.我们先要定义计数器count
 * 	2.每次程序启动一次计数器就自增一次
 * 	3.自增到五次后程序提示你需要注册
 */

public class PropertiesTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		getAppCount_Copy();
		
	}

	private static void getAppCount_Copy() throws IOException {
		// TODO Auto-generated method stub
		
		//首先我们先创建File类对文件进行封装
		File confile = new File("G:\\count.properties");
		
		//如果没有的话再次创建一遍
		if (!confile.exists()) {
			confile.createNewFile();
		}
		
		FileInputStream fis = new FileInputStream(confile);
		
		Properties prop = new Properties();
		
		//将文件加载到集合当中
		prop.load(fis);
		
		//通过集合中的键获取次数
		String value = prop.getProperty("time");
		
		//使用count进行开启次数的计数
		int count = 0;
		if (value!= null) {
			count = Integer.parseInt(value);
			if (count >= 5) {
				throw new RuntimeException("您的试用以结束，请注册！");
			}
		}
		count++;
		System.out.println("穷逼已经使用" + count + "次");
		
		FileOutputStream fos = new FileOutputStream(confile);
		
		//将改变后的次数重新存储到集合中
		prop.setProperty("time", count+"");
		
		//将集合中的数据写入到文件当中
		prop.store(fos, "");
		
		fis.close();
		fos.close();
		
	}

	private static void getAppCount() throws IOException {
		// TODO Auto-generated method stub
		
		//将文件对象封装起来
		File confile = new File("G:\\count.properties");
		
		//先判断是否有这个文件
		if (!confile.exists()) {
			//若是没有的话我们创建一个
			confile.createNewFile();
		}
		
		FileInputStream fir = new FileInputStream(confile);
		
		//创建一个集合
		Properties prop = new Properties();
		
		//将文件加载到集合当中
		prop.load(fir);
		
		
		//通过集合中的键获取次数
		String value = prop.getProperty("time");
		
		//定义计数器进行计数
		int count = 0;
		//判断value不为空，如果为空
		if (value != null) {
			count = Integer.parseInt(value);
			if (count >= 5) {
				throw new RuntimeException("您的使用次数已过，请注册！");
			}
		}
		count++;
		System.out.println("这个屌丝使用了"+count+"次");
		
		//将记录到数据存储到集合当中
		prop.setProperty("time", count+"");
		
		//将记录的值写入到文件当中
		FileOutputStream fos = new FileOutputStream(confile);
		
		prop.store(fos, "");
		
		//记得要关闭流的资源哦
		fir.close();
		fos.close();
	}

}
