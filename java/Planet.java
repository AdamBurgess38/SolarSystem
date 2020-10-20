/**
 * @author Adam Burgess
 * Allows you to create a planet and add to the solar system without explicity using the Solar System class
 */
public class Planet extends SolarSystemObject implements SolarObjectMovement {
    //Change in angle (Dictates speed of moon orbiting.)
    private double changeInAngle;

    /**
     * Constructor to initialize variables in Planet class
     * @param d Distance
     * @param a Angle
     * @param dia Diameter
     * @param c Colour
     * @param changeAngle Change in angle, allows for realistic 2D rotation to occurs.
     */
    public Planet(String n, double d, double a, double dia, String c, double changeAngle) {
        super(n, d, a, dia, c);
        this.changeInAngle = changeAngle * 1.5;
    }
    /**
     * Makes use of instance variables within Planet class to draw the planet onto the SolarSystem
     * @param s The solar system which the planet object will be draw onto
     */
    public void draw(SolarSystem s, double speed) {
        s.drawSolarObject(distance, angle * speed, diameter, colour);
        alterPosition();
    }

    /**
     * Alters the position of the planet, this allows for orbitation to occur.
     */
    public void alterPosition() {
        angle += changeInAngle;
    }


}