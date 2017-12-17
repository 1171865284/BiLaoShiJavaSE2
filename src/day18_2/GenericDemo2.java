package day18_2;

import java.util.Iterator;
import java.util.TreeSet;

import day18_2.bean.ComparatorByName;
import day18_2.bean.Person;

public class GenericDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Person> ts = new TreeSet<Person>(new ComparatorByName());
		ts.add(new Person("lisi8", 21));
		ts.add(new Person("lisi3", 23));
		ts.add(new Person("lisi", 21));
		ts.add(new Person("lisi0", 20));
		
		Iterator<Person> it = ts.iterator();
		while(it.hasNext())
		{
			Person p = it.next();
			System.out.println(p.getName() + ":" + p.getAge());
		}
	}

}
