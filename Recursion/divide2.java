//Sachi Kulkarni 
//Period 4, 3/21/17
import java.util.*;
public class divide2
{
  public static void main(String[] args)
  {
    Scanner input= new Scanner(System.in);
    System.out.println("Give me a number");
    int num1= input.nextInt();
    System.out.println("Give me a number to divide the first number by");
    int num2= input.nextInt();
    System.out.print((num1/num2)+".");
    int remainder= num1%num2;
    remainder(num1,num2, remainder);
    System.out.println();
  }
  public static void remainder(int n1, int n2, int remain)
  {
    if(remain!=0)
    {
     System.out.print((remain*10)/n2);
     remain=(remain*10)%n2;
     remainder(n1,n2,remain);
    }
  }
}