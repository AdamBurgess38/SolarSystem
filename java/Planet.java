public class Planet
{
    protected double distance;
    protected double angle;
    protected double diameter;
    protected String colour;
    protected double changeInAngle;


    public Planet(double d, double a, double dia, String c, double changeAngle)
    {
        this.distance = d;
        this.angle = a;
        this.diameter = dia;
        this.colour = c;
        this.changeInAngle = changeAngle;
    }

    public double getDistance()
    {
        return distance;
    }

    public double getAngle()
    {
        return angle;
    }

    public double getDiameter()
    {
        return diameter;
    }

    public void move(SolarSystem s)
    {
        s.drawSolarObject(distance, angle, diameter, colour);
    }

    public void alterAngle()
    {
        angle += changeInAngle;
    }
}