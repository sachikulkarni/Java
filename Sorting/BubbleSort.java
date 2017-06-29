/* Sachi Kulkarni
 * Period 4*/
import java.util.*;
public class BubbleSort
{
  public static void main(String[] args)
  {
    Scanner input= new Scanner(System.in);
    System.out.println("How many numbers do you want to sort?");
    int x= input.nextInt();
    int [] n= new int[x];
    SetValuesI(n,x);
    Compare(n,x);
    
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
  public static void Compare(int [] n, int x)
  {
    for (int g=0; g<x; g++)
    {
      for (int i=0; i<x; i++)
      {
        if (i>0)
        {
          int first=n[(i-1)];
          int second=n[i];
          if (first<=second)
          {
            first=n[(i-1)];
            second=n[i];
          }
          else 
          {
            first=n[i];
            second=n[(i-1)];
          }
          n[(i-1)]=first;
          n[i]=second;
        }
      }
    }
    for (int i=0; i<x; i++)
    {
      System.out.println(n[i]);
    }     
  }
}

