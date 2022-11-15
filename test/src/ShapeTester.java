import java.awt.Color;

/**
 * A class to test the function of Shape class
 * 
 * @author Wong Man Lok
 */
public class ShapeTester {
	/**
	 * main to drive the test
	 * 
	 * @param args not used 
	 */
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.color = new Color(250, 0, 0);
		shape.filled = true;
		shape.theta = 0;
		shape.xc = 1.0;
		shape.yc = 1.0;
		shape.xLocal = new double[] { 1, 1, 1, 1 };
		shape.yLocal = new double[] { 1, 1, 1, 1 };
		shape.translate(100, 100);
		shape.rotate(Math.PI / 3);
		int[] xScreen = shape.getX();
		int[] yScreen = shape.getY();
		System.out.printf("rotated theta: %f\n", shape.theta);
		System.out.println("expected result: 1.047198");
		System.out.printf("translated xc: %d\n", Math.round(shape.xc));
		System.out.println("expected result: 101");
		System.out.printf("translated yc: %d\n", Math.round(shape.yc));
		System.out.println("expected result: 101");
		System.out.print("xscreen outputs: ");
		for (int x : xScreen) {
			System.out.format("%d ", x);

		}
		System.out.println();
		System.out.println("expected output: 101 101 101 101");

		System.out.print("yscreen outputs: ");
		for (int y : yScreen) {
			System.out.format("%d ", y);

		}
		System.out.println();
		System.out.println("expected output: 102 102 102 102");

	}
}
