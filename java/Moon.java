/**
 * Extends the SolarSystemObject class to allow for a different drawSolarObject method to be called.
 * This allows us to rotate around a planet rather than the centre which would be the sun!
 * @author Adam Burgess
 */
public class Moon extends SolarSystemObject{
    //Planet object moon will orbit.
    private SolarSystemObject moonsPlanet;
    //Change in angle (Dictates speed of moon orbiting.)
    private double changeInAngle;


    /**
     * Constructor to initialize variables in Moon class
     * @param d Distance
     * @param a Angle
     * @param dia Diameter
     * @param c Colour
     * @param changeAngle Change in angle, allows for realistic 2D rotation to occurs.
     */
    public Moon(String n, double d, double a, double dia, String c, double changeAngle, SolarSystemObject p) {
        super(n, d, a, dia, c);
        changeInAngle = changeAngle;
        moonsPlanet = p;
    }

    /**
     * Allows moon to rotate around a planet which has been passed as the parameter.
     * @param s The solar system the moon object will be added to
     * @param p The planet that the moon will rotate against.
     */
    public void draw(SolarSystem s, double speed) {
        s.drawSolarObjectAbout(this.getDistance(), this.getAngle() * speed, 10, "GREY", moonsPlanet.getDistance(), moonsPlanet.getAngle() * speed);
        
        alterAngle(changeInAngle);
    }

    

    



}