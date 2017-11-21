package day8;

/*
 * 程序功能:
 * 程序员:魏国平
 * 编写时间:11月6日
 */
public class ArrayToolDemo {

	public static void main(String[] args) {
		int [] arr = {4, 8, 2, 9, 7, 6};
		
//		ArrayTool tool = new ArrayTool();
		int max = ArrayTool.getMax(arr);
		System.out.println("max = " + max);
	}
}