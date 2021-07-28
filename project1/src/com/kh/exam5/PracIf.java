package com.kh.exam5;

import java.util.Scanner;

public class PracIf {
	
	static Scanner sc = new Scanner(System.in);

	public static void ex1() {		
		// 1 번
		/* 
		 * 다음의 예시를 보고 동일하게 동작하는 코드를 작성
		 * 예)
		 * 		1. 입력 메뉴
		 * 		2. 수정 메뉴
		 *		3. 검색 메뉴
		 *		4. 삭제 메뉴
		 *		5. 종료
		 *
		 *		메뉴 번호 입력 : 3
		 *		검색 메뉴를 입력하였습니다. 
		 * 
		 */
		
//		int num;
//		System.out.print(" 1. 입력 메뉴 \n 2. 수정 메뉴 \n 3. 검색 메뉴 \n 4. 삭제 메뉴 \n 5. 종료\n");
//		System.out.print("메뉴 번호 입력 : ");
//		num = sc.nextInt();
//		
//		
//		if(num = 3) {
//			System.out.print("입력 메뉴를 입력하였습니다." );
//		}

		int menuNum;
		
		System.out.println("1. 입력 메뉴");
		System.out.println("2. 수정 메뉴");
		System.out.println("3. 검색 메뉴");
		System.out.println("4. 삭제 메뉴");
		System.out.println("5. 종료");
	
		menuNum = sc.nextInt(); sc.nextLine();
		
		if(menuNum == 1) {
			System.out.println("입력 메뉴를 입력하였습니다.");	
		} else if(menuNum == 2) {
			System.out.println("수정 메뉴를 입력하였습니다.");	
		} else if(menuNum == 3) {
			System.out.println("검색 메뉴를 입력하였습니다.");	
		} else if(menuNum == 4) {
			System.out.println("삭제 메뉴를 입력하였습니다.");	
		} else if(menuNum == 5) {
			System.out.println("종료 하였습니다.");	
		}
		
		
		/*
		 *  수정한다면 이정도
		 *  String menuStr = " 1.입력 메뉴\n
		 *  	+ 2. 수정메뉴\n
		 * 		+ 3. 검색메뉴\n
		 *  	+ 4. 삭제메뉴\n
		 *  	+ 5. 종료\n
		 */
	}
	
	
	
	
	public static void ex2() {			
		// 2 번 
		/*
		 * 	영문자 알파벳 범위의 ASCII 코드 번호를 입력받은 경우에만 해당하는 문자를 출력하고 코드 범위를 벗어난 경우에는 
		 * "ASCII 코드 영문자 범위를 벗어났습니다." 라는메시지를 출력하도록 하시오.
		 * 
		 * 예1)
		 * 		영문자 범위의 ASCII 코드 번호 입력 : 65
		 * 		입력한 ASCII 코드 65의 영문자는 'A'입니다. 
		 * 
		 * 예2)
		 * 		영문자 범위의 ASCII 코드 번호 입력 : 92
		 * 		ASCII 코드 영문자 범위를 벗어났습니다. 
		 * 
		 */
		
		
//		int num1;
//		
//		System.out.print("번호를 입력하세요 : ");
//		num1 = sc.nextInt();
//		
//		if (num1 >= 0 && num1 <= 127) {
//			System.out.print("영문자 범위 ASCII 코드 번호 입력: " + num1 );
//		} else {
//			System.out.print("ASCII 코드 영문자 범위를 벗어났습니다.");
//		}
		
		int code;

		System.out.print("영문자 범위의 ASCII 코드 번호 입력 : ");
		code = sc.nextInt();	sc.nextLine();
		
		if(code >= 65 && code <= 90) {
			System.out.printf("입력한 ASCII 코드 %d 의 영문자는 '%c' 입니다.\n",
					code, code);
		} else if(code >= 97 && code <= 122) {
			System.out.printf("입력한 ASCII 코드 %d 의 영문자는 '%c' 입니다.\\n\",\n",
					code, code);
		} else {
			System.out.println("ASCII 코드 영문자 범위를 벗어났습니다.");
		}
	
	
	
	}
	
