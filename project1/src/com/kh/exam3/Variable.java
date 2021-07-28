package com.kh.exam3;

public class Variable {

	public static void main(String[] args) {
	
		boolean bool = true;
		byte b = 127;
		char c1 = 'a';
		char c2 = 97;
		String s = "teddy bear";
		short s1 = 2445;
		int i = 1024;
		long l = 9999;
		float f = 3.14f;
		double d = 3.14;
		
		final double pi = 3.141592;
		
		System.out.println(bool);
		System.out.println(b);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);


		System.out.println(pi);
		//pi = 3.14; 상수는 재할당 안됨
		
	
		String str1 = "Hello";
		String str2 = new String("Java");
		String str3 = "Hello" + "Java";
		String str4 = new String("Hello" + "Java");
		String str5 = "Hello" + 123 + 45 + "Java";
		String str6 = 123 + 45 + "Hello" + "Java";
		// String str6 = "123" + "45" + "Hello" + "Java";
		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
	
		
		
	}

}
