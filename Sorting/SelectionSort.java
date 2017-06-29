/* Sachi Kulkarni
 * Period 4*/
import java.util.*;
public class SelectionSort
{
  public static void main(String[] args)
  {
    Scanner input= new Scanner(System.in);
    System.out.println("How many numbers do you want to sort?");
    int x= input.nextInt();
    int [] n= new int[x];
    SetValuesI(n,x);
    selection(n,x);
    
  }
  public static void SetValuesI(int [] n, int x)
  {
    Scanner input= new Scanner(System.in);
    for (int i=0; i<x; i++)
    {
      System.out.println("enter number " +(i+1)+" :");
      n[i]=input.nextInt();
    }
  }
  public static void selection(int [] n, int x)
  {
    int min;
    for (int g=0; g<x; g++)
    {
      int index=g;
      min=n[g];
      for (int i=g; i<x; i++)
      {
        if(n[i] < min)
        {
          min=n[i];
          index=i;
        }
      }
      int store= n[g];
      n[g]=min;
      n[index]=store;
    }
    for (int i=0; i<x; i++)
    {
      System.out.println(n[i]);
    }     
  }
}