	public static void ex3() {			// 3 번

	
		/*
		 *  국어, 영어, 수학 세 과목의 시험 점수를 입력 받아 총점과 평균을 구하고
		 *  평균이 60점 이상인 경우에 "합격입니다." 메시지를 출력하고 60점 이상이 아닌 경우에
		 *  "불합격입니다." 메시지를 출력한다.
		 * 
		 */
		
//		int K;
//		System.out.print("국어 점수를 입력하세요. :");
//		K = sc.nextInt();
//		
//		
//		int E;
//		System.out.print("영어 점수를 입력하세요. :");
//		E = sc.nextInt();
//		
//		int M;
//		System.out.print("수학 점수를 입력하세요. :");
//		M = sc.nextInt();
//		
//		
		
		double kor, eng, mth;
		double tot, avg;
		
		System.out.print("국어 점수 입력 : ");
		kor = sc.nextDouble();		sc.nextLine();
		
		System.out.print("영어 점수 입력 : ");
		eng = sc.nextDouble();		sc.nextLine();
		
		System.out.print("수학 점수 입력 : ");
		mth = sc.nextDouble();		sc.nextLine();
		
		tot = kor + eng + mth;
		avg = tot / 3.0;
		
		System.out.println("총합 : " + tot);
		System.out.println("평균 : " + avg);
		
		
		
	}
	
	public static void ex4() {
		/*
		 * 점수를 입력 받아 A ~ D 까지의 등급을 구분하여 출력하는 코드를 작성한다.
		 * 
		 * A 등급은 ~ 90 이상
		 * B 등급은 90 미만 ~ 80 이상
		 * C 등급은 80 미만 ~ 70 이상
		 * D 등급은 70 미만 ~ 60 이상
		 * F 등급은 60 미만 ~
		 *
		 * 점수는 100 ~ 0 점 사이의 값을 입력받아야 하며, 이 범위를 벗어나는 경우 
		 * "점수 입력 범위를 벗어났습니다." 라는 메시지를 출력한다.
		 */
	
		 double jumsu;
		 String msg;
		 
		 System.out.print("점수 입력(0 ~ 100) : ");
		 jumsu = sc.nextDouble();	sc.nextLine();
		 
		 if(jumsu >= 0 && jumsu <= 100) {
			 if(jumsu >= 90) {
				 msg = "A 등급";
			 } else if(jumsu >= 80 && jumsu < 90) {
				 	msg = "B 등급";
			 } else if(jumsu >= 70 && jumsu < 80) {
				 	msg = "C 등급";
			 } else if(jumsu >= 60 && jumsu < 70) {
				 	msg = "D 등급";
			 } else {
				 msg = "F 등급";
			 }
				
			 System.out.println(msg + " 입니다. ");
			 
		 } else {
			 System.out.println("점수 입력 범위를 벗어났습니다.");
		 }		
	}
			
			
	public static void ex5() {
		/*
		 * 1 ~ 31 까지의 일자 정보를 입력 받고 해당 일자의 요일을 출력하게 한다.
		 * 2021년 7월에 한정한 요일 정보를 출력하게 하면 된다.
		 * 
		 * 예 1.)
		 * 		일자 입력 : 9
		 * 		금요일 입니다.
		 * 
		 * 예 2.)
		 * 		일자 입력 : 32
		 * 		입력 범위를 벗어났습니다. 1 ~ 31 까지만 입력하세요.
		 */
	}
	
	
	public static void ex6() {
		String str;
		
		System.out.println("더하기, 빼기, 나누기, 곱하기 중 하나를 입력하시오.");
		System.out.print(": ");
		
		str = sc.nextLine();
		
		switch(str) {
			case "더하기" :
				System.out.println("더하기는 + 기호를 사용합니다."); 	break;
			case "빼기" :
				System.out.println("빼기는 - 기호를 사용합니다."); 	break;
			case "곱하기" :
				System.out.println("곱하기는 * 기호를 사용합니다."); 	break;
			case "나누기" :
				System.out.println("나누기는 / 기호를 사용합니다."); 	break;
			default:
				System.out.println("더하기, 빼기, 곱하기, 나누기 중 하나를 입력하세요.");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		ex1(); // 메서드 실행(호출)		
		ex2();
		ex3();
	}

}
