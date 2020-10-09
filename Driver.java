public class Driver
{
    public static void main(String[] args) {
        System.out.print("hello");
        SolarSystem x = new SolarSystem(750,750);
        int d = 150;
        int i = 0;
        int mi = 0;
        int md = 40;
    
        x.drawSolarObject(0, 0, 60, "YELLOW");
        while(true)
        {
            x.drawSolarObject(0, 0, 60, "YELLOW");
            x.drawSolarObject(d, i, 40, "BLUE");
            x.drawSolarObjectAbout(md, mi, 10, "GREY", d, i);
            
            x.finishedDrawing(); 
            i++;
            mi = mi - 2;
        }
        
       
      
    }
}