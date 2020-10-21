import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class OurSolarSystem implements KeyListener {
    // SolarSystem class used to allow us to draw objects.
    public static final SolarSystem solarSystem = new SolarSystem(900, 900);
    // Array of SolarSystemObjects.
    public static final SolarSystemObject[] solarObjects = new SolarSystemObject[13];
    double speed = 1;

    /**
     * Constructor for OurSolarSystem, creates an instance.
     */
    public OurSolarSystem() {
        solarSystem.addKeyListener(this);
        initializePlanets();
    }

    /**
     * Sets up the solarObjects in SolarSystem.
     */
    private void initializePlanets() {
        // Sun
        solarObjects[0] = new Star("Sun", 0, 0, 80, "YELLOW");
        // Mecury
        solarObjects[1] = new Planet("Mercury", 75, 123, 20, "#ff4e00", 6);
        // Venus
        solarObjects[2] = new Planet("Venus", 125, 324, 15, "DARK_GREY", -3.5);
        // Earth and Moon
        solarObjects[3] = new Planet("Earth", 175, 233, 32, "BLUE", 3);
        solarObjects[4] = new Moon("Moon", 40, 0, 6, "DARK_GRAY", -5, solarObjects[3]);
        // Mars
        solarObjects[5] = new Planet("Mars", 225, 0, 30, "#ff1b00", 1.5);
        // Jupiter & a few of it's moons.
        solarObjects[6] = new Planet("Jupiter", 300, 75, 68, "#accc33", 1);
        solarObjects[7] = new Moon("Jupiter Moon 1", 48, 0, 3, "LIGHT_GREY", -5, solarObjects[6]);
        solarObjects[8] = new Moon("Jupiter Moon 2", 50, 217, 2, "DARK_GRAY", 4, solarObjects[6]);
        // Uranus
        solarObjects[9] = new Planet("Uranus", 375, 2, 42, "#ffcb00", -0.75);
        // Neptune
        solarObjects[10] = new Planet("Neptune", 422, 151, 32, "#0097ff", 0.5);
        //Two comets
        solarObjects[11] = new Comet("Comet", 40 + (int)(Math.random() * 300), 45, 20, "#8f7461");
        solarObjects[12] = new Comet("Comet", 40 + (int)(Math.random() * 300), 45, 20, "#ffff9a");

    }

    /**
     * Method to move each item in solarObjects array.
     */
    public void moveSystem() {
        for (int i = 0; i < solarObjects.length; i++) {
            solarObjects[i].draw(solarSystem, speed);

        }
        solarSystem.finishedDrawing();
    }


    /**
     * Unused, no functionality. Code won't complie without method present. Could be MacOS
     */
    @Override
    public void keyTyped(KeyEvent e) {


    }

    /**
     * Unused, no functionality. Code won't complie without method present. Could be MacOS
     */
    @Override
    public void keyReleased(KeyEvent e) {


    }



    @Override
    public void keyPressed(KeyEvent e) {
        //Check's which key was pressed.
        int id = e.getKeyCode();
        if (id == 87) {
            //Increases speed of whole system
            speed = (speed < 3) ? speed + 0.025 : speed;
        } else if (id == 83) {
            //Decreases speed of whole system
            speed = (speed > 1) ? speed - 0.025 : speed;
        }
        System.out.println("Speed:" + speed);

    }





}