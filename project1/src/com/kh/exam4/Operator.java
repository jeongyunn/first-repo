package com.kh.exam4;


public class Operator {


	public static void main(String[] args) {

		
		int a = 10;
		int b = a++;  //나중에 증감시킴
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		
		int x = 10;
		int y = ++x; //먼저 증감시킴 
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
// 		0으로 나누면 java.lang.ArithmeticExecption(산술에러) 에러 발생
//		int x1 = 10;
//		int y1 = 0;
//		
//		System.out.println("10/0 -> " + (x1/y1));
//		System.out.println("10 % 0 -> " + (x1 % y1));

		
		//비교연산자
		int x1 = 10;
		System.out.println("x1 == 10 -> " + (x1 == 10));
		System.out.println("x1 == 12 -> " + (x1 == 12));
		
		System.out.println("x1 != 10 -> " + (x1 != 10));
		System.out.println("x1 != 12 -> " + (x1 != 12));
		
		//값은 같은데 자료형이 다른것에 대해 비교연산자를 사용했을 때
		double x2 = 10.0;
		System.out.println("x2 == 10 -> " + (x2 == 10));
		System.out.println("x2 == 10.0 -> " + (x2 == 10.0));
		
		System.out.println("x2 != 10 -> " + (x2 != 10));
		System.out.println("x2 != 10.0 -> " + (x2 != 10.0));
		
		
		int x3 = 65;
		System.out.println("x3 == 65 -> " + (x3 == 65));
		System.out.println("x3 == 'A' -> " + (x3 == 'A'));
		//ASCII 코드에서 A는 65라는 값으로 저장되어 있으므로 true 출력
		
		char x4 = 'A';
		System.out.println("x4 == 65 -> " + (x4 == 65));
		System.out.println("x4 == 'A' -> " + (x4 == 'A'));
		
		String x5 = "A";    // 리터럴 데이터를 저장 
		
		System.out.println("x5 == \"A\" -> " + (x5 == "A"));	// 여기에 작성한 리터럴 데이터도 동일한 주소를 참조하여 사용 = true 출력
		// System.out.println("x5 == 65 -> " + (x5 == 65));
		
		String x6 = new String("A");   // 새로운 참조 주소를 생성하여 해당 영역에 값 저장
		System.out.println("x5 -> " + x5);
		System.out.println("x6 -> " + x6);
		System.out.println("x5 == x6 -> " + (x5==x6));  // (==는) 주소에 대한 비교, 같은 리터럴이지만 주소가 달라서 false 출
		System.out.println("x5.equals(x6) -> " + (x5.equals(x6)));   // 값에 대한 비교이므로 true 출
		// 문자열 비교할때는 equals 메서드 사용해야함!
		
//		String x7;
//		x7 = sc.nextLine();
//		System.out.println("x7 == \"A\" -> " + (x7 == "A"));
//		System.out.println("x7.equals(\"A\") -> " + (x7.equals("A")));
//	
		
		// 논리연산
		/*					  and 논리 연산   or논리연산
		 * 		 x		 y		 x && y	  	x || y
		 * 		TRUE 	TRUE	 TRUE	   	 TRUE
		 * 		TRUE	FALSE	 FALSE	   	 TRUE 
		 * 		FALSE	TRUE	 FALSE	   	 TRUE
		 * 		FALSE	FALSE	 FALSE	   	 FALSE
		 * 
		 */
		
		
		
		//삼항연산자
		int x8 = 10;
		int res;
		
		res = x8 > 10 ? x8 - 5 : x8 + 5;
		System.out.println(res);
		
		
		
		int x9 = 5;
		String r;
		
		r = x9 % 2 == 0 ? "짝수" : "홀수";
		System.out.println("x9는 " + r + "입니다.");
	
		
	}

}
