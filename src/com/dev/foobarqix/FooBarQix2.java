package com.dev.foobarqix;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FooBarQix2 {
	
	
	static Map<Integer,String> mapFoorBarQix;
	
	static {
		mapFoorBarQix=new HashMap<>();
		mapFoorBarQix.put(3, "Foo");
		mapFoorBarQix.put(5, "Bar");
		mapFoorBarQix.put(7, "Qix");
		mapFoorBarQix.put(0, "*");
		
	}

	
	
	public static boolean isDividedBy(int number, int divider) {
		if (number % divider == 0) {
			return true;
		}
		return false;
	}
	
	// controle si le nombre est devisable par 3,5,7
	public static String getStringAfterDivison(int number) {
		StringBuilder result=new StringBuilder();
		  
		for(Map.Entry<Integer,String> entry:mapFoorBarQix.entrySet()){
			  if(entry.getKey() !=0 && isDividedBy(number,entry.getKey()))
				  result.append(entry.getValue());
  
		}
			
		return result.toString();
	}

	// controle si le nombre est contient 3,5,7
	public static String handleNumberContaines(String number) {
		StringBuilder result = new StringBuilder();
		for (char c : number.toCharArray()) {
			for (Map.Entry<Integer, String> entry : mapFoorBarQix.entrySet()) {
				if(!mapFoorBarQix.containsKey(Character.getNumericValue(c)) 
						&& getStringAfterDivison(Integer.valueOf(number).intValue()).length()==0 ) {
					result.append(String.valueOf(c));
					break;
				}
				if (entry.getKey().intValue() == Character.getNumericValue(c)) {
					result.append(entry.getValue());
					break;
				} 
			}

		}

		return result.toString();
	}
	
	//methode principale de FooBarQix
	public static String compute(String number) {		
		return getStringAfterDivison(Integer.valueOf(number))+handleNumberContaines(number);
	}

}
