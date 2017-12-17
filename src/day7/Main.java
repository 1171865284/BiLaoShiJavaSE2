package day7;

/*
 * 程序功能:主函数的使用
 * 程序员:魏国平
 * 编写时间:11月6日
 */

/*
 * 主函数特殊之处：
 * 1.格式是固定的
 * 2.被jvm所识别和调用
 * 
 * public:因为权限必须是最大的
 * static:不需要对象，直接用主函数所属类名调用即可
 * void：主函数没用具体的返回值
 * main:函数名，不是关键字，只是一个jvm识别的固定名字
 * String[] args:这是主函数的参数列表，是一个数组类型的参数，而且元素都是字符串类型
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(args);//[Ljava.lang.String;@15db9742
		System.out.println(args.length);
		System.out.println(args[0]);
	}

}
