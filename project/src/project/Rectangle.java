package project;

public class Rectangle implements Shape {
	int width;
	int height;
	
	public Rectangle() {}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void draw(String drawType) {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print(drawType);
			}
			System.out.println();
		}
	}
}
