package day27.net;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class UploadTask implements Runnable {

	private Socket s;

	public UploadTask(Socket s) {
		super();
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 读取客户端发的数据
		int count = 0;
		try {
			InputStream in = s.getInputStream();
			// 键获读取到数据存储到一个文件中
			File dir = new File("G:\\TCP-pic");
			if (!dir.exists()) {
				dir.mkdirs();
			}
			File file = new File(dir, "server.jpg");
			//如果文件以及存在于服务气短
			if (dir.exists()) {
				file = new File(dir, (++count)+".jpg");
			}
			FileOutputStream fos = new FileOutputStream(file);
			byte[] buf = new byte[1024];
			int len = 0;
			while ((len = in.read(buf)) != -1) {
				fos.write(buf, 0, len);
			}
			// 没有以下步骤可以正常运行
			// 获取socket输出流，将上传成功的字样发挥客户端
			/*
			 * OutputStream out = s.getOutputStream(); out.write("上传成功".getBytes());
			 */

			fos.close();
			s.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
