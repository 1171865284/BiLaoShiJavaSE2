package day24;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String str = "ab你好bc不";
		
		int len = str.getBytes("gbk").length;
		
		for(int x = 0; x < len; x++){
			System.out.println(cutStringByByte(str, x+1));
		}
	}

	public static String cutStringByByte(String str, int len) throws IOException{
		
		
		/*
		 * 思路：
		 * 	1.我们先要遍历这个字节数组
		 * 	2.遍历数组遍历出个数
		 * 	3.判断是否是单个
		 * 	4.若是单个的话我们就舍去
		 */
		
		byte[] buf = str.getBytes("gbk");
		
		//计数器
		int count = 0;
		for(int x = 0; x < len ; x--){
			if (count>0) {
				count++;
			}else {
				break;
			}
		}
		
		if (count%2==0) {
			return new String(buf,0,len,"gbk");
		}
		else {
			return new String(buf,0,len-1,"gbk");
		}
	}

}
