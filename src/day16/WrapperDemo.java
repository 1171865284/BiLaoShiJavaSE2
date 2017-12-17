package day16;

/*
 * 程序功能：基本数据类型对象包装类----概述。
 * 程序员：魏国平
 * 编写时间：12月6日
 */

/*
 * 基本数据类型对象包装类。
 * 为了方便操作基本数据类型值，将其封装成了对象，在对象中定义了属性和行为丰富了该数据的操作。
 * 用于描述该对象的类就称为基本数据类型对象包装类。
 * 
 * byte		Byte
 * short	Short
 * int		Integer
 * long		Long
 * float	Float
 * double	Double
 * char		Character
 * boolean	Boolean
 * 
 * 该包装对象主要用于剧本类型和字符串之间的转换。
 * 
 * 基本类型---->字符串
 * 		1.基本类型数值+""
 * 		2.用String类中的静态方法valueOf(基本类型数值);
 * 		3.用Integer的静态方法valueOf(基本类型数值);
 * 
 * 字符串----->基本类型
 * 		1.使用包装类中的静态方法 xxx parseXxx("xxx类型的字符串")
 * 			int parseInt(intstring");
 * 			long parseLong("longstring");
 * 
 * 			boolean parseBoolean("booleanstring");
 * 			只有Character没有parse方法
 * 		2.如果字符串被Integer进行对象的封装。
 * 			可使用另一个非静态的方法，inValue();
 * 			将一个Integer对象转成基本数据类型值。
 * 
 * 
 */

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int num;
		
//		System.out.println(Integer.MAX_VALUE);
		
//		System.out.println(Integer.toBinaryString(-6));
		
//		int num = 4;
//		Integer i = new Integer(5);
		
//		int x = Integer.parseInt("123");//将字符串转换成数字
//		System.out.println(Integer.parseInt("123") + 1);
		
		/*if (Boolean.parseBoolean("true")) {
			
		}*/
		
		//把字符串封装成为对象
//		Integer i = new Integer("123");
		//然后使用intValue()方法转换成为整数
//		System.out.println(i.intValue());
		
		/*
		 * 整数具备不同的进制体现。
		 * 
		 * 十进制-->其他进制。
		 * 		toBinaryString
		 * 		tiOctalString
		 * 
		 * 其他进制-->十进制。
		 * 		parseInt("string", );
		 */
		System.out.println(Integer.toBinaryString(60));
		System.out.println(Integer.toOctalString(60));
		System.out.println(Integer.toHexString(60));
		
//		System.out.println(Integer.toString(60, 4));
//		其他进制---->十进制
//		System.out.println(Integer.parseInt("3c", 16));
		
		Integer a = new Integer("3");
		Integer b = new Integer(3);
		//比较的是地址
		System.out.println(a==b);
		//比较的是数值
		System.out.println(a.equals(b));
		
		System.out.println(a.compareTo(b));
	}

}
