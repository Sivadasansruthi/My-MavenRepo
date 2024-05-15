package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listprogram2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> l1=new ArrayList();
		l1.add(12);
		l1.add(32);
		l1.add(65);
		System.out.println(l1);
		System.out.println(l1.size());
		System.out.println(l1.isEmpty());
		Collections.sort(l1);
		System.out.println("After sorting:"+l1);
		l1.set(1,100);
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println("After sorting:"+l1);
		
		
		ArrayList<Float> a1=new ArrayList();
		a1.add(10.5f);
		a1.add(20.4f);
		a1.add(32.6f);
		System.out.println(a1);
		
		a1.remove(1);
		System.out.println(a1);
		
		
		
		
		
		

	}

}
