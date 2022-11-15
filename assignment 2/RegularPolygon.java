
/**
 * A class declares a number of private instance variables for storing the number of sides and the radius of a polygon.
 * It has public getters and setters for accessing its private instance variables.
 * It also has public methods for setting the local coordinates of the vertices of a polygon 
 * and for checking if a point (in the canvas coordinate system) is contained by a polygon
 * 
 * @author Wong Man Lok
 */
public class RegularPolygon extends Shape {
    private int numOfSides; // the number of sides of the regular n-sided polygon
    private double radius; //the radius of the regular n-sided polygon

    /**
     * a constructor for building a regular n-sided polygon with a radius of r
     * 
     * @param n number of sides
     * @param r radius
     */
    public RegularPolygon(int n, double r) {
        if (n < 3) {
            this.numOfSides = 3;
        } else {
            this.numOfSides = n;
        }

        if (r < 0) {
            this.radius = 0;
        } else {
            this.radius = r;
        }

        setVertices();
    }

    /**
     * a constructor for building a regular n-sided polygon with a radius of 1.0
     * 
     * @param n number of sides
     */
    public RegularPolygon(int n) {
        this(n, 1.0);
    }

    /**
     * a constructor for building a regular 3-sided polygon with a radius of 1.0.
     */
    public RegularPolygon() {
        this(3, 1.0);
    }

    /**
     * get number of sides of the polygon
     * 
     * @return number of sides
     */
    public int getNumOfSides() {
        return this.numOfSides;
    }

    /**
     * get radius of the polygon
     * 
     * @return radius
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * set number of sides of the polygon
     * 
     * @param n number of sides
     */
    public void setNumOfSides(int n) {
        if (n < 3) {
            this.numOfSides = 3;
        } else {
            this.numOfSides = n;
        }
        setVertices();
    }

    /**
     * set radius of the polygon
     * 
     * @param r radius
     */
    public void setRadius(double r) {
        if (r < 0) {
            this.radius = 0;
        } else {
            this.radius = r;
        }
        setVertices();
    }

    /**
     * setting the local coordinates of the vertices of the regular n-sided polygon based on its number of sides and radius
     */
    public void setVertices() {
        double[] xVertices = new double[this.numOfSides];
        double[] yVertices = new double[this.numOfSides];
        double a;
        double theta = 2 * Math.PI / this.numOfSides;
        if (this.numOfSides % 2 == 0) {
            a = Math.PI / this.numOfSides;
        } else {
            a = 0;
        }

        for (int i = 0; i < this.numOfSides; i++) {
            xVertices[i] = this.radius * Math.cos(a - i * theta);
            yVertices[i] = this.radius * Math.sin(a - i * theta);
        }

        setXLocal(xVertices);
        setYLocal(yVertices);
    }

    /**
     * determine if a point (x, y) in the canvas coordinate system is contained by the regular n-sided polygon
     * 
     * @param x canvas x-coordinate checked
     * @param y canvas y-coordinate checked
     * @return whether a point is contained in polygon
     */
    public boolean contains(double x, double y) {
        double xVertice;
        double theta = 2 * Math.PI / this.numOfSides;
        double xLocal = (x - getXc()) * Math.cos(-getTheta()) - (y - getYc()) * Math.sin(-getTheta());
        double yLocal = (x - getXc()) * Math.sin(-getTheta()) + (y - getYc()) * Math.cos(-getTheta());
        double checkpoint;

        xVertice = getXLocal()[this.numOfSides / 2];
        for (int i = 0; i < this.numOfSides; i++) {
            checkpoint = xLocal * Math.cos(i * theta) + yLocal * Math.sin(i * theta);
            if (checkpoint < xVertice) {
                return false;
            }
        }
        return true;
    }

}
