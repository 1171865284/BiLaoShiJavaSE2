package day18_2;

import day18.bean.Student;
import day18_2.bean.Tool;

/*
 * 程序功能：泛型的自定义类型
 * 程序员：魏国平
 * 编写时间：12月15日
 */

public class GenericDefineDemo3 {

	public static void main(String[] args) {

		/*Tool tool = new Tool();
		tool.setObject(new Student());
		Student stu = (Student) tool.getObject();*/
		
		Tool<Student> tool = new Tool<Student>();
		
		tool.setObject(new Student());
		Student stu = tool.getObject();
		
		
	}

}
