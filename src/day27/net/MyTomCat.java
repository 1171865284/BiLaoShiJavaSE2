package day27.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyTomCat {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
			ServerSocket ss = new ServerSocket(9000);
			//开启Socket
			Socket s = ss.accept();//阻塞
			System.out.println(s.getInetAddress().getHostAddress());
			
			InputStream in = s.getInputStream();
			byte[] buf = new byte[1024];
			//因为在这个例子里面都是够装所以我们没有写循环
			int len = in.read(buf);
			String text = new String(buf, 0, len);
			System.out.println(text);
			/*while((len = in.read(buf)) != -1){
				String text = new String(buf, 0, len);
				System.out.println(text);
			}*/
			
			
			//输出额外的提示
			PrintWriter out = new PrintWriter(s.getOutputStream(), true);
			out.println("上传失败");
			
			s.close();
			ss.close();
			
	}

}
