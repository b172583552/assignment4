
import java.awt.Color;
import java.lang.Math;

/**
 * A class to provide methods for translating, rotating and getting coordinates
 * for shapes
 * 
 * @author Wong Man Lok
 */
public class Shape {
    /**
     * a Color object specifying the color of the shape
     */
    Color color;
    /**
     * a boolean value specifying whether the shape is filled or not filled
     */
    boolean filled;
    /**
     * a double value specifying the orientation (in radians) of the shape in the canvas coordinate system
     */
    double theta;
    /**
     * a double value specifying the x-coordinate of the center of the shape in the canvas coordinate system
     */
    double xc;
    /**
     * a double value specifying the y-coordinate of the center of the shape in the canvas coordinate system
     */
    double yc;
    /**
     * an array of double values specifying the x-coordinates of the vertices (in counter-clockwise order) of the shape in its local coordinate system
     */
    double[] xLocal;
    /**
     * an array of double values specifying the y-coordinates of the vertices (in counter- clockwise order) of the shape in its local coordinate system
     */
    double[] yLocal;

    /**
     * a empty method overridden by other classes
     * 
     * @param d distance from origin
     */
    public void setVertices(double d) {

    }

    /**
     * translate the canvas centre coordinate of the shape by dx and dy
     * 
     * @param dx unit of x coordinate translated
     * @param dy unit of y coordinate translated
     */
    public void translate(double dx, double dy) {
        this.xc += dx; //set the value according to the formula 
        this.yc += dy;

    }

    /**
     * rotate the shape by dt
     * 
     * @param dt radian degree
     */
    public void rotate(double dt) {
        this.theta += dt; //set the value according to the formula 

    }

    /**
     * Get the canvas x coordinates for all vertices
     * 
     * @return an integer array containing the x-coordinates of vertices
     */
    public int[] getX() {
        int[] xCanvas = new int[this.xLocal.length];
        for (int i = 0; i < this.xLocal.length; i++) {
            xCanvas[i] = (int) Math 
                    .round(this.xLocal[i] * Math.cos(this.theta) - this.yLocal[i] * Math.sin(this.theta) + xc); 
        }
        return xCanvas;
    }

    /**
     * Get the canvas y coordinates for all vertices
     * 
     * @return an integer array containing the y-coordinates of vertices
     */
    public int[] getY() {
        int[] yCanvas = new int[this.yLocal.length];
        for (int i = 0; i < this.yLocal.length; i++) {
            yCanvas[i] = (int) Math
                    .round(this.xLocal[i] * Math.sin(this.theta) + this.yLocal[i] * Math.cos(this.theta) + yc); //set the value according to the formula 
        }
        return yCanvas;
    }

}
