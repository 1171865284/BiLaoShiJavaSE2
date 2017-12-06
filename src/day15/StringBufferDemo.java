package day15;

/*
 * 程序功能：StringBuffer----特点&以及应用
 * 程序员：魏国平
 * 编写时间：12月5日
 */

/*
 * StringBuffer:就是字符串缓冲去。
 * 用于存储数据的容器。
 * 特点：
 * 1.长度是可变的。
 * 2.可以存储不同类型的数据。
 * 3.最终要转成字符串
 * 4.可以对字符串进行修改
 * 
 * 
 * 既然是一个容器对象，应该具备什么功能呢？
 * 1.添加：
 * 		StringBuffer append(data);
 * 		StringBuffer insert(index, data);
 * 2.删除：
 * 		StringBuffer delete(start, end);包含头，不包含尾
 * 		StringBuffer deleteChatAt(int index);删除指定的元素
 * 3.查找：
 * 		char charAt(index);
 * 		int indexOf(string);
 * 		int lastIndexOf(string);
 * 3.修改：
 * 		StringBuffer replace(start end, string)
 * 		void setCharAt(index, char);
 * 
 * 增删改查C(create)U(update)R(read)D(delete)
 */
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bufferMethodDemo_1();
	}

	private static void bufferMethodDemo_1() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("abcd");
		
		//删除指定的缓冲区
//		sb.delete(1, 3);//ad
		
		//修改指定的缓冲区
//		sb.replace(1, 3, "nba");
		
		sb.setCharAt(2, 'q');
		
		//清空缓冲区。
//		sb.delete(0, sb.length());
		
		
//		sb.append("xixixi");//abcdxixixi
//		sb.insert(2, "qq");//abcqqd
		
//		System.out.println(sb.toString());
		
		//在剩余的字符长度里面填写空字符
		/*sb.setLength(10);
		
		System.out.println("sb:" + sb);
		System.out.println("len:" + sb.length());*/
		
		//反转
		System.out.println(sb.reverse());//dcqa
	}

	public static void bufferMethodDemo()
	{
		//创建缓冲区对象
		StringBuffer sb = new StringBuffer();
		
		sb.append(4);
		sb.append(true);
		System.out.println(sb);
		
//		StringBuffer s1 = sb.append(4);
		
//		System.out.println(sb);
//		System.out.println(s1);
//		System.out.println(s1==sb);//true
	}
}
