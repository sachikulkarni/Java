public class Bloomingdales 
{
  private int salary;
  private int clothes;
  private int shoes;
  
  public Bloomingdales()
  {
    clothes=3;
    shoes=3;
    salary=13;
  }
  public Bloomingdales(int c, int sh, int sa)
  {
   clothes=c;
   shoes=sh;
   salary=sa;
  }
  public int getSalary()
  {
    return salary;
  }
  public int getShoes()
  {
    return shoes;
  }
  public int getClothes()
  {
    return clothes;
  }
}