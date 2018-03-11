package day24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		 writerFile();

		readFile();
		
//		randomFile();
	}

	private static void randomFile() throws IOException {
		// TODO Auto-generated method stub
		
		RandomAccessFile raf = new RandomAccessFile("G:\\RandomAccess\\raf.txt", "rw");
		
		//如果我们加了seek()方法我们就可以调用指针再指定的为止写入数据
		raf.seek(2*10);
		
		/*现在我们要思考一个问题，比如我们的用户名字不是两个字，他是三个字四个字五个字，这样的话怎么办
		 * 我们要将给他定义一个空间容器来存放这个名字
		 */
		
		
		
		
		//在样做不加seek()的话我们直接直接将前面的数据给覆盖了，不过也只是前面那部分覆盖掉了哦！
		raf.write("赵六".getBytes());
		raf.writeInt(102);
		
		raf.close();
		
	}

	private static void readFile() throws IOException {
		// TODO Auto-generated method stub

		RandomAccessFile raf = new RandomAccessFile("G:\\RandomAccess\\raf.txt", "rw");
		
		//随机读取我们想读取的信息，只要指针指定的信息
		raf.seek(2*10);

		// 因为是uft-8的编辑模式所以是6
		byte[] buf = new byte[10];
		raf.read(buf);

		String name = new String(buf);

		//我们使用readInt()方法来读取年龄这个int型数据
		int age = raf.readInt();

		System.out.println("name = " + name);
		System.out.println("age = " + age);
		
		System.out.println("pos = " + raf.getFilePointer());

		raf.close();
	}

	private static void writerFile() throws IOException {
		// TODO Auto-generated method stub

		File dir = new File("G:\\RandomAccess");

		dir.mkdirs();

		// RandomAccesssFile对象既能读也能写，但是他的都是windows文本无法解析的
		// 源文件和目的
		RandomAccessFile raf = new RandomAccessFile("G:\\RandomAccess\\raf.txt", "rw");

		// 字节数组
		raf.write("张三".getBytes());
		// 记事本解析的a但是我们的数字还是97
		raf.writeInt(97);
		raf.write("小强".getBytes());
		raf.writeInt(99);

		raf.close();
	}

}
