package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		for(int i=0;i<=10;i++) {
			al.add(i);
		}
		
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()) {
			Integer I=itr.next();
			if(I%2==0) {
				System.out.println(I);
			}
		}
	}

}
