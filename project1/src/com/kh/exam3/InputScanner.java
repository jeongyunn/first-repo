package com.kh.exam3;


import java.util.Scanner;


public class InputScanner {
	
	 
	static Scanner sc = new Scanner(System.in);
	//클래스 변수, static 넣어야 함! 안쓰려면 메인 메서드 안에 넣기 
	
	
	//메인 메서드 
	public static void main(String[] args) {
	// 메인 메서드 아래에 넣는 변수 지역변수 
		
		//사용자 입력 받는 법 
		
//		int a;
//		System.out.print("나이를 입력하세요. : ");
//		a = sc.nextInt();
//		
//		String name;
//		System.out.print("이름을 입력하세요. : ");
//		name = sc.next();
//		
//		System.out.println("사용자 입력 나이 : " + a);
//		System.out.println("사용자 입력 이름 : " + name);
//		
//	위에는 내가 한 것...
		
		
		
//		int a;
//		System.out.print("정수 입력하세요. : ");
//		a = sc.nextInt();
//		
//		System.out.println("사용자 입력 값 -> " + a);

		
		String name;
		System.out.print("이름을 입력하세요. : ");
		name = sc.nextLine();
		//next는 공백(띄어쓰기) 전까지 입력 받음, nextLine는 띄어쓰기 포함해서 개행을 기준으로 입력 받음(한줄)
		System.out.print("사용자 입력 값 -> " + name);
		

		// 문자 읽기.
		sc.next().charAt(0);
		
		
		
		
	}

}
