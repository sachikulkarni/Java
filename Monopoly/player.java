import java.util.*;

public class player
{ 
 private int balance; 
 private String pname;
 private int pIndex;
 ArrayList<AssignProp> properties = new ArrayList<AssignProp>();
  
 public player(String n, int pi) 
 { 
   balance=1500; 
   pname=n; 
   properties= null; 
   pIndex= pi;
 } 
 public int getBalance() 
 { 
  return balance;  
 } 
 public String getPname() 
 { 
   return pname; 
 } 
 public int getPIndex()
 {
   return pIndex; 
 }
 /*public ArrayList getProps() 
 { 
   return properties; 
 } */
 public void setPIndex(int i)
 {
   pIndex= i; 
 }
 public void setBalance(int b) 
 { 
   balance+=b; 
 } 
 public void setpName(String n) 
 { 
   pname=n; 
 } 
 public void setProps(AssignProp x) 
 { 
   properties.add(x); 
 } 
 public String toString()
 {
   return "Player Name: "+ pname + "\n Balance:"+ balance + "\n Properties: "+ properties;
 }
}