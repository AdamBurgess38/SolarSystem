public class Driver {
    public static void main(String[] args) {
        OurSolarSystem solar = new OurSolarSystem();
        while (true) {
            //Continually is called to move solar system.
            solar.moveSystem();
        }

    }


}