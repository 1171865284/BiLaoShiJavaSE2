package day23.IO;

public class DiGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = getSum(5);
		System.out.println(sum);
//		toBin(6);
		System.out.println(1%2);
		System.out.println(1/2);
	}

	

	private static int getSum(int num) {
		// TODO Auto-generated method stub
		
		if (num==1) {
			return 1;
		}
		
		/*
		 * 循环未结束5+getSum(5-1)
		 * getSum(4)
		 * 9+getSum(4-1)
		 * getSum(3)
		 * 12+getSum(3-1)
		 * getSum(2)
		 * 14+getSum(2-1)
		 * getSum(1)
		 * 14+1
		 * 15
		 */
		return num + getSum(num - 1);
//		9,7,5,3,1
	}

	private static void toBin(int i) {
		// TODO Auto-generated method stub
		if(i > 0){
			/*
			 * toBin(6/2)----3
			 * ------sop(3%2)-------1
			 * toBin(3/2)----1
			 * ------ sop(1%2)------1
			 * tobin(1/2)----0
			 * ------ sop(0%2)------0
			 */
			toBin(i / 2);
			System.out.println(i % 2);
		}
	}
}
