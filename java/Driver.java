public class Driver
{
    public static void main(String[] args) {
        
        SolarSystem x = new SolarSystem(750,750);
        int d = 150;
        int i = 0;
        int mi = 0;
        int md = 40;
    
        x.drawSolarObject(0, 0, 60, "YELLOW");
        while(true)
        {
            //Sun constant
            x.drawSolarObject(0, 0, 60, "YELLOW");
            //Earth
            x.drawSolarObject(d, i, 40, "BLUE");
            //Moon;
            x.drawSolarObjectAbout(md, mi, 10, "GREY", d, i);
            
            x.finishedDrawing(); 
            //i == a; mi == moon angle;
            i++;
            mi = mi - 2;
        }
        
       
      
    }
}