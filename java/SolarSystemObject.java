/**
 * @author Adam Burgess
 * Allows you to create a planet and add to the solar system without explicity using the Solar System class
 */
public class SolarSystemObject
{
    protected double distance;
    protected double angle;
    protected double diameter;
    protected String colour;
    

    /**
     * Constructor to initialize variables in Planet class
     * @param d Distance
     * @param a Angle
     * @param dia Diameter
     * @param c Colour
     * @param changeAngle Change in angle, allows for realistic 2D rotation to occurs.
     */
    public SolarSystemObject(double d, double a, double dia, String c)
    {
        
        this.distance = d;
        this.angle = a;
        this.diameter = dia;
        this.colour = c;
        
    }
    /**
     * Accessor method
     * @return The distance variable
     */
    public double getDistance()
    {
        return distance;
    }
    /**
     * Accessor method
     * @return The angle variable
     */
    public double getAngle()
    {
        return angle;
    }

    /**
     * Accessor method
     * @return The instance variable diameter
     */
    public double getDiameter()
    {
        return diameter;
    }

    /**
     * Makes use of instance variables within Planet class to draw the planet onto the SolarSystem
     * @param s The solar system which the planet object will be draw onto
     */
    public void rotation(SolarSystem s)
    {
        s.drawSolarObject(distance, angle, diameter, colour);
        
    }

    
}