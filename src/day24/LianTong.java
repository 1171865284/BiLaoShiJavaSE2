package day24;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class LianTong {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//编码
		String str = "联通";
		byte[] buf = str.getBytes("gbk");
		
		/*String s1 = new String(buf,"gbk");
		
		System.out.println(s1);*/
		
		for(byte b : buf){
			System.out.println(Integer.toBinaryString(b&225));
		}
	}

}
