/**
 * @author Adam Burgess
 * Allows you to create a planet and add to the solar system without explicity using the Solar System class
 */
public class Planet extends SolarSystemObject
{
   
    protected double changeInAngle;

    /**
     * Constructor to initialize variables in Planet class
     * @param d Distance
     * @param a Angle
     * @param dia Diameter
     * @param c Colour
     * @param changeAngle Change in angle, allows for realistic 2D rotation to occurs.
     */
    public Planet(double d, double a, double dia, String c, double changeAngle)
    {
        super(d, a, dia, c);
        this.changeInAngle = changeAngle;
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
        alterAngle();
    }

    /**
     * Alters the angle, this allows for rotation to occur and prevents the planet from.
     */
    protected void alterAngle()
    {
        angle += changeInAngle;
    }
}