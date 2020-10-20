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
        s.drawSolarObject(distance, angle*speed, diameter, colour);
    }
    
}