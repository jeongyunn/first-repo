package com.kh.practice.poly.view;

import java.util.Scanner;

import com.kh.practice.poly.controller.LibraryController;
import com.kh.practice.poly.model.vo.Book;
import com.kh.practice.poly.model.vo.Member;

public class LibraryMenu {

	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();		sc.nextLine();
		
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		Member mem = new Member(name, age, gender);
		lc.insertMember(mem);
		
		while(true) {
			String text = "\n ==== 메뉴 ==== \n";
			text += "1. 마이페이지 \n"
				  + "2. 도서 전체 조회 \n"
				  + "3. 도서 검색 \n"
				  + "4. 도서 대여하기 \n"
				  + "9. 프로그램 종료하기 \n"
				  + "메뉴 번호 : ";
			
			System.out.print(text);
			int menuNum = sc.nextInt(); 	sc.nextLine();
			
			if(menuNum == 9) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
			switch(menuNum) {
			case 1: 
				System.out.println(lc.myInfo()); 	break;
			case 2:
				this.selectAll(); 	break;
			case 3:
				this.searchBook();	break;
			case 4:
				this.rentBook(); 	break;
			}
		}
	}
	
	public void selectAll() {
		lc.selectAll();
	}
	
	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		lc.searchBook(keyword);
		
		Book[] searchList = new Book[] {};
		// 결과값을 Book[] 자료형 searchList에 담아 검색결과인 도서목록 출력 -> 모르겠음ㅜㅜ
//		System.out.println(searchList());
	}
	
	public void rentBook() {
		this.selectAll();		// selectAll() 호출
		System.out.print("대여할 도서 번호 선택 : ");
		int bookNumber = sc.nextInt(); 	sc.nextLine();
		int result = lc.rentBook(bookNumber);
		
		if(result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		} else if(result == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		} else if(result == 2) {
			System.out.println("성공적으로 대여되었습니다. "
					+ "요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요");
		}
	}
	
}
