/**
 * Class allows User to produce a star object, which will typically be the centre of a solar system. 
 * @author Adam Burgess
 */
public class Star extends SolarSystemObject
{
    /**
     * Constructor to initialize variables in Star class
     * @param n Name
     * @param d Distance
     * @param a Angle
     * @param dia Diameter
     * @param c Colour
     */
    public Star(String n, double d, double a, double dia, String c) {
        super(n, d, a, dia, c);
    }

    /**
     * Draws an instance of Star onto SolarSystem Panel. 
     */
    public void draw(SolarSystem s, double speed)
    {
        s.drawSolarObject(this.getDistance(), this.getAngle(), this.getDiameter(), this.getColour());
    }
    
}