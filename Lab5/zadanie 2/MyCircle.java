/*
Autorzy: Aleksander Tyński
         Maciej Falkiewicz
   Zadnie nr 1 - MyPoint
*/

import java.util.List;

public class MyCircle {
    private int radius = 1;
    private List<MyPoint> mypoint;
    MyCircle(int x, int y, List<MyPoint> mypoint);

    public MyCircle () {
    }
    public MyCircle (int x, int y, int radius)
    {
        super(x,y);
        this.radius=radius;
    }
    public int getRadius()
    {
        return radius;
    }
    public void setRadius (int radius)
    {
        this.radius=radius;
    }
    public MyPoint getCenter()
    {
        return center;
    }
    public void setCenter (double center)
    {
        this.center=center;
    }
    public int getCenterx ()
    {
        return Centerx;
    }
    public void setCenterx (int x)
    {
        this.centerx=centerx;
    }
    public int getCentery ()
    {
        return centery;
    }
    public void setcentery (int y)
    {
        this.centery=centery;
    }
    public int [] getCenterxy={x,y};

    public void setCenterxy (int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    public String toString()
    {
        return "MyCircle[radius = " + radius + ", center = ("  
    }

}
