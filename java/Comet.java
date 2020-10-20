public class Comet extends SolarSystemObject implements SolarObjectMovement {

    //Change in angle of comet
    private double changeInAngle;

    /**
     * 
     * @param n Name of comet
     * @param d Distance from Sun
     * @param a Angle from sun (Bearing)
     * @param dia  Diameter of comet
     * @param c Colour of comet
     */
    public Comet(String n, double d, double a, double dia, String c) {
        super(n, d, a, dia, c);
        changeInAngle = 1 + (int)(Math.random() * 3);
    }

    /**
     * Draw comet onto SolarSystem Panel
     */
    public void draw(SolarSystem s, double speed) {
        s.drawSolarObject(distance, angle, diameter, colour);
        alterPosition();
    }


    /**
     * Alters position to sun to emulate motion.
     */
    public void alterPosition() {
        angle += 2;
        distance += 10;
        if (distance > 500) {
            resetComet();
        }
    }


    /**
     * When comet is out of bounds, this code resets it and emulates a new comet in area.
     */
    public void resetComet() {
        distance = 40 + (int)(Math.random() * 300);
        angle = 40 + (int)(Math.random() * 300);
        diameter = 5 + (int)(Math.random() * 15);
        changeInAngle = -4 + (int)(Math.random() * 3);
    }
}