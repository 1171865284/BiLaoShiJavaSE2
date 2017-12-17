package day18_2;

/*
 * 程序功能：泛型接口
 * 程序员：魏国平
 * 编写时间：12月16日
 */

public class GenericDefineDemo5 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterImpl in = new InterImpl();
		in.show("abc");
		
		InterImpl2<Integer> in2 = new InterImpl2<Integer>();
		in2.show(5);
	}

}

//泛型接口，将泛型定义在接口上。就是泛型接口
//将泛型定义在类上就是泛型类。
interface Inter<T>{
	public void show(T t);
}

class InterImpl implements Inter<String>{

	@Override
	public void show(String str) {
		// TODO Auto-generated method stub
		System.out.println("show:" + str);
	}
	
}

class InterImpl2<Q> implements Inter<Q>{

	@Override
	public void show(Q q) {
		// TODO Auto-generated method stub
		System.out.println("show:" + q);
	}
	
}