package day5;

/*
 * 程序功能：数组常见功能：查找（折半查找）
 * 程序员：魏国平
 * 编写时间：11月1日
 */
public class ArrayDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4, 1, 5, 7,3, 8, 12, 2};
		int index = halfSearch(arr, 19);
		System.out.println("index = " + index);
	}
	//数组的常见功能:查找
	public static int getIndex(int [] arr, int key){
		for (int x = 0; x < arr.length; x++) {
			if(arr[x] == key)
			{
				return x;
			}
		}
		return -1;
	}
	/*
	 * 二分查找法
	 */
	public static int halfSearch(int [] arr, int key)
	{
		int max, min, mid;
		min = 0;
		max = arr.length-1;
		mid = (max + min)/2;
		while(arr[mid] != key){
			if (key>arr[mid]) {
				min = mid + 1;
			}
			else if (key < arr[mid]) {
				max = mid + 1;
			}
			if (max < min) {
				return -1;
			}
			mid = (max + min)/2;
		}
		return mid;
	}
	
	public static int halfSearch_2(int[] arr, int key){
		int max, min, mid;
		min = 0;
		max = arr.length-1;
		
		while(min<max)
		{
			mid = (max + min) / 2;
			if (key>arr[mid]) {
				mid = mid + 1;
			}
			else if (key<arr[mid]) {
				max = mid - 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
}
