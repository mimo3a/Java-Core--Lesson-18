package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;

public class StringToInteger <T>{
	
	
	List <T>list;
	
	public StringToInteger(List<T> list) {
		super();
		this.list = list;		
	}
	
	public void addNumber(T number) {
		
		this.list.add(number);
	}
		
	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	

	
	
	
}
	
	


