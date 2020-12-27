package ua.lviv.lgs;

public class MyEntry<K,V> {
	K key;
	V volue;
	public MyEntry(K key, V volue) {
		super();
		this.key = key;
		this.volue = volue;
	}
	public K getKey() {
		return key;
	}
	public V getVolue() {
		return volue;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public void setVolue(V volue) {
		this.volue = volue;
	}
	@Override
	public String toString() {
		return "MyEntry [key=" + key + ", volue=" + volue + "]";
	}
	
}
