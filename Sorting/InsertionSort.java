/* Sachi Kulkarni
 * Period 4*/
import java.util.*;
import java.util.ArrayList;
public class InsertionSort
{
  public static void main(String[] args)
  {
    Scanner input= new Scanner(System.in);
    System.out.println("How many numbers do you want to sort?");
    int x= input.nextInt();
    ArrayList<Integer> nums= new ArrayList<Integer>();
    SetValuesI(nums,x);
    insertion(nums,x);
    
  }
  public static void SetValuesI(ArrayList n, int x)
  {
    Scanner input= new Scanner(System.in);
    for (int i=0; i<x; i++)
    {
      System.out.println("enter number " +(i+1)+" :");
      Integer l= input.nextInt();
      n.add(l);
    }
  }
  public static void insertion(ArrayList n, int x)
  {
    for (int g=0; g<x; g++)
    {
      int index=g;
      for (int i=0; i<g; i++)
      {
        if((Integer)(n.get(g))<((Integer)( n.get(i))))
        {
          n.add((i),n.get(g));
          n.remove(g+1);
        }
      }
    }
      System.out.println(n);
    
  }
}
