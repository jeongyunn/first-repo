package project;

public class Square implements Shape {
	
	private int size;
	
	public Square() {}

	public Square(int size) {
		this.size = size;
	}

	public void draw(String drawType) {
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print(drawType);
			}
			System.out.println();
		}
	}
}
