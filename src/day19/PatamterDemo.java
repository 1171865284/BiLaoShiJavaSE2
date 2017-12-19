package day19;

/*
 * 程序功能：jdk1.5特性--函数可变参数
 * 程序员：魏国平
 * 编写时间：12月19日
 */

public class PatamterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int sum = add(4, 5);
		System.out.println("sum = " + sum);
		int sum1 = add(4, 5, 6);
		System.out.println("sum1 = " + sum1);*/
		
		/*int[] arr = {5, 1, 4, 7, 3};
		int sum = add(arr);
		System.out.println("sum = " + sum);*/
		
		int sum = newAdd(1,2 ,3,3,4,4,5,6,6,3);
		System.out.println(sum);

		int sum1 = newAdd(1,2 ,3,3,4,4,5,6,6,3);
		System.out.println(sum1);
	}
	
	/*
	 * 函數的可变参数。
	 * 其实就是一个数组，但是接受的是数组的元素。
	 * 自动将这些元素封装成数组。简化了调用者的书写。
	 * 
	 * 注意：可变参数类型，必须定义在参数列表结尾。
	 */
	public static int newAdd(int ... arr){
		

		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		
		return sum;
	}
	
	
	public static int add(int[] arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static int add(int a, int b){
		
		return a + b;
	}

	public static int add(int a, int b , int c){
		
		return a + b + c;
	}
}
