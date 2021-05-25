package com.mphasis;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		list.stream()
		.filter(i->i%2==0)
		.forEach(i->System.out.println(i*i));
	}

}
