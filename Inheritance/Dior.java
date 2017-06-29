public class Dior extends Bloomingdales
{
  private int salary;
  private int jewelry;
  public Dior()
  {
    super();
    jewelry=3;
    salary=15;
    
  }
  public Dior(int j,int sa, int sh, int c)
  {
    super(15,sh,sa);
    jewelry=j; 
    
  }
  public int getSalary()
  {
    return 15;
  }
  public int getJewelry()
  {
    return jewelry;
  }
}