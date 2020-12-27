package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Map<K, V> {

	List<MyEntry> listMap;

	K key;
	V ob;

	public Map(List<MyEntry> listMap) {
		super();
		this.listMap = listMap;

	}

	public void showMap() {
		System.out.println("listMap = " + listMap);
		
	}

	public void addObject(K key,  String name) {

		boolean count = true;
		for (int i = 0; i <= listMap.size() - 1; i++) {
			if (listMap.get(i).key == key) {
				count = false;
			}
		}
		if (count) {
			V listElement = (V) new MyEntry<K, String>(key, name);
			System.out.println(listElement);
			listMap.add((MyEntry) listElement);
		} else {
			System.out.println(" ключ - " + key + "- существует, выберите другой");
		}
	}
	public void deleteByKey(K key) {
		Iterator<MyEntry> iterator = listMap.iterator();
		while(iterator.hasNext()) {
			K next = (K) iterator.next().key;
			if(next == key) {
				iterator.remove();
				System.out.println("has deleted by key - " + key);
			}
		}
	}
	public void deleteByValue(String name) {
		Iterator<MyEntry> iterator = listMap.iterator();
		while(iterator.hasNext()) {
			String next = (String) iterator.next().volue;
			if(next.equalsIgnoreCase(name)) {
				iterator.remove();
				System.out.println("has deleted by value - " + name);
			}
		}
	}
	public void setKeys() {
		
		List <K> setKeys =  new ArrayList<>();
		
		Iterator<MyEntry> iterator = listMap.iterator();
		while(iterator.hasNext()) {
			K next =  (K) iterator.next().key;
			setKeys.add(next);
		}
		System.out.println("set of keys = " + setKeys);
	}
	
	public void setValues() {
		List  <String> setValue = new ArrayList<> ();
		Iterator<MyEntry> iterator = listMap.iterator();
		while(iterator.hasNext()) {
			String next =  (String) iterator.next().volue;
			setValue.add(next);
		}
		System.out.println("set of value = " + setValue);
	}
}
