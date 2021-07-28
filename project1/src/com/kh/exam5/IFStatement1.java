package com.kh.exam5;

public class IFStatement1 {

	public static void main(String[] args) {
		
		
		System.out.print("1~12월 입력 : " );
		a = sc.nextInt();		sc.nextLine();
		
		if (a >= 1 && a <= 3) {
			System.out.println("1분기 입니다.");
		} else if(a >= 4 && a <= 6) {
			System.out.println("2분기 입니다.");
		} else if(a >= 7 && a <= 9) {
			System.out.println("3분기 입니다.");
		} else if(a >= 10 && a <= 12) {
			System.out.println("4분기 입니다.");
		} else  {
			System.out.println(" 반드시 1 ~ 12 사이의 값을 입력하세요.");
		}
		
//		if(a>= 1 && a <= 12) {
//			System.out.printf("%d , 분기입니다. \n", ((a = 1) / 3) + 1);
//		} else {
//			System.out.print("반드시 1 ~ 12 사이의 값을 입력하세요.");
//		}
		
	}

}
