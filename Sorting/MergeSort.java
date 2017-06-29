/* Sachi Kulkarni
 * Period 4*/
import java.util.*;
import java.util.ArrayList;
public class MergeSort
{
 public static void main(String[] args)
  {
    Scanner input= new Scanner(System.in);
    System.out.println("How many numbers do you want to sort?");
    int x= input.nextInt();
    int [] n= new int[x];
    SetValuesI(n,x);
    
    n= split(n);
    for (int i=0; i<x; i++)
    {
      System.out.println(n[i]);
    }     
    
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
  public static int[] split(int [] n)
  {
    if (n.length==1)
    {
      return n;
    }
    else 
    {
      int half= (n.length/2);
      int firsth []= new int [half];
      int secondh []=new int [n.length-half];
      for(int i=0; i<n.length; ++i)
      {
        if(i<half)
        {
          firsth[i]=n[i];
        }
        else 
        {
         secondh[i-half]=n[i]; 
        }
       }
      firsth=split(firsth);
        secondh=split(secondh);
        n=merge(firsth, secondh);
        return n;
      
    }
  }
  public static int[] merge(int [] fh, int [] sh)
  {
    int merged[]= new int[ fh.length+sh.length];
    int f=0;
    int s=0;
    for (int i=0; i<merged.length;++i)
    {
      if(f==fh.length)
      {
        merged[i]=sh[s];
        ++s;
      }
      else if (s==sh.length)
      {
        merged[i]=fh[f];
        ++f;
      }
      else if (fh[f]>sh[s])
      {
        merged[i]=sh[s];
        ++s;
      }
      else 
      {
        merged[i]=fh[f];
        ++f;
      }
    }
    return merged;
  }
}
