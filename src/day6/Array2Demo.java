package day6;

/*
 * 程序功能:二维数组的格式
 * 程序员:魏国平
 * 编写时间:11月2日
 */
public class Array2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*//创建一个二维数组，该数组中有三个一维数组，每一个一维数组有两个元素
		int[][] arr =  new int [3][2];
		//直接打印二维数组
		System.out.println(arr);
		//直接打印二维数组中的角标0的一维数组
		System.out.println(arr[0]);
		//直接打印二维数组中的角标0的一维数组为0的元素
		System.out.println(arr[0][0]);*/
		
		/*int [] [] arr = new int [3][2];
		//打印二位数组的长度，其实就是一维数组的个数
		System.out.println(arr.length);
		//打印二维数组中角标为1一维数组的长度
		System.out.println(arr[1].length);*/
		
		int sum = 0;
		int [][] arr = {{3, 1, 7},{5, 8, 2, 9},{4, 1}};
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr[x].length; y++) {
				sum += arr[x][y];
			}
		}
		System.out.println("sum = " + sum);
	}

}
