package ua.lviv.lgs;

public class app_hw02 {

	public static void main(String[] args) {

		double lenth1 = 2.753;
		double width2 = 1.5;

		Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle(lenth1, width2);

		System.out.println("First rectangle, without parameters:");
		System.out.println(rectangle1);
		System.out.println("First rectangle, with parameters, that was declared above:");
		System.out.println(rectangle2);

		System.out.println("\nПлоща прямокутника1 = " + rectangle1.rectangleSquare() + ";");
		System.out.println("Периметер прямокутника1 = " + rectangle1.rectanglePerimeter() + ";");

		System.out.println("\nПлоща прямокутника2 = " + rectangle2.rectangleSquare() + ";");
		System.out.println("Периметер прямокутника2 = " + rectangle2.rectanglePerimeter() + ";");
		System.out.println("");

		double radius = 7.154;

		Circle circle1 = new Circle();
		Circle circle2 = new Circle(5.22);
		System.out.println("First circle, without parameters:");
		System.out.println(circle1);
		System.out.println("Second circle, with , that was declared above:");
		System.out.println(circle2);

		System.out.println("\nПлоща кола1 = " + circle1.circleSqure() + ";");
		System.out.println("Довжина кола1 = " + circle1.circleLenth() + ";");

		System.out.println("\nПлоща кола2 = " + circle2.circleSqure() + ";");
		System.out.println("Довжина кола2 = " + circle2.circleLenth() + ";");

	}

}
