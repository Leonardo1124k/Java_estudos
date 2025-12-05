//package entities;
//
//public class Rectangle {
//	public double width;
//	public double height;
//	
//	public double area() {
//		return width * height;
//	}
//	
//	public double perimeter() {
//		return 2 * (width + height);
//	}
//	
//	public double diagonal() {
//		return Math.sqrt(width * width + height * height);
//	}
//}

package entities;

public class Rectangle{
	//ATRIBUTOS
	public double height;
	public double width;
	
	//METODOS
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return width * 2 + height * 2;
	}
	
	public double diagonal() {
		return Math.sqrt(width*width + height*height);
	}
}

