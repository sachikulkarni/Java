  public class Circle extends Shape
  {
    private int radius;
    public Circle(String n, int r)
    {
      super(n);
      radius= r;  
    }
    public void setRadius(int r)
    {
      radius= r;
    }
    public int getRadius()
    {
      return radius;
    }
    public double area()
    {
      return(Math.PI * radius * radius);
    }
  }