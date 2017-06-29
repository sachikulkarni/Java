public class LV extends Bloomingdales
{
  private int purses;
  private int sunglasses;
  private int salary;
  public LV()
  {
   super();
   purses=3;
   sunglasses=3;
   salary= super.getSalary()+10;
  }
  public LV(int c, int sh, int sa, int p, int su)
  {
    super(sa, c, sh);
    salary=super.getSalary()+10;
    purses=p;
    sunglasses=su;
  }
  public int getSalary()
  {
    return (super.getSalary()+10);
  }
  public int getPurses()
  {
    return 6;
  }
  public int getSunglasses()
  {
    return 9;
  }
   
}