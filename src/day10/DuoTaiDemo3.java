package day10;

/*
 * ������:��̬ʱ����Ա���ص�
 * ����Ա:κ��ƽ
 * ��дʱ��:11��9��
 */
/*
 * ��̬ʱ��
 * ��Ա���ص㣺
 * 1.��Ա������
 * 	����ʱ���ο������ͱ������������е��Ƿ��е��õĳ�Ա�������У�����ͨ����û�У�����ʧ��
 * 	����ʱ���ο������ͱ������������е�ʦ���е��õĳ�Ա�����������и��������еĳ�Ա������
 * 	�򵥵�������������ж��ο��Ⱥŵ���ߡ�over
 * 	��Ϊ�˽�
 * 
 * 2.��Ա�������Ǿ�̬����
 * 	����ʱ���ο������ͱ������������е��Ƿ��е��õĺ������У�����ͨ����û�У�����ʧ�ܡ�
 * 	����ʱL�ο���ʱ���������������Ƿ���õĺ�����
 * 	��˵�����뿴��ߣ����п��ұ�
 * 
 * 3.��̬������
 * 	����ʱ���ο������ͱ������������е��Ƿ��е��õľ�̬����
 * 	����ʱ���ο������ͱ������������е��Ƿ��е��õľ�̬����
 * 	��˵����������ж������
 * 
 * 	��ʵ���ھ�̬����������Ҫ����ġ�ֱ�����������ü��ɡ�
 */

class Fu2
{
//	int num = 3;
	void show()
	{
		System.out.println("fu show....");
	}
	
	static void method()
	{
		System.out.println("fu show static ...");
	}
}

class Zi2 extends Fu2
{
//	int num = 4;
	void show()
	{
		System.out.println("zi show.....");
	}
	
	static void method()
	{
		System.out.println("zi show static ...");
	}
}
public class DuoTaiDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fu2 f = new Zi2();
		f.method();
//		f.show();
//		System.out.println(f.num);
		
		/*��ǰ����ʽ
		 * Zi2 z = new Zi2();
		System.out.println(z.num);*/
	}

}
