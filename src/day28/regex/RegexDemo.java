package day28.regex;

/*
 * 程序功能：校验QQ---正则表达式
 * 程序员：魏国平
 * 编写时间：3月22日
 */

public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String qq = "123456789012345";
//		checkQQ(qq);
		//正则表达式
		String regex = "[1-9][0-9]{4,14}";
		
		boolean b = qq.matches(regex);
		System.out.println(qq+","+b);
	}

	public static void checkQQ(String qq) {
		int len = qq.length();

		if (len >= 5 && len <= 15) {
			if (!qq.startsWith("0")) {
				try {
					long l = Long.parseLong(qq);
					
					System.out.println(l+"：正确");
				} catch (Exception e) {
					System.out.println(qq+"不能有字符");
				}
			}else {
				System.out.println(qq+"开头不能为0");
			}
		}else {
			System.out.println(qq+"长度错误");
		}

	}

}
