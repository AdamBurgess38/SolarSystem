/**
 * Class which allows User to create objects which are comets. 
 * @author Adam Burgess
 */
public class Comet extends SolarSystemObject{

    //Change in angle of comet
    private double changeInAngle;

    /**
     * Used to instantiate an instance of Comet.
     * @param n Name of Comet
     * @param d Distance from Sun
     * @param a Angle from sun (Bearing)
     * @param dia  Diameter of Comet
     * @param c Colour of Comet
     */
    public Comet(String n, double d, double a, double dia, String c) {
        super(n, d, a, dia, c);
        changeInAngle = 1 + (int)(Math.random() * 3);
    }

    /**
     * Draw comet onto SolarSystem Panel
     */
    public void draw(SolarSystem s, double speed) {
        s.drawSolarObject(this.getDistance(), this.getAngle(), this.getDiameter(), this.getColour());
        alterPosition();
    }


    /**
     * Alters position to sun to emulate motion.
     */
    private void alterPosition() {
        alterAngle(changeInAngle);
        alterDistance(10);
        if (this.getDistance() > 500) {
            resetComet();
        }
    }

    /**
     * Resets angle, allows comet object to look like a new comet when comet goes out of bounds.
     */
    protected void resetAngle()
    {
        //Resets angle to 0.
        alterAngle(-getAngle());
        alterAngle(40 + (int)(Math.random() * 300));
    }

    /**
     * Resets distance, allows comet object to look like a new comet when comet goes out of bounds.
     */
    protected void resetDistance()
    {
        //Resets distance to 0.
        alterDistance(-getDistance());
        alterDistance(40 + (int)(Math.random() * 300));
    }

    /**
     * When comet is out of bounds, this code resets it and emulates a new comet in area, without instanitating a new object.
     */
    public void resetComet() {
        resetAngle();
        resetDistance();
        setDiameter(5 + (int)(Math.random() * 15));
        changeInAngle = -4 + (int)(Math.random() * 3);
    }
}