package ua.lviv.lgs;

public class Circle {

	private double radius;
	private double diameter;

	Circle() {
		this.radius = 2.4;
		this.diameter = radius * 2; /// ;)
	}

	Circle(double radius) {
		this.radius = radius;
		this.diameter = radius * 2;
	}

	public double circleSqure() {

		return 3.1415926 * this.diameter * this.diameter / 4;
	}

	public double circleLenth() {

		return 2 * 3.1415926 * this.radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", diameter=" + diameter + "]";
	}

}
