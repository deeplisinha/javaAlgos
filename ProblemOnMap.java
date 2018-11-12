package com.practice.learn;
import java.util.*;
import java.util.Map.Entry;

public class ProblemOnMap {

	public static void main(String[]args) {
		LinkedHashMap<String,String> map=new LinkedHashMap<String,String>(); {
			map.put("Deepali","patna");
			map.put("abhinav","gaya");
			map.put("ravi", "Patna");
			map.put("rupali","patna");
			for(Entry<String, String> item:map.entrySet()) {
			System.out.println(item.getKey()+":"+item.getValue());
		}
	}
	}
}
		
			
		