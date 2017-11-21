package day5;

public class MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-34, -19, -11, -109, -3, -56};
//		int max = getMax(arr);
//		int min = getMin(arr);
//		System.out.println("max = " + max);
//		System.out.println("min = " + min);
		selectSort(arr);
		for (int x = 0; x < arr.length; x++) {
			System.out.print(arr[x] + ",");
		}
	}
	/*
	 * 获取数组中的最大值
	 * 思路：
	 * 1.需要进行比较，并定义变量记录住每一次比较后较大的值
	 * 2，对数组中的元素进行遍历去除，和变量中记录的元素进行比较。
	 * 		如果遍历到的元素大于变量中记录的元素，就用变量记录住该大的值
	 * 3，遍历结束，该变量记录就是最大值
	 * 定义一个功能来实现
	 * 明确一，结果
	 * 		数组中的元素，int
	 * 明确二：未知内容
	 * 		数组
	 */
	public static int getMax(int[] arr)
	{
		//定义变量记录较大的值
		int max = arr[0];
		for (int x = 0; x < arr.length; x++) {
			if(arr[x] > max)
			{
				max = arr[x];
			}
		}
		return max;
	}
	//获取最大值
	public static int getMin(int[] arr) {
		//定义变量记录较小的值
		int min = arr[0];
		for (int x = 0; x < arr.length; x++) {
			if (arr[x] < min) {
				min = arr[x];
			}
		}
		return min;
	}
	/*
	 * 选择排序
	 */
	public static void selectSort(int[] arr)
	{
		for (int x = 0; x < arr.length-1; x++) {
			for (int y = x+1; y < arr.length; y++) {
				if (arr[x]>arr[y]) {
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}
		}
	}
	public static void bubbleSort(int[] arr){
		for (int x = 0; x < arr.length-1; x++) {
			for (int y = 0; y < arr.length-1; y++) {
				if (arr[y] > arr[y+1]) {
					int temp = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = temp;
				}
			}
		}
	}
}
