package org.niranjan.collection.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindWordsOccuranceInArray {
	public static String[] inputs = {"abc", "pqr", "abc", "xyz", "abc", "mno", "pqr", "abc"};
	public static Map<String, Integer> occurances = new LinkedHashMap<String, Integer>();
	public static void main(String[] args) {
		for(String input : inputs){
			if(occurances.containsKey(input)){
				occurances.put(input, occurances.get(input) + 1);
			}else{
				occurances.put(input, 1);
			}
		}
		
		//1. using entry<K,V>
		/*for(Entry<String, Integer> entry : occurances.entrySet()){
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}*/
		
		//2. using keySet()
		/*for(String key : occurances.keySet()){
			System.out.println(key + " : " + occurances.get(key));
		}*/
		
		//3. using values()
		/*for(Integer count : occurances.values()){
			System.out.println(count);
		}*/
		
		//4. using iterator
		/*Iterator<Entry<String, Integer>> iterator = occurances.entrySet().iterator();
		while(iterator.hasNext()){
			Entry<String, Integer> entry = iterator.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}*/
		
		//5. using java-8 forEach loop with lambda expression
		occurances.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));
	}
}