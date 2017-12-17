package day18_2.bean;


/*
 * 程序功能：是用来操作对象的工具类
 * 程序员：魏国平
 * 编写时间：
 */

/*public class Tool {

	private Object object;
	
	public Object getObject(){
		return object;
	}
	
	public void setObject(Object object)
	{
		this.object = object;
	}
}*/

//在jdk1.5后

public class Tool<QQ>{
	private QQ q;
	
	public QQ getObject(){
		return q;
	}
	
	public void setObject (QQ object){
		this.q = object;
	}
	
	/**
	 *  将泛型定义在方法上。
	 * @param str
	 */
	public <W> void show(W str){
		System.out.println("show:" + str.toString());
	}
	
	public void print(QQ str)
	{
		System.out.println("print:" + str);
	}
	
	/**
	 * 当方法静态时，不能访问类上定义的泛型。如果静态方法使用泛型，
	 * 只能将泛型定义在方法上。
	 * @param obj
	 */
	public static <Y> void method(Y obj)
	{
		System.out.println("method:" + obj);
	}
}