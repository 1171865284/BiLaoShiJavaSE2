package day28.regex;

import java.util.TreeSet;

public class RegexText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		text_3();
	}

	/*
	 * 邮箱校验
	 */
	private static void text_3() {
		// TODO Auto-generated method stub
		String mail =  "weiguoping89@gmail.com";
		
		String regex = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.+([a-zA-Z0-9]{3})+";
		
		boolean b = mail.matches(regex);
		System.out.println(mail+":"+b);
	}

	/*
	 * 排序IP地址：
	 * 192.168.10.31
	 * 3.3.3.3
	 * 89.78.15.43
	 * 165.0.17.0
	 */
	private static void text_2() {
		// TODO Auto-generated method stub
		String str = "192.168.10.31 3.3.3.3 89.78.15.43 165.0.17.0";
		
		//夹两个00
		str = str.replaceAll("(\\d+)", "00$1");
		
		//保持每个字段是三位数
		str = str.replaceAll("0*(\\d{3})", "$1");
		
		//切出ip的地址
		String[] ips = str.split(" +");
		//使用TreeSer集合进行排序
		TreeSet<String> ts = new TreeSet<String>();
		for(String ip : ips){
//			System.out.println(ip);
			ts.add(ip);
		}
		for(String ip : ts){
			System.out.println(ip.replaceAll("0*(\\d+)","$1"));
		}
	}

	/*
	 * 我....我我我....我.....要要....要要....学学学....学.....编编编编编....编....程程程....程程程程程
	 */
	private static void text_1() {
		// TODO Auto-generated method stub
		
		//第一步去掉.用""代替
		String str = "我....我我我....我.....要要....要要....学学学....学.....编编编编编....编....程程程....程程程程程";
		str = str.replace(".", "");
		str = str.replaceAll("(.)\\1+", "$1");
		System.out.println(str);
	}
}
