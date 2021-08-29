package project;

public class Triangle implements Shape {

	private int size;
	
	public Triangle() {}

	public Triangle(int size) {
		this.size = size;
	}
	
	public void draw(String drawType) {
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < i+1; j++){
				System.out.print(drawType);
			}
			System.out.println();
		}
		
	}
}
