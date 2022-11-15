import java.awt.Color;

/**
 * A class to test the Shape class
 * 
 * @author Wong Man Lok
 */
public class ShapeTester {
    /**
     * main to drive the test
     * 
     * @param args not used here
     */
    public static void main(String[] args) {
        Shape shape = new Shape();
        Color color = Color.white;
        shape.setColor(color);
        System.out.print("color test: ");
        System.out.println(shape.getColor());
        System.out.println("expected results: java.awt.Color[r=255,g=255,b=255]");

        boolean filled = true;
        shape.setFilled(filled);
        System.out.print("filled test: ");
        System.out.println(shape.getFilled());
        System.out.println("expected results: true");

        double theta = 3.0;
        shape.setTheta(theta);
        System.out.print("theta test: ");
        System.out.println(shape.getTheta());
        System.out.println("expected results: 3.0");

        double[] xlocal = new double[] { 1.0, 2.0, 3.0 };
        shape.setXLocal(xlocal);
        System.out.print("xlocal test: ");
        for (double i : shape.getXLocal()) {
            System.out.format("%f ", i);
        }
        System.out.println("\nexpected results: 1.000000 2.000000 3.000000");

        double[] ylocal = new double[] { 1.0, 2.0, 3.0 };
        shape.setYLocal(ylocal);
        System.out.print("ylocal test: ");
        for (double i : shape.getYLocal()) {
            System.out.format("%f ", i);
        }
        System.out.println("\nexpected results: 1.000000 2.000000 3.000000");

        double xc = 1.0;
        shape.setXc(xc);
        System.out.print("xc test: ");
        System.out.println(shape.getXc());
        System.out.println("expected results: 1.0");

        double yc = 1.0;
        shape.setYc(yc);
        System.out.print("yc test: ");
        System.out.println(shape.getYc());
        System.out.println("expected results: 1.0");

        shape.translate(1.0, 1.0);
        System.out.print("translated xc yc: ");
        System.out.format("%f %f\n", shape.getXc(), shape.getYc());
        System.out.println("expected result: 2.000000 2.000000");

        shape.rotate(1.0);
        System.out.print("rotated theta: ");
        System.out.println(shape.getTheta());
        System.out.println("expected result: 4.0");

        System.out.print("canvas x-coordinates: ");
        for (int i : shape.getX()) {
            System.out.format("%d ", i);
        }
        System.out.println("\nexpected result: 2 2 2");

        System.out.print("canvas y-coordinates: ");
        for (int i : shape.getY()) {
            System.out.format("%d ", i);
        }
        System.out.println("\nexpected result: 1 -1 -2");
    }

}