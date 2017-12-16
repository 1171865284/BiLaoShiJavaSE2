package day18_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import day18.bean.Student;
import day18_2.bean.Person;
import day18_2.bean.Worker;

public class GenericAdvanceDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Person> al1 = new ArrayList<Person>();

		al1.add(new Person("abc", 30));
		al1.add(new Person("abc4", 34));

		ArrayList<Person> al2 = new ArrayList<Person>();

		al2.add(new Person("abc22222", 30));
		al2.add(new Person("abc422222", 34));
		

		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("abcdef");
		al4.add("abc");
		
		al1.containsAll(al4);
		
		System.out.println(al1);
		
		"abc".equals(new Person("ahahah", 20));
		
		
	}

	public static void printCollection(Collection<?> al) {
		Iterator<?> it = al.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

class MyCollection2<E> {
	public boolean containsAll(){
		return true;
		}
}