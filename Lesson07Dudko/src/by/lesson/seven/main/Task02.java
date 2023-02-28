package by.lesson.seven.main;

public class Task02 {

	public static void main(String[] args) {
		double fx;
		double a;
		double b;
		double n;
		double h;

		a = 0.50;
		b = 1;
		n = 10;
		h = (b - a) / n;

		System.out.println("-------------------------------------------------");
		System.out.printf("|\t%2s\t|\t%4s\t|\t%5s\t\t|\n", "n", "x", "y");
		System.out.println("-------------------------------------------------");

		for (double x = a, i = 1; x <= b; x = x + h, i++) {
			fx = Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2.0 / 3.0))) + 1.7;
			System.out.printf("|\t%2.0f\t|\t%4.2f\t|\t%4.6f\t|\n", i, x, fx);

		}
	}

}
