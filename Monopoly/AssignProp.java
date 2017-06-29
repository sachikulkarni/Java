public class AssignProp
{
  private String name;
  private int price;
  private int rent;
  private int house;
  private int hotel;
  private int index;
  private String bought;
  
  public AssignProp(String n, int p, int r, int s, int t, int i)
  {
    name = n;
    price = p;
    rent = r;
    house = s;
    hotel = t;
    index = i;
    bought= " ";
  }
  public void setBought(String b)
  {
    bought=b;
  }
  public String getBought()
  {
    return bought;
  }
  public int getbIndex()
  {
    return index; 
  }
  public String toString()
  {
    return name + "\n";
  }
  
}