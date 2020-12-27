package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;

public class StringToIntegerApp {
	public static void main(String[] args) {
		
		
		StringToInteger <Integer> list1 = new StringToInteger<Integer>(new ArrayList());
		
		list1.addNumber(45);
		list1.addNumber(46);
		list1.addNumber(47);
		list1.addNumber(48);
		System.out.println(list1.getList());
		String a = "88";
//		строку в виде числа можно добавить после преобразования в int
		list1.list.add(Integer.parseInt(a));
		System.out.println(list1.getList());
		
		
		
		
		
		
		
		
	}

}
