package com.kh.practice.poly.view;

import java.util.Scanner;

import com.kh.practice.poly.controller.LibraryController;
import com.kh.practice.poly.mode.vo.Book;
import com.kh.practice.poly.mode.vo.Member;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();    sc.nextLine();
		System.out.print("성별 입력 : ");
		char gender = sc.nextLine().charAt(0);
		
		Member memInfo = new Member(name, age, gender);
		lc.insertMember(memInfo);
		
		while(true) {
			String menu = "\n ==== 메뉴 ====\n"
							+ "1. 마이페이지 \n"
							+ "2. 도서 전체 조회 \n"
							+ "3. 도서 검색 \n"
							+ "4. 도서 대여하기 \n"
							+ "9. 프로그램 종료하기 \n"
							+ "메뉴 번호 : ";

			System.out.println(menu);
			int menuNum = sc.nextInt();    sc.nextLine();
			
			if(menuNum == 9) {
				break;
			}
			
			switch(menuNum) {
			case 1:
				System.out.println(lc.myInfo());	break;
			case 2: 
				this.selectAll();    break;
			case 3:
				this.searchBook();    break;
			case 4:
				this.rentBook();  	break;
			}
			
		}
		
	}
	
	public void selectAll() {
		Book[] bList = lc.selectAll();
		
		for(int i = 0; i < bList.length; i++) {
			System.out.println(i + "번도서 : " + bList[i]);
		}
	}
	
	public void searchBook() {
		System.out.print("검색할 제목의 키워드 입력 : ");
		String keyword = sc.nextLine();
		Book[] searchList = lc.searchBook(keyword);
		
		for(Book b: searchList) {
			System.out.println(b);
		}
	}
	
	public void rentBook() {
		this.selectAll();
		System.out.println("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();	sc.nextLine();
		
		int result = lc.rentBook(index);
		if(result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		} else if(result == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		} else if(result == 2) {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
		}
		
	}
	
}
