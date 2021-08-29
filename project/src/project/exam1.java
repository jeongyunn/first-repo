package project;

import java.util.Scanner;


public class exam1 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		String s;
		int menu;
		boolean cunt = true;
		
		
		while(cunt) {
			try {
				
				System.out.print("문자 입력 : ");
				s = sc.nextLine(); 
				
				if(!s.equals("#") && !s.equals("*")) {
					throw new Exception("Bad request");
					} 
	
				System.out.println("1. 직선 2. 삼각형 3.정사각형 4. 직사각형");
				System.out.print("메뉴를 선택해주세요 : ");
				menu = sc.nextInt();	sc.nextLine();
				if(menu < 1 || menu > 4) {
					throw new Exception("Bad request");
					}
				
				String str1 = "*";
				
				if(s.equals("#")) {
					str1 = "#";
					}
				
				switch(menu) {
				case 1:
					drawLine(str1);
					break;
				case 2:
					drawTriangle(str1);
					break;
				case 3:
					drawSquare(str1);
					break;
				case 4:
					drawRectangle(str1);
					break;
				}
				
				
				System.out.print("계속하시겠습니까? y/n : ");
				String a = sc.nextLine();
				
				System.out.println();
				
				if(a.equals("n")) {
					cunt = false;
					}
				
			} catch (Exception e) {
				System.out.print(e);
				return;
			}
		}
	}
	
	// 직선메뉴 추가 
	public static void drawLine(String line) throws Exception {
		System.out.print("정수(크기) 입력 : ");
		int n = sc.nextInt();	sc.nextLine();
		
		if(n < 1) {
			throw new Exception("Bad request");
		}
		
		System.out.print("출력 타입 (가로/세로) : ");
		String type = sc.nextLine();
		
		if(type.equals("가로")) {
			for(int i = 0; i < n; i++) {
				System.out.print(line);
			}
			System.out.println();
		} else if(type.equals("세로")) {
			for(int i = 0; i < n; i++) {
				System.out.println(line);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void drawTriangle(String str1) throws Exception {
		System.out.print("크기 입력 : ");
		int size = sc.nextInt();	sc.nextLine();
		
		if(size < 2) {
			throw new Exception("Bad request");
		}
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < i+1; j++){
				System.out.print(str1);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void drawSquare(String str1) throws Exception {
		System.out.print("정수 입력 : ");
		int n = sc.nextInt(); 	sc.nextLine();
		
		if(n < 1) {
			throw new Exception("Bad request");
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(str1);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	public static void drawRectangle(String starHash) throws Exception {
		System.out.print("가로 길이 입력 : ");
		int width = sc.nextInt();	
		System.out.print("세로 길이 입력 : ");
		int height = sc.nextInt();	sc.nextLine();
		
		if(width < 1 || height < 1) {
			throw new Exception("Bad request");
		}
		
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print(starHash);
			}
			System.out.println();
		}
		System.out.println();
	}

	
	
}
