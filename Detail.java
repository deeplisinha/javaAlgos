package com.practice.learn;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Detail {

	public static void main(String[] args) {
		Person p1=new Person("ravi","male",29);
		Person p2=new Person("anav","male",31);
		Person p3=new Person("deep","female",26);
		Map<Integer,Person> map=new LinkedHashMap<Integer,Person>();
		map.put(001,p1);
		map.put(002,p2);
		map.put(003,p3);
		for(Map.Entry<Integer, Person> element: map.entrySet()) {
			System.out.println(element.getKey()+".."+element.getValue());
		}
		
		
	
	}
}


