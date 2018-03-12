package day24;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/*
 * 程序功能：IO流---管道流PipedStream---PipedInputStream---PipedOutputStream
 * 程序员：魏国平
 * 编写时间：2018年3月12日
 */

public class PipedStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// 输入，输出动作我们已经做完了，现在就是进行操作这些动作了

		PipedInputStream input = new PipedInputStream();
		PipedOutputStream output = new PipedOutputStream();

		input.connect(output);

		//用多线程操作这两个对象
		new Thread(new Input(input)).start();
		new Thread(new Output(output)).start();
	}

	// 创建两个流对象实现管道流的多线程操作

}

// 创建线程要使用到接口Runnable,我们现在做的是输入操作
class Input implements Runnable {

	private PipedInputStream in;

	// 创建构造函数
	public Input(PipedInputStream in) {
		this.in = in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 在线程中进行读取操作
		try {

			byte[] buf = new byte[1024];
			int len = in.read(buf);
			String s = new String(buf, 0, len);

			System.out.println("s = " + s);

			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Output implements Runnable {

	private PipedOutputStream out;

	public Output(PipedOutputStream out) {
		this.out = out;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			out.write("hi.我是管道工".getBytes());
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
