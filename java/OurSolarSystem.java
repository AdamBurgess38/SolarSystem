public class OurSolarSystem
{
    SolarSystem solarSystem = new SolarSystem(750,750);
    Planet[] planets = new Planet[3];
    Moon[] moons = new Moon[2];
        


    public OurSolarSystem()
    {
        initializePlanets();
    }


    private void initializePlanets()
    {
        planets[0] = new Planet(0, 0, 60, "YELLOW",0);
        planets[1] = new Planet(150, 223, 40, "BLUE", 1);
        
        planets[2] = new Planet(275, 0, 35, "GREEN", 0.75);
        moons[0] = new Moon(40,0,10,"DARK_GRAY",-2,planets[1]);
        moons[1] = new Moon(35,0,10,"LIGHT_GRAY",1.5,planets[2]);
    }

    public void moveSystem()
    {
        for(int i = 0; i<planets.length; i++)
        {
            planets[i].rotation(solarSystem);
            
        }

        for(int j = 0; j<moons.length; j++)
        {
            moons[j].rotation(solarSystem);
            
        }
        solarSystem.finishedDrawing();
    }
}