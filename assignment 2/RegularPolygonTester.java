/**
 * a class to test RegularPolygon
 * 
 * @author Wong Man Lok
 */
public class RegularPolygonTester {
    /**
     * main to drive the test
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        RegularPolygon regularPolygon = new RegularPolygon(3, 2.0);
        RegularPolygon regularPolygon1 = new RegularPolygon(3);
        RegularPolygon regularPolygon2 = new RegularPolygon();

        System.out.print("number of sides and radius: ");
        System.out.printf("%d %f", regularPolygon.getNumOfSides(), regularPolygon.getRadius());
        System.out.println("\nexpected result: 3 2.000000");

        System.out.print("number of sides and radius: ");
        System.out.printf("%d %f", regularPolygon1.getNumOfSides(), regularPolygon1.getRadius());
        System.out.println("\nexpected result: 3 1.000000");

        System.out.print("number of sides and radius: ");
        System.out.printf("%d %f", regularPolygon2.getNumOfSides(), regularPolygon2.getRadius());
        System.out.println("\nexpected result: 3 1.000000");

        System.out.print("xlocal set: ");
        for (double i : regularPolygon.getXLocal()) {
            System.out.printf("%f ", i);
        }
        System.out.println("\nexpected result: 2.000000 -1.000000 -1.000000");

        System.out.print("ylocal set: ");
        for (double i : regularPolygon.getYLocal()) {
            System.out.printf("%f ", i);
        }
        System.out.println("\nexpected result: 0.000000 -1.732051 1.732051");

        regularPolygon.setNumOfSides(4);
        System.out.print("number of sides and radius after changing no of sides: ");
        System.out.printf("%d %f", regularPolygon.getNumOfSides(), regularPolygon.getRadius());
        System.out.println("\nexpected result: 4 2.000000");
        System.out.print("xlocal set: ");
        for (double i : regularPolygon.getXLocal()) {
            System.out.printf("%f ", i);
        }
        System.out.println("\nexpected result: 1.414214 1.414214 -1.414214 -1.414214");

        System.out.print("ylocal set: ");
        for (double i : regularPolygon.getYLocal()) {
            System.out.printf("%f ", i);
        }
        System.out.println("\nexpected result: 1.414214 -1.414214 -1.414214 1.414214");

        regularPolygon.setRadius(4);
        System.out.print("number of sides and radius after changing radius: ");
        System.out.printf("%d %f", regularPolygon.getNumOfSides(), regularPolygon.getRadius());
        System.out.println("\nexpected result: 4 4.000000");
        System.out.print("xlocal set: ");
        for (double i : regularPolygon.getXLocal()) {
            System.out.printf("%f ", i);
        }
        System.out.println("\nexpected result: 2.828427 2.828427 -2.828427 -2.828427");

        System.out.print("ylocal set: ");
        for (double i : regularPolygon.getYLocal()) {
            System.out.printf("%f ", i);
        }
        System.out.println("\nexpected result: 2.828427 -2.828427 -2.828427 2.828427");

        System.out.printf("contains: %b\n", regularPolygon.contains(1, 2));
        System.out.println("expected result: true");

    }

}