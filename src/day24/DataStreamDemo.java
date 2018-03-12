package day24;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;

public class DataStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		write();
		read();
		
	}

	private static void read() throws IOException {
		// TODO Auto-generated method stub
		
		
		DataInputStream dis = new DataInputStream(new FileInputStream("G:\\DataStream\\data.txt"));
		
		
		//现在我们使用readUTF()
		String len = dis.readUTF();
		
		
		System.out.println(len);
	}

	private static void write() throws IOException {
		// TODO Auto-generated method stub
		
		File dir = new File("G:\\DataStream");
		dir.mkdirs();
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("G:\\DataStream\\data.txt"));
		
//		dos.write("你好".getBytes());
		
		dos.writeUTF("你好");
		
	}

}
