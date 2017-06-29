import java.util.*;

public class Monopoly
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    //introduction
    System.out.println("Welcome to Monopoly! This is a two player game. \nPlayer one is O and player two is X.");
    player one = new player ("O",0);
    player two = new player ("X",0);
   
     
    // arraylist of properties
    ArrayList<AssignProp> properties = new ArrayList<AssignProp>();
    properties.add(new AssignProp("WHS", 100, 6, 0, 0, 1));
    properties.add(new AssignProp("Secret Sidewalk", 240, 20, 0, 0, 2));
    properties.add(new AssignProp("Mission Peak", 140, 10, 0, 0, 3));
    properties.add(new AssignProp("Great America", 340, 30, 0, 0, 5));
    properties.add(new AssignProp("Gilroy Gardens", 200, 16, 0, 0, 6));
    properties.add(new AssignProp("Half MoonBay", 380, 38, 0, 0, 7));
    properties.add(new AssignProp("Japantown", 180, 14, 0, 0, 8));
    properties.add(new AssignProp("Great Mall", 260, 22, 0, 0, 9));
    properties.add(new AssignProp("SFMOMA", 380, 34, 0, 0, 11));
    properties.add(new AssignProp("Alcatraz Island", 300, 26, 0, 0, 12));
    properties.add(new AssignProp("Santana Row", 320, 28, 0, 0, 13));
    properties.add(new AssignProp("Oakland Zoo", 160, 12, 0, 0, 15));
    properties.add(new AssignProp("AT&T Park", 360, 32, 0, 0, 16));
    properties.add(new AssignProp("Cal bears", 280, 24, 0, 0, 17));
    properties.add(new AssignProp("Levi Stadium", 380, 36, 0, 0, 18));
    properties.add(new AssignProp("Golden Gate Bridge", 220, 18, 0, 0, 19));
    properties.add(new AssignProp("Jail", 0, 0, 0, 0, 4));
    properties.add(new AssignProp("Start", 0, 0, 0, 0,0));
    properties.add(new AssignProp("Chance", 0, 0, 0, 0, 10));
    properties.add(new AssignProp("Go to Jail", 0, 0, 0, 0, 14));
    
    // pindex --> player space on board
    
     // print board
    board(one, two);    
    String reply = "Y";
    while (reply.equals("Y"))
    {
      System.out.println("It is Player one's turn.");      
      dice(one);
      board(one, two);
      action(one, properties);
      System.out.println("It is Player two's turn.");
      dice(two);
      board(one, two);
      action(two, properties);
      System.out.println("Do you want to continue playing? Y/N");
      reply = input.next();
    }
  }
  public static void board(player one, player two)
  {
    System.out.println("_________________________________________________________"); 
    System.out.println("|       |       |       |       |       |       |       |");
    System.out.println("| JAIL  |Great  |Gilroy | Half  |Japan  | Great |CHANCE |");
    System.out.println("|       |America|Gardens|MoonBay|town   | Mall  |?????? |");
    System.out.println("|_"+moveP1(one,4)+moveP2(two,4)+"____|_"+moveP1(one,5)+moveP2(two,5)+
                       "____|_"+moveP1(one,6)+moveP2(two,6)+"____|_"+moveP1(one,7)+moveP2(two,7)+
                       "____|_"+moveP1(one,8)+moveP2(two,8)+"____|_"+moveP1(one,9)+moveP2(two,9)+
                       "____|_"+moveP1(one,10)+moveP2(two,10)+"____|");
    System.out.println("|       |                                       |       |");
    System.out.println("|Mission|                                       |SFMOMA |");
    System.out.println("|Peak   |                                       |       |");
    System.out.println("|_"+moveP1(one,3)+moveP2(two,3)+"____|                                       |_"+moveP1(one,11)+moveP2(two,11)+"____|");
    System.out.println("|       |            The Game of                |       |");
    System.out.println("|Secret |             Monopoly:                 |Alcatrz|");
    System.out.println("Sidewalk|         Bay Area Edition $$$          |Island |");
    System.out.println("|_"+moveP1(one,2)+moveP2(two,2)+"____|                                       |_"+moveP1(one,12)+moveP2(two,12)+"____|");
    System.out.println("|       |                                       |       |");
    System.out.println("|  WHS  |                                       |Santana|");
    System.out.println("|(trash)|                                       |  Row  |");
    System.out.println("|_"+moveP1(one,1)+moveP2(two,1)+"____|_______________________________________|_"+moveP1(one,13)+moveP2(two,13)+"____|"); 
    System.out.println("|       |Golden |       |       |       |       |       |");
    System.out.println("| START |Gate   | Levi  |  Cal  | AT&T  |Oakland| GO TO |");
    System.out.println("|       |Bridge |Stadium| bears | Park  | Zoo   | JAIL  |");
    System.out.println("|_"+moveP1(one,0)+moveP2(two,0)+"____|_"+moveP1(one,19)+moveP2(two,19)+
                       "____|_"+moveP1(one,18)+moveP2(two,18)+"____|_"+moveP1(one,17)+moveP2(two,17)+
                       "____|_"+moveP1(one,16)+moveP2(two,16)+"____|_"+moveP1(one,15)+moveP2(two,15)+
                       "____|_"+moveP1(one,14)+moveP2(two,14)+"____|");
  }
  public static String moveP1(player p, int b)
  {
      if (p.getPIndex()==b)
      {
        return "O";
      }
    return "_";
  }
  
  public static String moveP2(player p, int b)
  {
    if (p.getPIndex()==b)
      {
        return "X";
      }
    return "_";
  }
  
  public static void dice(player p)
  {
    int roll = (int) (1 + Math.random() * 6);
    System.out.println("You rolled a " + roll);
    int temppIndex = p.getPIndex();
    temppIndex += roll;
    
    if (temppIndex > 19)
    {
      p.setPIndex(temppIndex - 20);
      
    }
    else
    {
      p.setPIndex(temppIndex);
    }
  }
  
  public static void action(player p, ArrayList <AssignProp> properties )
  {
    Scanner input = new Scanner(System.in);
    if (p.getPIndex()==10)
    {
      //chance method
    }
    else if (p.getPIndex()==4)
    {
      //do nothing
    }
    else if (p.getPIndex()==14)
    {
      //go to jail method
    }
    else if (p.getPIndex()==0)
    {
      int balance= p.getBalance()+100;
      p.setBalance(balance);
    }
    else 
    {
      //check if prop is owned or not
      if (properties.get(p.getPIndex()).getBought().equals(" "))
      {
        System.out.println("Do you want to buy this property?(Y/N)");
        String reply= input.next();
        if (reply.equals("Y"))
        {
          properties.get(p.getPIndex()).setBought(p.getPname());
        }
      }
      else 
      {
      }
    }
  }
}