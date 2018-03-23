package day28.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 程序功能：正则表达式：匹配--切割--替换--获取
 * 程序员：魏国平
 * 编写时间：3月22日
 */

public class RegexDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		functionDemo_1();
	}

	private static void functionDemo_4() {
		// TODO Auto-generated method stub
		String str = "da jia hao, wo shi wei guo ping";
		String regex = "[a-z]{3}";
		
		//将正则表达式封装成对象，使用pattern对象封装
		Pattern p = Pattern.compile(regex);
		//通过正则对象获取匹配器对象，使用Matcher对象匹配
		Matcher m = p.matcher(str);
		while(m.find()){
			System.out.println(m.group());
		}
	}

	private static void functionDemo_3() {
		// TODO Auto-generated method stub
		String str = "小强tttt小米mmmmm小红";
		//str = str.replaceAll("(.)\\1+", "#");//小强#小米#小红
//		str = str.replaceAll("(.)\\1+", "$1");//小强t小米m小红
		System.out.println(str);
	}

	/*
	 * 正则表达式：切割
	 */
	private static void functionDemo_2() {
		// TODO Auto-generated method stub
		String str = "小强tttt小米mmmmm小红";
		
		String[] names = str.split("(.)\\1+");
		
		for(String name : names){
			System.out.println(name);
		}
		
	}

	/*正则表达式---匹配手机号
	 * 1.手机号数纯数字
	 * 2.手机号是11位数
	 * 3.手机号的第二位数是(358)我也不知道为什么毕老师说的
	 * 4.第一位是数字1
	 */
	private static void functionDemo_1() {
		// TODO Auto-generated method stub
		
		String tel = "12345678901";
		tel = tel.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
		/*String regex = "1[358][0-9]{9}";
		boolean b = tel.matches(regex);
		System.out.println(tel+":" + b);*/
		System.out.println(tel);
		
	}

}
