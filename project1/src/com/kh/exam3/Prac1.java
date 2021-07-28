package com.kh.exam3;

import java.util.Scanner;

public class Prac1 {
	
	static Scanner sc = new Scanner(System.in);

	
	/* 
	 * Scanner로 사용자 입력을 받아 다음의 결과가 출력 수 있도록 한다. 
	 * 
	 * 이름을 입력하세요. : 홍길동
	 * 성별을 입력하세요.(남/여) : 
	 * 나이를 입력하세요. : 32
	 * 키를 입력하세요.(cm) : 175.4
	 * 
	 * 홍길동님의 나이는 32세 입니다.
	 * 키는 약 175cm 이고 성별은 남자 입니다.  
	 */
	
	
	
	public static void main(String[] args) {

		String name;
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		
		String gender;
		System.out.print("성별을 입력하세요(남/여) : ");
		gender = sc.next();
		
		int age;
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		float tall;
		System.out.print("키를 입력하세요(cm) : ");
		tall = sc.nextFloat();
		
// 첫번째 풀이!! 	
//		System.out.print(name + "님의 나이는 " + age + "세 입니다.\n");
//		System.out.printf("키는 약 %.0fcm 이고 ", tall );
//		System.out.printf("성별은 %s자 입니다.", gender);
		
// 두번째 풀이!!	
		System.out.printf("%s님의 나이는 %d세 입니다. \n", name, age );
		System.out.printf("키는 약 %.0fcm이고 성별은 %s자 입니다.", tall, gender);
		
		
		
		/* 선생님 풀이
		 * 
		 * String name, gender;
		 * int age;		double tall;
		 * 
		 * System.out.print("이름을 입력하세요. : ");
		 * name = sc.next();	sc.nextLine();
		 * 
		 * System.out.print("성별을 입력하세요.(남/여) : ");
		 * gender = sc.next().charAt(0);	sc.nextLine();
		 * 
		 * System.out.print("나이를 입력하세요. : ");
		 * age = sc.nextInt();	sc.nextLine();
		 * 
		 * System.out.print("키를 입력하세요.(cm) : ");
		 * tall = sc.nextDouble();
		 * 
		 * System.out.printf("%s님의 나이는 %d세 입니다. \n", name, age);
		 * System.out.print("키는 약 %.0fcm 이고 성별은 %c자 입니다. \n", tall, gender);
		 * 
		 */
		
		
		
		
		
	}

}
