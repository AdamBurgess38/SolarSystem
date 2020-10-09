public class OODriver
{
    public static void main(String[] args) {
        Planet sun = new Planet(0, 0, 60, "YELLOW",0);
        Planet earth = new Planet(150, 0, 40, "BLUE", 1);
        Moon moon = new Moon(40,0,10,"WHITE",-2);
        SolarSystem solar = new SolarSystem(750,750);

        while(true)
        {
            sun.move(solar);
            earth.move(solar);
            moon.move(s,earth);
            solar.finishedDrawing();
            earth.alterAngle();
            moon.alterAngle();
        }
    }


}