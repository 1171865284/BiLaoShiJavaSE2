package day22.IO;

public class 九九乘法表 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] name = new String[]{"吴松","钱东宇","伏晨",
	            "陈陆","周蕊","林日鹏","何坤","关欣",};
	            int[] score = new int[]{89,90,98,56,60,91,93,85};
	            int max;
	            max = score[0];
	            int index = 0;
	            for(int i = 1; i < score.length; i++){
	            	//如果遍历max是score[0]和score[1]比较但是score[1]大,所以max
	            	//是score[1]之后在和score[3]比较，依此类推。
	                if(score[i] > max){
	                    max = score[i];
	                    index = i;
	                }
	            }
//	            Console.WriteLine("分数最高的是"+name[index]+"，分数是"+max);
	            System.out.println("分数最高的是"+name[index]+"，分数是"+max);

	}

}
