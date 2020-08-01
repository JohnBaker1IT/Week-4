package methodReferences;

import functionalInterface.MessagePrinter;

public class CalculateAreaMain {

	public static void main(String[] args) {
		
		Square s = new Square(4);

		
		// long lambda notation
		Shapes shapes = (Square square) -> {
			return square.calculateArea();
		};
		
		// shorter lambda notation using method reference
		// method reference syntax Name of class :: name of method
		Shapes shapes2 = Square::calculateArea;

        System.out.println("Area: " + shapes.getArea(s));
		
        System.out.println("Area: " + shapes2.getArea(s));
		
	}
}
