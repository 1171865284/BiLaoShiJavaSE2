package day15;

/*
 * 程序功能:常见功能的获取
 * 程序员：魏国平
 * 编写时间：12月4日
 */

/*
 * 按照面向对象的思想对字符串功能分类
 * “abcd”
 * 
 * 1.获取：
 * 1.1获取字符串中字符的个数（长度）。
 * 		int length();
 * 1.2根据位置获取字符
 * 		char charAt(int index);
 * 1.3根据字符获取在字符串中的位置
 * 		int indexOf(int ch);
 * 		int indexOf(int ch, int fromIndex);从指定位置进行ch的第一次出现位置
 * 		int indexOf(String str);
 * 		int indexOf(String str, int fromIndex);
 * 		int indexOf(String str, int fromIndex);
 * 		根据字符串回去在字符串中的第一次出现的位置
 * 		int lastIndexOf(int ch);
 * 		int lastIndexOf(int ch, int fromIndex);从指定位置进行ch的第一次出现的位置
 * 		int lastIndexOf(String str);
 * 		int lastIndexIf(String str, int fromIndex);
 * 1.4获取字符串中一部分字符串。也叫子串。
 * 		String substring(int beginIndex,int endIndex);包含begin,不包含end
 * 		String substring(int beginIndex);
 * 
 * 
 * 2.转换。
 * 		2.1 将字符串变成字符串数组（字符串的切割）
 * 			String[] (String regex);涉及到正则表达式
 * 		2.2 将字符串变成字符数组。
 * 			char[] toCHarArray();
 * 		2.3 将字符串变成字节数组
 * 			byte[] getBytes();
 * 		2.4  将字符串中的字母转成大小写。
 * 			String toUpperCase();大写
 * 			String toLowerCase();小写
 * 		2.5 将字符串中的内容进行替换
 * 			String replace(char oldch, char newch);
 * 			String replace(String s1, String s2);
 * 		2.6 将字符串两端的空格去除。
 * 			String trim();
 * 		2.7 将字符串进行连接。
 * 			String concat(string);
 * 3.判断
 * 		3.1 两个字符串内容是否相同啊？
 * 			boolean equals(Object obj);
 * 			boolean equalsIgnireCase(String str);忽略大小写比较字符串内容
 * 		3.2 字符串中是否包含指定字符串？
 * 			boolean contains(String str);
 * 		3.3 字符串是否以指定字符串开头，是否以指定字符串结尾
 * 			boolean startsWith(string);
 * 			boolean endsWith(string);
 * 4.比较字符串	
 */

public class StringMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringMethodDemo_4();
	}
	
	private static void StringMethodDemo_4() {
		// TODO Auto-generated method stub
		System.out.println("a".compareTo("A"));
	}

	private static void StringMethodDemo_3() {
		// TODO Auto-generated method stub
		String s = "abc";
		
		System.out.println(s.equals("ABC".toLowerCase()));
		System.out.println(s.equalsIgnoreCase("ABC"));
		
		System.out.println(s.contains("bc"));
		
		String str = "ArrayDemo.java";
		
		System.out.println(str.startsWith("Array"));
		System.out.println(str.endsWith(".java"));
		System.out.println(str.contains("Demo"));
	}

	private static void StringMethodDemo_2() {
		// TODO Auto-generated method stub
		String s = "张三,李四,王五";
		String[] arr = s.split(",");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		char[] chs = s.toCharArray();
		
		for (int i = 0; i < chs.length; i++) {
			System.out.println(chs[i]);
		}
		
		s = "ab你";
		byte[] bytes = s.getBytes();
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);
		}
		
		System.out.println("abc".toUpperCase());
		
		String s1 = "java";
		String s2 = s1.replace("q", "Z");
		System.out.println(s1==s2);
		
		//将字符串两段的空格取消
		System.out.println("-"+"  ab  c  ".trim() + "-");
		
		System.out.println("ja".concat("va"));
	}

	private static void StringMethodDemo_1() {
		// TODO Auto-generated method stub
		String s = "abcdea";
		
		System.out.println("Length:" + s.length());
		System.out.println("char:" + s.charAt(2));
//		System.out.println("index:" + s.indexOf('a'));//我们可以根据-1判断该字符串或者或者字符串是否存在
		System.out.println("index:" + s.lastIndexOf('a'));
		System.out.println("substring:" + s.substring(2, 4));
	}

}
