package com.dev;

import java.util.HashMap;
import java.util.Map;

public class FooBarQix {
	
	
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
	public static String isDevidedByNumber(int number) {
		StringBuilder result=new StringBuilder();

		  if(isDividedBy(number,3)) result.append(mapFoorBarQix.get(3));
		  if(isDividedBy(number,5)) result.append(mapFoorBarQix.get(5));
		  if(isDividedBy(number,7)) result.append(mapFoorBarQix.get(7));

		return result.toString();
	}

	// controle si le nombre est contient 3,5,7
	public static String numberContaines(String number) {
		StringBuilder result=new StringBuilder();
		for(char c : number.toCharArray()) {
			 switch (c) {
				case '3':	 result.append(mapFoorBarQix.get(3));
				break;
				case '5':	 result.append(mapFoorBarQix.get(5));
				break;
				case '7':	 result.append(mapFoorBarQix.get(7));
				break;
				case '0':	 result.append(mapFoorBarQix.get(0));
				break;

			default:  result.append(c);
				break;
			}

		}
		
		return result.toString();
	}
	
	//methode principale de FooBarQix
	public static String compute(String number) {		
		return isDevidedByNumber(Integer.valueOf(number))+numberContaines(number);
	}

}
