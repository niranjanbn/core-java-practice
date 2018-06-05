package test;

import java.util.HashSet;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean flag = false;
		
		try {
			if (flag) {
				while (true) {
				}
			} else {
				//System.exit(0);
			}
		} finally {
			System.out.println("In Finally");
		}
		
		HashSet shortSet = new HashSet();
		System.out.println(shortSet.size());
		for (short i = 0; i < 100; i++) {
			shortSet.add(i);
			shortSet.remove(i - 1);
		}
		System.out.println(shortSet.size());
		
		System.out.println((shortSet.toArray())[1]);
		
		String x = "abc";
		String y = "abc";
		x = x.concat( y );
		System.out.print(x);

	}

}
