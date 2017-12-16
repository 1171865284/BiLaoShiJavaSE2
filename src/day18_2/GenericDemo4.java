package day18_2;

import day18_2.bean.Tool;

public class GenericDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tool<String> tool = new Tool<String>();
		
		tool.show(new Integer(4));
		tool.show("abc");
		tool.print("hahah");
		Tool.method("hahah");
		tool.method(new Integer(9));

	}

}
