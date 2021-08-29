package project;

public class Line implements Shape {

	private int size;
	private String type;
	
	public Line() {}

	public Line(int size, String type) {
		this.size = size;
		this.type = type;
	}
	
	public void draw(String drawType) {
		if(type.equals("가로")) {
			for(int i = 0; i < size; i++) {
				System.out.print(drawType);
			}
			System.out.println();
		} else if(type.equals("세로")) {
			for(int i = 0; i < size; i++) {
				System.out.println(drawType);
			}
		}
	}
	
}
