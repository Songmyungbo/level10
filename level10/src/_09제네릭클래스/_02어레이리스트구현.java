package _09제네릭클래스;

import java.util.Arrays;

class MyArrayList<T> implements Cloneable{
	private T[] arr;
	private int size;
	private int capacity = 10;
	MyArrayList(){
//		arr = new T[capacity]; // 제네릭클래스로 배열 선언을 할 수 없다!!!
		arr = (T[]) new Object[10];
	}
	public void print() {
		System.out.println(Arrays.toString(arr));
	}
	int size() {
		return size;
	}
	@Override
	public String toString() {
		if(size == 0) return "[]";
		String data = "[";
		
		for(int i = 0; i < size; i++) {
			data += arr[i]+",";
		}
		data = data.substring(0,data.length()-1);
		data += "]";
		
		return data;
	}
	public int capacity() {
		return capacity;
	}
	void add(T value) {
		if(size == capacity) {
			addCapacity();
		}
		arr[size] = value;
		size+=1;
	}
	void addCapacity() {
		capacity+=10;
		T[] temp = arr;
		arr = (T[]) new Object[capacity];
		for(int i = 0; i < temp.length; i++) {
			arr[i] = temp[i];
		}
	}
	T get(int idx) {
		errorCheck(idx,size);
		return arr[idx];
	}
	void errorCheck(int idx, int end) {
		if(idx < 0 || idx > end) {
			throw new ArrayIndexOutOfBoundsException("인덱스 오류");
		}
		
	}
	T set(int idx, T value) {
		errorCheck(idx,size);
		return arr[idx] = value;
	}
	T add(int idx, T value) {
		if(size == capacity) {
			addCapacity();
		}
		errorCheck(idx,size);
		for(int i = size; i > idx; i--) {
			arr[i] = arr[i-1];
		}
		arr[idx] = value;
		size++;
		return value;
	}
	T remove(int deIdx) {
		errorCheck(deIdx,size-1);
		T num = arr[deIdx];
		for(int i = deIdx; i < size; i++) {
			arr[i] = arr[i+1];
		}
		arr[size-1] = null; 
		size--;
		
		if(size == capacity - 10) {
			capacity -= 10;
		}
		return num;
	}
	void clear() {
		for(int i = 0; i < size; i++) {
			arr[i] = null;
		}
		size = 0;
	}
}

public class _02어레이리스트구현 {
	public static void main(String[] args) {
		MyArrayList<String> list = new MyArrayList();
		list.add("test1");
		list.add("test2");
		list.add("test3");
		list.add("test4");
		System.out.println(list);
//		MyArrayList<Double> v1 = new MyArrayList();
//		System.out.println(v1);
//		System.out.println(v1.size());
//		System.out.println(v1.capacity());
//		
//		for(int i = 0; i < 10; i++) {
//			v1.add((i+1) * 10*1.0);
//		}
//		System.out.println(v1.size());
//		System.out.println(v1.capacity());
//		System.out.println(v1.get(1));
//		
//		v1.set(1,1000.0);
//		System.out.println(v1);
//		v1.add(1,20.0);
//		System.out.println(v1);
//		
//		v1.remove(3);
//		System.out.println(v1);
//		System.out.println(v1.size());
//		System.out.println(v1.capacity());
//		
//		v1.clear();
//		System.out.println(v1);
//		System.out.println(v1.size());
//		System.out.println(v1.capacity());
	}
}
