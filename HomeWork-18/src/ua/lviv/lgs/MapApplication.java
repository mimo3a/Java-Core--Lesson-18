package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;

public class MapApplication {
	public static void main(String[] args) {
		Map <Integer, MyEntry> map1 = new Map<>(new ArrayList());
		
		map1.addObject(1, "vova");
		map1.addObject(1, "sveta");
		map1.addObject(2, "sveta");
		map1.addObject(3, "seroza");
		map1.addObject(4, "misha");
		map1.addObject(5, "dima");
		map1.addObject(6, "kolia");
		
		map1.showMap();
		map1.deleteByKey(1);
		map1.showMap();
		map1.deleteByValue("seroza");
		map1.showMap();
		map1.setKeys();
		map1.setValues();
	}

}
