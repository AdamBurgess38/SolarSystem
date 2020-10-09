public class Moon extends Planet
{

   

    public Moon(double d, double a, double dia, String c, double changeAngle) {
        super(d, a, dia, c, changeAngle);
        
    }

    public void move(SolarSystem s, Planet p)
    {
        s.drawSolarObjectAbout(distance, angle, 10, "GREY", p.getDistance(), p.getAngle());
    }


    
}