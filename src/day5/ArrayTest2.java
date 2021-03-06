package day5;

/*
 * 程序功能:获取一个整数的16进制表现形式
 * 程序员:魏国平
 * 编写时间:11月1日
 */
public class ArrayTest2 {

	//遍历数组的功能
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toHex(60);
	}
	/*
	 * 什么时候使用数组呢？
	 * 如果数据出现了对应关系，而且对应关系的一方是有序的数字编号，并作为角标作用
	 * 这时就必须要想到数组的使用
	 * 
	 * 就可以将这些数据存储带数组中
	 * 根据运算的结果作为角标直接取查数组中对应的元素即可
	 * 
	 * 这种方式，被称为查表法
	 */
	public static void toHex(int num)
	{
		for (int x = 0; x < 8; x++) {
			int temp = num & 15;
			if(temp > 9)
				System.out.println(temp);
			else
				num = num >>> 4;
		}
		/*int n1 = num & 15;
		System.out.println("n1 = " + n1);
		
		num = num >>> 4;
		int n2 = num & 15;
		System.out.println("n2 = " + n2);*/
	}
	
	public static void toHex_1(int num) {
		// TODO Auto-generated method stub
		//定义一个对应关系表
		char [] chs = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'E', 'F'};
		for (int x = 0; x < 8; x++) {
			int temp = num & 15;
			System.out.println(chs[temp] + "toH");
			num = num >>> 4;
		}
	}
	
	public static void toHex_2(int num)
	{
		//定义一个对应关系表
		char [] chs = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'E', 'F'};
		/*
		 * 一会查表会查到比较的数据
		 * 数据一朵，就先存储起来，在进行操作
		 * 所以定义一个数组，临时容器
		 */
		char [] arr = new char[8];
		int pos = 0;
		while(num!=0){
			int temp = num & 15;
			arr[pos++] = chs[temp];
			num = num >>> 4;
		}
		System.out.println("pos = " + pos);
		for (int x = 0; x < arr.length; x++) {
			System.out.println(arr[x] + ",");
		}
	}

}
