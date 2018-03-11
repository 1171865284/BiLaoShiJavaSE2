package day24;

/*
 * 程序功能：对象的序列话
 * 程序员：魏国平
 * 编写时间：2018年3月11日
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import day24.bean.Person;

public class ObjectStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

//		writerObject();//序列化
		readObject();//反序列化
	}

	private static void readObject() throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//反序列化对象
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("G:\\ObjectStream\\obj.object"));
		
		Person p = (Person) ois.readObject();
		
		System.out.println(p.getName() + ":" + p.getAge());
		
		ois.close();
		
	}

	private static void writerObject() throws IOException {
		// TODO Auto-generated method stub
		
		File dir = new File("G:\\ObjectStream");
		
		dir.mkdirs();
		
		//序列化文件就是将文件存储到硬盘当中，这样可以更好的存储文件，就是使数据生命周期持久化
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("G:\\ObjectStream\\obj.object"));
		
		//序列话对象我们必须调用Serializable接口
		oos.writeObject(new Person("小强", 19));
		
		oos.close();
	}

}
