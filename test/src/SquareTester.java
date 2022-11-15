import java.awt.Color;

/**
 * A class to test the function of Square class
 * 
 * @author Wong Man Lok
 */
public class SquareTester {
	/**
	 * main to drive the test
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		Square square = new Square();
		square.xc = 0;
		square.yc = 0;
		square.theta = 0;
		square.color = new Color(250, 0, 0);
		square.filled = true;
		square.setVertices(50);
		square.translate(100, 100);
		square.rotate(Math.PI / 180.0);

		System.out.print("x coordinates: ");
		for (double x : square.xLocal) {
			System.out.printf("%f ", x);
		}
		System.out.println("\nexpected result: 50.000000 50.000000 -50.000000 -50.000000");

		System.out.print("y coordinates: ");
		for (double y : square.yLocal) {
			System.out.printf("%f ", y);
		}
		System.out.println("\nexpected result: 50.000000 -50.000000 -50.000000 50.000000");

		int[] xScreen = square.getX();
		int[] yScreen = square.getY();
		System.out.print("xscreen outputs: ");
		for (int x : xScreen) {
			System.out.format("%d ", x);

		}
		System.out.println();
		System.out.println("expected output: 149 151 51 49");

		System.out.print("yscreen outputs: ");
		for (int y : yScreen) {
			System.out.format("%d ", y);

		}
		System.out.println();
		System.out.println("expected output: 151 51 49 149");

	}

}
