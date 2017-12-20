package day20;

import java.util.Random;

/*
 * 程序功能：Math类的使用
 * 程序员：魏国平
 * 编写时间：12月20日
 */

/*
 * Math:提供了操作数学运算的方法。都是静态的。
 * 
 * 常用方法：
 * ceil():返回大于参数的最小整数
 * floor():返回小于参数的最大整数
 * round:返回四舍五入
 * pow(a, b)
 */

public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		double d1 = Math.ceil(12.56);
//		double d2 = Math.floor(12.56);
//		double d3 = Math.round(12.56);
		
//		sop("d1 = " + d1);
//		sop("d2 = " + d2);
//		sop("d3 = " + d3);
		
//		double d = Math.pow(10, 2);
//		System.out.println(d);//100.0
		
		//随机数对象
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			
//			double d = Math.ceil((Math.random()*10));
//			double d = (int)(Math.random()*10+1);
			
//			double d = (int)(r.nextDouble()*6+1);
			int d = r.nextInt(10)+1;
			
			System.out.println(d);
			
		}
	}
	
	public static void sop(String string){
		System.out.println(string);
	}

}
