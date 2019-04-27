/*
    Martyna Klebba
    Aleksander Tyński
    Zadanie 3 lab4
    Point/MovablePoint
     */
public class Point
{
    private float x=0.0f;
    private float y=0.0f;

    public Point(float x, float y)
    {
        this.x=x;
        this.y=y;
    }
    public Point()
    {
        x=0.0f;
        y=0.0f;
    }
    public float getX()
    {
        return x;
    }
    public void setX(float x)
    {
        this.x=x;
    }
    public float getY()
    {
        return y;
    }
    public void setY(float y)
    {
        this.y=y;
    }
    public void setXY(float x, float y)
    {
        this.x=x;
        this.y=y;
    }
    public float[] getXY={x,y};

    public String toString()
    {
        return "("+x+","+y+")";
    }
}
