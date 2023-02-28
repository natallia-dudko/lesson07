package by.lesson.seven.main;

public class Task01 {

	public static void main(String[] args) {
		double x;
		double fx;

		x = 0.5;
		fx = Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2.0 / 3.0))) + 1.7;
		System.out.print("fx = "+fx);

	}

}
