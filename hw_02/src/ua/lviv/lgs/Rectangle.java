package ua.lviv.lgs;

public class Rectangle {

	private double lenth;
	private double width;

	Rectangle() {
		this.lenth = 4.0;
		this.width = 5.5;

	}

	Rectangle(double Lenth, double Width) {
		this.lenth = Lenth;
		this.width = Width;

	}

	public double rectangleSquare() {

		return this.lenth * this.width;
	}

	public double rectanglePerimeter() {

		return 2 * this.lenth + 2 * this.width;
	}

	@Override
	public String toString() {
		return "Rectangle [lenth=" + lenth + ", width=" + width + "]";
	}

}
