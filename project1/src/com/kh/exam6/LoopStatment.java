package com.kh.exam6;

public class LoopStatment {

	public static void sample1() {
		// 기본 반복
		for(int i = 1; i <= 3; i++) {
			System.out.println(i + "번째 반복");	// 조건식 참이면 실행 
		}
	}
			
	
	public static void sample2() {
		// 거꾸로 반복
		for(int i = 3; i >= 1; i--) {
			System.out.println(i + "번째 반복");	// 조건식 참이면 실행 
		}
	}
	
	
	public static void sample3() {
		// 초기식의 위치를 For문 밖에 배치
		int i = 1;
		
		// 초기식 생략
		for(; i <= 5; i++) {
			System.out.println(i + "번째 반복");	// 조건식 참이면 실행 
		}
		System.out.println(i);
	}
	
	public static void sample4() {
		// 증감식 생략 
		for(int i = 1; i <= 5;) {
			System.out.println(i + "번째 반복");	// 조건식 참이면 실행 
			i++;		// 증감식 여기에 넣음 위 문장과 순서 바꿔도 가능(출력값은 달라질 수 있음)
		
		}
	}
	
	public static void sample5() {
		// 조건식 생략
		for(int i = 1;; i ++) {
			if (i >= 5) {
				break;	//for 반복을 중단 
			}
			System.out.println(i + " 번째 반복");
//			if (i >= 5) {
//				break;	//for 반복을 중단 
//			}
// if문의 위치를 바꾸어 여기에 넣으면 5번째 반복까지 출력
		}
	}
	
	public static void sample6() {
		for(;;) {
			System.out.println("의도된 무한 반복");
		}
	}
	
	public static void sample7() {
		for(int i = 1; i <= 20; i+= 2) { // 형식어쩌고(+=)
			System.out.println(i + " 입니다.");
		}
	}
	
	public static void main(String[] args) {
		
//		sample1();
//		sample2();
//		sample3();
//		sample4();
//		sample5();
//		sample6(); "의도된 무한 반복"을 무한 반복함
		sample7();
	}
	
	
	
	
}
