/**
 * @author Adam Burgess
 * Allows you to create a planet and add to the solar system without explicity using the Solar System class
 */
abstract class SolarSystemObject {
    protected String name;
    protected double distance;
    protected double angle;
    protected double diameter;
    protected String colour;




    /**
     * Constructor to initialize variables in Planet class
     * @param n Name
     * @param d Distance
     * @param a Angle
     * @param dia Diameter
     * @param c Colour
     */
    public SolarSystemObject(String n, double d, double a, double dia, String c) {
        this.name = n;
        this.distance = d;
        this.angle = a;
        this.diameter = dia;
        this.colour = c;
    }
    /**
     * Accessor method
     * @return The distance variable
     */
    public double getDistance() {
        return distance;
    }
    /**
     * Accessor method
     * @return The angle variable
     */
    public double getAngle() {
        return angle;
    }

    /**
     * Accessor method
     * @return The instance variable diameter
     */
    public double getDiameter() {
        return diameter;
    }

    /**
     * Makes use of instance variables within Planet class to draw the planet onto the SolarSystem
     * Must be implemented by subclasses, implementation will vary depending on type of object.
     * @param s The solar system which the planet object will be draw onto
     */
    abstract void draw(SolarSystem s, double speed);


    /**
     * Overrided method, can view all information needed for an instance of the SolarSystemObject class.
     */
    @Override
    public String toString() {
        return ("Name: " + name + "\nDistance from rotation point: " + distance +
            "\nAngle of polar coordinate: " + angle + "\nDiameter: " + diameter +
            "\nColour: " + colour);
    }
}