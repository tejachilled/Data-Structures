package com.Interviews;

import java.util.HashMap;

public class HashMaPWorking {

	public static class class1{
		int age;
		String name;
		public class1(int age,String name){
			this.age = age;
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<class1, Boolean> map = new HashMap<class1, Boolean>();
		class1 a1 = new class1(1,"neeraj");
		class1 a2 = new class1(2,"ravi");
		map.put(a1, true);
		map.put(a2, false);
		System.out.println(map.get(a1));
		System.out.println(map.get(a2));
		
	}

}
