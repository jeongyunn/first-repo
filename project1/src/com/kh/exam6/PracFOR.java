package com.kh.exam6;

import java.util.Scanner;

public class PracFOR {

	static Scanner sc = new Scanner(System.in);
	
	public static void ex1() {
		/*
		 * 정수값을 입력받아 1부터 입력받은 값까지의 1씩 증가된 값을 출력하는 코드 작성
		 * 
		 * 예) 
		 * 			정수 입력 : 3
		 * 			1
		 * 			2
		 * 			3 
		 * 
		 */
		
		int num1;
		
		System.out.print("정수 입력 : ");
		num1 = sc.nextInt();	sc.nextLine();
		
		for (int i = 1; i <= num1; i++) {
			System.out.println(i);
			}
		

	}
	
	
	
	public static void ex2() {
		/*
		 * 정수값을 입력받고 입력받은 값부터 1씩 감소된 값을 출력하는 코드 작성
		 * 
		 *  예)
		 *  		정수 입력 : 3
		 *  		3
		 *  		2
		 *  		1
		 */
		
		
		int num2;
		System.out.print("정수 입력 : ");
		num2 = sc.nextInt();	sc.nextLine();
		
		for (int i = num2; i <= num2; i--) {
			if (i <=0) {
				break;
			}
			System.out.println(i);
			}
		
		
		
		
	}
	
	
	
	public static void ex3() {
		/*
		 * 정수값을 입력받을 때 지정된 범위의 입력값이 아닌 경우 최대 3번까지
		 * 다시 입력 받을 수 있도록 하는 코드 작성(범위는 1 ~ 99 사이의 값)
		 */
		
		int num3;
		for(int i = 1; i <=3; i++) {
			System.out.print("정수 입력(1 ~ 99) : ");
			num3 = sc.nextInt(); sc.nextLine();
			
			if(num3 >= 1 && num3 <= 99) {
				System.out.println("입력값 " + num3 + " 확인하였습니다.");
				break;
			}
		}
	}

	
	public static void main(String[] args) {
		
//		ex1();
//		ex2();
		ex3();
		
	
		
	}

}
