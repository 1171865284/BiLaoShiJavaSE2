package day20.IO;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 程序功能：IO流Writer的使用---换行和续写
 * 程序员：魏国平
 * 编写时间：12月
 */

public class FileWriterDemo {

	//换行的方法
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub
		
		//创建一个可以往文件中写入字符数据的字符输出流对象。
		
		/*
		 * 既然是往一个文件中写入文字数据，那么在创建对象时，就必须明确该文件（用于存储数据的目的地）
		 * 
		 * 如果文件不存在，则会自动创建。
		 * 如果文件存在，则会被覆盖。
		 * 
		 * 如果构造函数中加入true,可以实现对文件写
		 */
		
	FileWriter fw = new FileWriter("demo.txt",true);
	
	/*
	 * 调用Writer对象中的writer(String)方法，写入数据。
	 * 
	 * 其实数据写入到临时存储缓冲区中。
	 */
	//对文本进行换行
//		fw.write("Java"+ LINE_SEPARATOR +"Tom");
//	fw.write("w"+LINE_SEPARATOR+"G");
	fw.write(LINE_SEPARATOR+"P");
	
	/*
	 * 进行刷新，将数据直接写到目的地中。
	 */
		fw.flush();
	
	/*
	 * 关闭流，关闭资源。在关闭前会调用flush刷新缓冲中的数据到目的地。
	 */
		fw.close();
//		fw.write("Hahah");//java.io.IOException: Stream closed
	}

}
