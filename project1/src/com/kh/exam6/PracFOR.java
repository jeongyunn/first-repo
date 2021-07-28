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

	
	public static void ex4() {
		/*
		 * ex1() 처럼 동작하는 코드를 작성한다.  단, 출력 메시지는 다음과 같이 나오도록 한다.
		 * 
		 * 예) 
		 * 		정수 입력 : 3
		 * 		1 2 3
		 */
		
		int num4;
				
		System.out.print("정수 입력 : ");
		num4 = sc.nextInt();	sc.nextLine();
		
		for (int i = 1; i <= num4; i++) {
			System.out.print(i + " ");
			}

	}
	
	
	public static void ex5() {
		/*
		 * ex4()처럼 동작하는 코드를 작성한다. 단, 1부터 시작하는 값이 아닌 100부터 시작하는 
		 * 형태로 나오게 한다.
		 * 
		 *  예)
		 *  	정수 입력 : 3
		 *  	100 101 102
		 */
		
		int num5;
		
		System.out.print("정수 입력 : ");
		num5 = sc.nextInt();	sc.nextLine();
		
		for (int i = 100; i < (100 + num5); i++) {
			System.out.print(i + " ");
			}
		
	}
	
	public static void ex6() {
		/*
		 * ex4()처럼 동작하는 코드를 작성한다. (입력받은 값까지 출력하는데)
		 * 단, 3의 배수에 해당하는 값만을 출력하도록 한다. 
		 * 
		 *  예)
		 *  	정수 입력 : 10
		 *  	3 6 9 
		 */
		
		int num6;
		
		System.out.print("정수 입력 : ");
		num6 = sc.nextInt();	sc.nextLine();
		
		for (int i = 1; i <= num6 ; i++) {
			
			if(i % 3 == 0) {
				System.out.print(i + " ");
				}
			}
		
	}
	
	public static void ex7() {
		/*
		 * ex6()처럼 출력을 하는 코드를 작성한다. 단, 짝수에 해당하는 값만을 출력하고 
		 * 역순으로 출력하도록 한다.
		 * 
		 * 	예)
		 * 		정수 입력 : 10
		 * 		10 8 6 4 2 
		 */
		
		int num7;
				
				System.out.print("정수 입력 : ");
				num7 = sc.nextInt();	sc.nextLine();
				
				for (int i = num7; i >= 1 ; i--) {
					
					if(i % 2 == 0) {
						System.out.print(i + " ");
						}
					}
				
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
//		ex1();
//		ex2();
//		ex3();
//		ex4();
//		ex5();
//		ex6();
		ex7();
		
	}

}
