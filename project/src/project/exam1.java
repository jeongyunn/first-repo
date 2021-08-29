package project;

import java.util.*;

public class exam1 {

	static Scanner sc = new Scanner(System.in);

	static List<Shape> shapes = new ArrayList();
	
	public static void main(String[] args) {
		
		boolean cunt = true;
		
		while(cunt) {
			try {
				
				System.out.print("메뉴를 선택하세요 \n 1.입력 2.출력 \n");
				int mainMenu = sc.nextInt();	sc.nextLine();
				
				switch(mainMenu) {
				case 1:
					chooseShape();
					break;
				case 2:
					printAll();
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
	
	public static void printAll() {
		for(int i = 0; i < shapes.size(); i++) {
			Shape shape = shapes.get(i);
			shape.draw("@");
			System.out.println("==========");
		}
	}
	
	public static String chooseDrawType() throws Exception {
		System.out.print("문자 입력 : ");
		String s = sc.nextLine(); 
		
		if(!s.equals("#") && !s.equals("*")) {
			throw new Exception("Bad request");
		} 
		return s;
	}
	
	public static void chooseShape() throws Exception{
		System.out.println("1. 직선 2. 삼각형 3.정사각형 4. 직사각형");
		System.out.print("메뉴를 선택해주세요 : ");
		int shapeMenu = sc.nextInt();	sc.nextLine();
		
		if(shapeMenu < 1 || shapeMenu > 4) {
			throw new Exception("Bad request");
		}
		String drawType = chooseDrawType();
		
		
		switch(shapeMenu) {
		case 1:
			drawLine(drawType);
			break;
		case 2:
			drawTriangle(drawType);
			break;
		case 3:
			drawSquare(drawType);
			break;
		case 4:
			drawRectangle(drawType);
			break;
		}
	}
	
	public static void drawLine(String drawType) throws Exception {
		System.out.print("정수(크기) 입력 : ");
		int size = sc.nextInt();	sc.nextLine();
		
		if(size < 1) {
			throw new Exception("Bad request");
		}
		
		System.out.print("출력 타입 (가로/세로) : ");
		String type = sc.nextLine();
		
		Line line = new Line(size, type);
		line.draw(drawType);
		shapes.add(line);
	}
	
	public static void drawTriangle(String drawType) throws Exception {
		System.out.print("크기 입력 : ");
		int size = sc.nextInt();	sc.nextLine();
		
		if(size < 2) {
			throw new Exception("Bad request");
		}
		
		Triangle triangle = new Triangle(size);
		triangle.draw(drawType);
		shapes.add(triangle);

	}
	
	public static void drawSquare(String drawType) throws Exception {
		System.out.print("정수 입력 : ");
		int size = sc.nextInt(); 	sc.nextLine();
		
		if(size < 1) {
			throw new Exception("Bad request");
		}
		
		Square square = new Square(size);
		square.draw(drawType);
		shapes.add(square);

	}
	
	
	public static void drawRectangle(String drawType) throws Exception {
		System.out.print("가로 길이 입력 : ");
		int width = sc.nextInt();	
		System.out.print("세로 길이 입력 : ");
		int height = sc.nextInt();	sc.nextLine();
		
		if(width < 1 || height < 1) {
			throw new Exception("Bad request");
		}
		
		Rectangle rec = new Rectangle(width, height);
		rec.draw(drawType);
		shapes.add(rec);

		
	}

	
	
}
