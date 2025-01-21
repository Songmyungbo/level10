package _10컬렉션프레임워크;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

class Member2 implements Comparable<Member2>{
	String name;
	String id;
	
	
	
	
	public Member2(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}



	@Override
	public String toString() {
		return "Member2 [name=" + name + ", id=" + id + "]";
	}




	@Override
	public int compareTo(Member2 o) {
		if(name.compareTo(o.name) == 0) {
			return id.compareTo(o.id);
		}
		return name.compareTo(o.name);
		
	}
	
}

public class test{

	public static void main(String[] args) {

		
		ArrayList<Member2> list = new ArrayList<Member2>();
		
		list.add(new Member2("홍길동","test1"));
		list.add(new Member2("홍길동","test2"));
		list.add(new Member2("홍길동","test3"));
		list.add(new Member2("홍길동","test4"));
		
		TreeSet<Member2> list2 = new TreeSet<>();
		
		for(Member2 m : list) {
			list2.add(m);
			//System.out.println(m);
		}

		for(Member2 m : list2)
			System.out.println(m);
			
		
	}

}