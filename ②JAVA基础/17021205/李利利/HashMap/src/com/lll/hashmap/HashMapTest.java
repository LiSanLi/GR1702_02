package com.lll.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<Country, String> hashMap = new HashMap<Country, String>();

		Country china = new Country("china", 45);
		Country india = new Country("india", 68);
		Country japan = new Country("japan", 97);

		hashMap.put(china, "北京");
		hashMap.put(india, "新德里");
		hashMap.put(japan, "东京");

		/*
		 * String string_1 = hashMap.get(china); System.out.println(string_1);
		 * 
		 * String string_2 = hashMap.get(india); System.out.println(string_2);
	 	 * 
		 * String string_3 = hashMap.get(japan); System.out.println(string_3);
		 */
     Iterator<Entry<Country, String>> iterator = hashMap.entrySet().iterator();
     while (iterator.hasNext()) {
		Entry<Country, String> entry = iterator.next();
		 String value = entry.getValue();
		 Country key = entry.getKey();
		 System.out.println(key.toString()+" "+value);
	}
	   
		}
	}


