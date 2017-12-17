package day12;

interface Inter
{
	void show(int a, int b);
	void func();
}

public class Test2
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//补足代码；调用两个函数，要求用匿名内部类
		
		Inter inter = new Inter(){

			@Override
			public void show(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println(a+b);
			}

			@Override
			public void func() {
				// TODO Auto-generated method stub
				System.out.println("hahahhahha");
			}
		};
		
		inter.show(3, 4);
		inter.func();
	}

}
