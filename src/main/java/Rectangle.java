package homewrok1;

public class Rectangle {
	
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length=length;
		this.width=width;
	}
	
	public void draw() {
		for( int i=0; i<length; i++) {
			for(int k=0; k<width;k++) {
				System.out.print("x");
			}
			System.out.println();
		}
	}
	
	public int calcArea() {
		return length*width;
	}
	
	public int calcPerimeter() {
		return length*2+width*2;
	}
	
	
	public void scale(int factor) {
		length=length*factor;
		width=width*factor;
	}
}
