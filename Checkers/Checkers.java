/* Sachi Kulkarni
 * 12/14/16
 * Period 4*/
import java.util.*;
public class Checkers
{
  public static void main(String[] args)
  {
    int playerCounter=0;
    int a=0;
    int p1counter=0;
    int p2counter=0;
    int ptsleft=32;
    int oleft=16;
    int xleft=16;
    String piece= " ";
    Scanner input = new Scanner(System.in);
    /*
    Scanner input= new Scanner(System.in);
    System.out.println("Welcome to Checkers!");
    System.out.println("___|_0_|___|_0_|___|_0_|___|_0_");
    System.out.println("_O_|___|_O_|___|_0_|___|_0_|___");
    System.out.println("___|_0_|___|_0_|___|_0_|___|_0_");
    System.out.println("_._|___|_._|___|_._|___|_._|___");
    System.out.println("___|_._|___|_._|___|_._|___|_._");
    System.out.println("_x_|___|_x_|___|_x_|___|_x_|___");
    System.out.println("___|_x_|___|_x_|___|_x_|___|_x_");
    System.out.println("_x_|___|_x_|___|_x_|___|_x_|___");
    */
    System.out.println("Player 1 is x and Player 2 is o, the spaces with . represent black squares");
    //Initial Board Object array 
    Checkers2 [][] object= new Checkers2[8][8];
    object [0][0]= new Checkers2(0, 0, " ");
    object [0][1]= new Checkers2(0, 1, "o");
    object [0][2]= new Checkers2(0, 2, " ");
    object [0][3]= new Checkers2(0, 3, "o");
    object [0][4]= new Checkers2(0, 4, " ");
    object [0][5]= new Checkers2(0, 5, "o");
    object [0][6]= new Checkers2(0, 6, " ");
    object [0][7]= new Checkers2(0, 7, "o");
    
    object [1][0]= new Checkers2(1, 0, "o");
    object [1][1]= new Checkers2(1, 1, " ");
    object [1][2]= new Checkers2(1, 2, "o");
    object [1][3]= new Checkers2(1, 3, " ");
    object [1][4]= new Checkers2(1, 4, "o");
    object [1][5]= new Checkers2(1, 5, " ");
    object [1][6]= new Checkers2(1, 6, "o");
    object [1][7]= new Checkers2(1, 7, " ");
    
    object [2][0]= new Checkers2(2, 0, " ");
    object [2][1]= new Checkers2(2, 1, "o");
    object [2][2]= new Checkers2(2, 2, " ");
    object [2][3]= new Checkers2(2, 3, "o");
    object [2][4]= new Checkers2(2, 4, " ");
    object [2][5]= new Checkers2(2, 5, "o");
    object [2][6]= new Checkers2(2, 6, " ");
    object [2][7]= new Checkers2(2, 7, "o");
    
    object [3][0]= new Checkers2(3, 0, " ");
    object [3][1]= new Checkers2(3, 1, " ");
    object [3][2]= new Checkers2(3, 2, " ");
    object [3][3]= new Checkers2(3, 3, " ");
    object [3][4]= new Checkers2(3, 4, " ");
    object [3][5]= new Checkers2(3, 5, " ");
    object [3][6]= new Checkers2(3, 6, " ");
    object [3][7]= new Checkers2(3, 7, " ");
    
    object [4][0]= new Checkers2(4, 0, " ");
    object [4][1]= new Checkers2(4, 1, " ");
    object [4][2]= new Checkers2(4, 2, " ");
    object [4][3]= new Checkers2(4, 3, " ");
    object [4][4]= new Checkers2(4, 4, " ");
    object [4][5]= new Checkers2(4, 5, " ");
    object [4][6]= new Checkers2(4, 6, " ");
    object [4][7]= new Checkers2(4, 7, " ");
     
    object [5][0]= new Checkers2(5, 0, "x");
    object [5][1]= new Checkers2(5, 1, " ");
    object [5][2]= new Checkers2(5, 2, "x");
    object [5][3]= new Checkers2(5, 3, " ");
    object [5][4]= new Checkers2(5, 4, "x");
    object [5][5]= new Checkers2(5, 5, " ");
    object [5][6]= new Checkers2(5, 6, "x");
    object [5][7]= new Checkers2(5, 7, " ");
    
    object [6][0]= new Checkers2(6, 0, " ");
    object [6][1]= new Checkers2(6, 1, "x");
    object [6][2]= new Checkers2(6, 2, " ");
    object [6][3]= new Checkers2(6, 3, "x");
    object [6][4]= new Checkers2(6, 4, " ");
    object [6][5]= new Checkers2(6, 5, "x");
    object [6][6]= new Checkers2(6, 6, " ");
    object [6][7]= new Checkers2(6, 7, "x");
    
    object [7][0]= new Checkers2(7, 0, "x");
    object [7][1]= new Checkers2(7, 1, " ");
    object [7][2]= new Checkers2(7, 2, "x");
    object [7][3]= new Checkers2(7, 3, " ");
    object [7][4]= new Checkers2(7, 4, "x");
    object [7][5]= new Checkers2(7, 5, " ");
    object [7][6]= new Checkers2(7, 6, "x");
    object [7][7]= new Checkers2(7, 7, " ");
    printBoard(object);
    Player1Input(object, playerCounter, p1counter, p2counter,ptsleft,xleft,oleft);
  }
 public static  void Player1Input(Checkers2 [][] object, int playerCounter, int p1counter, int p2counter,int ptsleft, int xleft, int oleft
)
 {
   Scanner input= new Scanner(System.in);
    //Tell player1 to enter where they want to move
    System.out.println("Which row is the piece you want to move , player 1?");
    int row= input.nextInt();
    System.out.println("Which column is the piece you want to move , player 1?");
    int column= input.nextInt();
    System.out.println("Which row do you want to move to, player 1?");
    int newRow= input.nextInt();
    System.out.println("Which column do you want to move to, player 1?");
    int newColumn= input.nextInt();
    p1move(row, column, newRow, newColumn, object, playerCounter, p1counter, p2counter,ptsleft,xleft,oleft);
    printBoard(object);
 }
 public static  void Player2Input(Checkers2 [][] object, int playerCounter, int p1counter, int p2counter, int ptsleft, int xleft, int oleft)
 {
   Scanner input= new Scanner(System.in);
    //Tell player2 to enter where they want to move
    System.out.println("Which row is the piece you want to move , player 2?");
    int row= input.nextInt();
    System.out.println("Which column is the piece you want to move , player 2?");
    int column= input.nextInt();
    System.out.println("Which row do you want to move to, player 2?");
    int newRow= input.nextInt();
    System.out.println("Which column do you want to move to, player 2?");
    int newColumn= input.nextInt();
    p2move(row, column, newRow, newColumn, object, playerCounter, p1counter, p2counter,ptsleft,xleft,oleft);
    printBoard(object);
 }
 public static void p1move(int r, int c, int nr, int nc, Checkers2 [][] object, int playerCounter, int p1counter, int p2counter, int ptsleft, int xleft, int oleft)
  {
   Scanner input= new Scanner(System.in);
   //if they are moving an x piece
   if((object[r][c].getValue()).equals("x"))
   {
     //if they are moving in a diagonal
     if (r-1==nr&&(c+1==nc||c-1==nc))
     {
       //if the spot they choose is blank
       if ((object[nr][nc].getValue()).equals(" "))
       {
         //switchSet their piece and the blank spot 
         switchSet(r, c, nr, nc, object);
         //if where they are moving makes them a king
         if (object[nr][nc].getRow()==0)
         {
           object[nr][nc].setValue("X");
         }
       }
     }
     //if they are moving across another piece
     else if (r-2==nr&&(c+2==nc||c-2==nc))
     {
       //if where they want to move is blank
       if ((object[nr][nc].getValue()).equals(" "))
       {
         //if the piece in between is an o piece
         if (r>0&&c>0)
         {
         if ((object[(r-1)][(c-1)].getValue()).equals("o")||(object[(r-1)][(c-1)].getValue()).equals("O"))
         {
           //set the piece in between as blank and add a point
           object[(r-1)][(c-1)].setValue(" "); 
           //switchSet their piece and the blank spot
           switchSet( r, c, nr, nc, object);
           //if where they want to move makes them a king
           if (object[nr][nc].getRow()==0)
           {
             object[nr][nc].setValue("X");
           }
           p1counter++;
           oleft--;
           //check whether they can jump again 
           jumpAgain( r, c, nr, nc, object, oleft, xleft);
         }
         }
         if(r>0&&c<7)
         {
         //another way they could move over a piece
         if ((object[(r-1)][(c+1)].getValue()).equals("o")||(object[(r-1)][(c+1)].getValue()).equals("O"))
         {
           if (object[nr][nc].getRow()==0)
           {
             object[nr][nc].setValue("X");
           }
           object[(r-1)][(c+1)].setValue(" ");
           switchSet( r, c, nr, nc, object);
           p1counter++;
           oleft--;
           jumpAgain( r, c, nr, nc, object, oleft, xleft);
         }
         }
       }
     }
     else 
     {
       System.out.println("Invalid row and/or column");
       Player1Input(object, playerCounter, p1counter, p2counter,ptsleft,xleft,oleft);
     }
   }
   //if they are trying to move a king
   else if ((object[r][c].getValue()).equals("X"))
   {
     //if they are trying to move in a way that is valid for a king
     if ((r-1==nr||r+1==nr)&&(c+1==nc||c-1==nc))
     {
       //if the spot they choose is blank
       if ((object[nr][nc].getValue()).equals(" "))
       {
         //switchSet their piece and the blank spot 
        switchSet( r, c, nr, nc, object);
       }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
     }
     //if they are moving across another piece as a king
     else if ((r-2==nr||r+2==nr)&&(c+2==nc||c-2==nc))
     {
       //if where they want to move is blank
       if ((object[nr][nc].getValue()).equals(" "))
       {
         if(r>0&&c>0)
         {
         //if the piece in between is an o piece
         if ((object[(r-1)][(c-1)].getValue()).equals("o")||(object[(r-1)][(c-1)].getValue()).equals("O"))
         {
           //set the piece in between as blank and add a point
           object[(r-1)][(c-1)].setValue(" "); 
           //switchSet their piece and the blank spot
           switchSet( r, c, nr, nc, object);
           p1counter++;
           oleft--;
           //check whether they can jump again
           jumpAgain( r, c, nr, nc, object, oleft, xleft);
         }
         }
         if(r>0&&c<7)
         {
         if ((object[(r-1)][(c+1)].getValue()).equals("o")||(object[(r-1)][(c+1)].getValue()).equals("O"))
         {
           object[(r-1)][(c+1)].setValue(" ");
           switchSet( r, c, nr, nc, object);
           p1counter++;
           oleft--;
           jumpAgain( r, c, nr, nc, object, oleft, xleft);
         }
         }
         if (r<7&&c<7)
         {
          if((object[(r+1)][(c+1)].getValue()).equals("o")||(object[(r+1)][(c+1)].getValue()).equals("O"))
         {
           object[(r+1)][(c+1)].setValue(" ");
           switchSet( r, c, nr, nc, object);
           p1counter++;
           oleft--;
           jumpAgain( r, c, nr, nc, object, oleft, xleft);
         }  
         }
         if(r<7&&c>0)
         {
          if((object[(r+1)][(c-1)].getValue()).equals("o")||(object[(r+1)][(c-1)].getValue()).equals("O"))
         {
           object[(r+1)][(c-1)].setValue(" ");
           switchSet( r, c, nr, nc, object);
           p1counter++;
           oleft--;
           jumpAgain( r, c, nr, nc, object, oleft, xleft);
         }  
         }
       }
     }
     else 
     {
       System.out.println("Invalid row and/or column");
       Player1Input(object, playerCounter, p1counter, p2counter,ptsleft,xleft,oleft);
     }
   }
   else //if they are making an invalid move
   {
     System.out.println("Invalid row and/or column");
     Player1Input(object, playerCounter, p1counter, p2counter,ptsleft,xleft,oleft);
   }
   playerCounter++;//its player 2's turn
   printBoard(object);
   System.out.println("Player 1 has " + p1counter+ " points.");
   System.out.println("Player 2 has " + p2counter+ " points.");
   endGame( xleft,oleft, ptsleft);
   Player2Input(object, playerCounter, p1counter, p2counter,ptsleft,xleft,oleft);
  }
 public static void p2move(int r, int c, int nr, int nc, Checkers2 [][] object, int playerCounter, int p1counter, int p2counter, int ptsleft, int xleft, int oleft)
 {
   if((object[r][c].getValue()).equals("o"))
   {
     if (r+1==nr&&(c+1==nc||c-1==nc))
     {
       if ((object[nr][nc].getValue()).equals(" "))
       {
        switchSet( r, c, nr, nc, object);
         if (object[nr][nc].getRow()==7)
           {
             object[nr][nc].setValue("O");
           }
       }
     } 
     else if (r+2==nr&&(c+2==nc||c-2==nc))
     {
       if ((object[nr][nc].getValue()).equals(" "))
       {
         if(r<7&&c>0)
         {
         if ((object[(r+1)][(c-1)].getValue()).equals("x")||(object[(r+1)][(c-1)].getValue()).equals("X"))
         {
           object[(r+1)][(c-1)].setValue(" ");
           switchSet( r, c, nr, nc, object);
           if (object[nr][nc].getRow()==7)
           {
             object[nr][nc].setValue("O");
           }
           p2counter++;
           xleft--;
           jumpAgain( r, c, nr, nc, object, oleft, xleft);
         }
         }
         if(r<7&&c<7)
         {
         if ((object[(r+1)][(c+1)].getValue()).equals("x")||(object[(r+1)][(c+1)].getValue()).equals("X"))
         {
           object[(r+1)][(c+1)].setValue(" ");
           switchSet( r, c, nr, nc, object);
           if (object[nr][nc].getRow()==7)
           {
             object[nr][nc].setValue("O");
           }
           p2counter++;
           xleft--;
           jumpAgain( r, c, nr, nc, object, oleft, xleft);
         }
         }
       }
     }
     else 
     {
       System.out.println("Invalid row and/or column");
       Player2Input(object, playerCounter, p1counter, p2counter,ptsleft,xleft,oleft);
     }
   }
   else if ((object[r][c].getValue()).equals("O"))
   {
     if ((r-1==nr||r+1==nr)&&(c+1==nc||c-1==nc))
     {
       //if the spot they choose is blank
       if ((object[nr][nc].getValue()).equals(" "))
       {
         //switchSet their piece and the blank spot 
        switchSet( r, c, nr, nc, object);
       }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
     }
     //if they are moving across another piece
     else if ((r-2==nr||r+2==nr)&&(c+2==nc||c-2==nc))
     {
       //if where they want to move is blank
       if ((object[nr][nc].getValue()).equals(" "))
       {
         if(r>0&&c>0)
         {
         //if the piece in between is an o peice
         if ((object[(r-1)][(c-1)].getValue()).equals("x")||(object[(r-1)][(c-1)].getValue()).equals("X"))
         {
           //set the peice in between as blank and add a point
           object[(r-1)][(c-1)].setValue(" "); 
           //switchSet their piece and the blank spot
           switchSet( r, c, nr, nc, object);
           p2counter++;
           xleft--;
           jumpAgain( r, c, nr, nc, object, oleft, xleft);
         }
         }
         if(r>0&&c<7)
         {
         if ((object[(r-1)][(c+1)].getValue()).equals("x")||(object[(r-1)][(c+1)].getValue()).equals("X"))
         {
           object[(r-1)][(c+1)].setValue(" ");
           switchSet( r, c, nr, nc, object);
           p2counter++;
           xleft--;
           jumpAgain( r, c, nr, nc, object, oleft, xleft);
         }
         }
         if (r<7&&c<7)
         {
          if((object[(r+1)][(c+1)].getValue()).equals("x")||(object[(r+1)][(c+1)].getValue()).equals("X"))
         {
           object[(r+1)][(c+1)].setValue(" ");
           switchSet( r, c, nr, nc, object);
           p2counter++;
           xleft--;
           jumpAgain( r, c, nr, nc, object, oleft, xleft);
         }  
         }
         if(r<7&&c>0)
         {
          if((object[(r+1)][(c-1)].getValue()).equals("x")||(object[(r+1)][(c-1)].getValue()).equals("X"))
         {
           object[(r+1)][(c-1)].setValue(" ");
           switchSet( r, c, nr, nc, object);
           p2counter++;
           xleft--;
           jumpAgain( r, c, nr, nc, object, oleft, xleft);
         }  
         }
       }
     }
   }
     else 
     {
       System.out.println("Invalid row and/or column");
       Player2Input(object, playerCounter, p1counter, p2counter,ptsleft,xleft,oleft);
     }
     playerCounter++; 
     printBoard(object);
     System.out.println("Player 1 has " + p1counter+ " points.");
     System.out.println("Player 2 has " + p2counter+ " points.");
     endGame( xleft,oleft, ptsleft);
     Player1Input(object, playerCounter, p1counter, p2counter,ptsleft,xleft,oleft);
 }
   
 public static void printBoard(Checkers2 [][] object)
 {
   //Print the Board Code 
    for ( int i=0; i<8; i++)
    {
      for (int j=0; j<8; j++)
      {
        System.out.print("_"+object [i][j].getValue()+"_"+"|");
      }
      System.out.println(object[i][0].getRow());
    }
     System.out.println(" 0   1   2   3   4   5   6   7   ");
 }
 public static void endGame(int xleft,int oleft,int ptsleft)
 {
   if (xleft==0)
   {
     System.out.println("Player 2 Wins!!!");
     
   }
   else if (oleft==0) 
   {
     System.out.println("Player 1 Wins!!!");
   }
}
 public static void switchSet(int r, int c, int nr, int nc, Checkers2 [][] object)
 {
     String igposition= object[r][c].getValue(); 
     String fgposition= object[nr][nc].getValue();
     object[r][c].setValue(fgposition);  
     object[nr][nc].setValue(igposition);
 }
public static void jumpAgain(int r, int c, int nr, int nc, Checkers2 [][] object,int oleft,int xleft)
{
  Scanner input=new Scanner(System.in);
  if (object[nr][nc].getValue().equals("x"))
  {
    if (nr>1&& nc>1)
    {
    if (((object[nr-1][nc-1].getValue()).equals("o")||(object[nr-1][nc-1].getValue()).equals("O"))&&((object[nr-2][nc-2].getValue()).equals(" ")))
    {
      System.out.println("Do you want to jump again?");
      String response= input.next();
      if (response.equals("yes"))
      {
        object[nr-1][nc-1].setValue(" ");
        object[nr-2][nc-2].setValue("x");
        object[nr][nc].setValue(" "); 
        oleft--;
      }
      else 
      {
        //dont do anything
      }
    }
    }
    if (nr>1&&nc<6)
    {
    if (((object[nr-1][nc+1].getValue()).equals("o")||(object[nr-1][nc+1].getValue()).equals("O"))&&((object[nr-2][nc+2].getValue()).equals(" ")))
    {
      System.out.println("Do you want to jump again?");
      String response= input.next();
      if (response.equals("yes"))
      {
        object[nr-1][nc+1].setValue(" ");
        object[nr-2][nc+2].setValue("x");
        object[nr][nc].setValue(" "); 
           oleft--;
      }
      else 
      {
         //dont do anything
      }
    }
    }
  }
  else if (object[nr][nc].getValue().equals("o"))
  {
    if (nr<6&&nc>1)
    {
     if (((object[nr+1][nc-1].getValue()).equals("x")||(object[nr+1][nc-1].getValue()).equals("X"))&&((object[nr+2][nc-2].getValue()).equals(" ")))
    {
      System.out.println("Do you want to jump again?");
      String response= input.next();
      if (response.equals("yes"))
      {
        object[nr+1][nc-1].setValue(" ");
        object[nr+2][nc-2].setValue("o");
        object[nr][nc].setValue(" "); 
        xleft--;
      }
      else 
      {
        //dont do anything
      }
    }
    }
    if (nr<6&&nc<6)
    {
    if (((object[nr+1][nc+1].getValue()).equals("x")||(object[nr+1][nc+1].getValue()).equals("X"))&&((object[nr+2][nc+2].getValue()).equals(" ")))
    {
      System.out.println("Do you want to jump again?");
      String response= input.next();
      if (response.equals("yes"))
      {
        object[nr+1][nc+1].setValue(" ");
        object[nr+2][nc+2].setValue("o");
        object[nr][nc].setValue(" "); 
        xleft--;
      }
      else 
      {
         //dont do anything
      }
    }
    }
  }
  else if (object[nr][nc].getValue().equals("X"))
  {
    if (nr>1&&nc>1)
    {
    if (((object[nr-1][nc-1].getValue()).equals("o")||(object[nr-1][nc-1].getValue()).equals("O"))&&((object[nr-2][nc-2].getValue()).equals(" ")))
    {
      System.out.println("Do you want to jump again?");
      String response= input.next();
      if (response.equals("yes"))
      {
        object[nr-1][nc-1].setValue(" ");
        object[nr-2][nc-2].setValue("X");
        object[nr][nc].setValue(" ");
        oleft--; 
      }
      else 
      {
        //dont do anything
      }
    }
    }
    if (nr>1&&nc<6)
    {
    if (((object[nr-1][nc+1].getValue()).equals("o")||(object[nr-1][nc+1].getValue()).equals("O"))&&((object[nr-2][nc+2].getValue()).equals(" ")))
    {
      System.out.println("Do you want to jump again?");
      String response= input.next();
      if (response.equals("yes"))
      {
        object[nr-1][nc+1].setValue(" ");
        object[nr-2][nc+2].setValue("X");
        object[nr][nc].setValue(" "); 
        oleft--;
      }
      else 
      {
         //dont do anything
      }
    }
    }
    if (nr>1&&nc<6)
    {
    if (((object[nr+1][nc+1].getValue()).equals("o")||(object[nr+1][nc+1].getValue()).equals("O"))&&((object[nr+2][nc+2].getValue()).equals(" ")))
    {
       System.out.println("Do you want to jump again?");
      String response= input.next();
      if (response.equals("yes"))
      {
        object[nr+1][nc+1].setValue(" ");
        object[nr+2][nc+2].setValue("X");
        object[nr][nc].setValue(" "); 
        oleft--;
      }
      else 
      {
         //dont do anything
      }
    }
    }
    if (nr>1&&nc<6)
    {
    if (((object[nr+1][nc-1].getValue()).equals("o")||(object[nr+1][nc-1].getValue()).equals("O"))&&((object[nr+2][nc-2].getValue()).equals(" ")))
    {
       System.out.println("Do you want to jump again?");
      String response= input.next();
      if (response.equals("yes"))
      {
        object[nr+1][nc-1].setValue(" ");
        object[nr+2][nc-2].setValue("X");
        object[nr][nc].setValue(" "); 
        oleft--;
      }
      else 
      {
         //dont do anything
      }
    }
    }
  }
  else if (object[nr][nc].getValue().equals("O"))
  {
    if(nr>1&&nc>1)
    {
    if ((object[nr-1][nc-1].getValue()).equals("x")||(object[nr-1][nc-1].getValue()).equals("X")&&((object[nr-2][nc-2].getValue()).equals(" ")))
    {
      System.out.println("Do you want to jump again?");
      String response= input.next();
      if (response.equals("yes"))
      {
        object[nr-1][nc-1].setValue(" ");
        object[nr-2][nc-2].setValue("O");
        object[nr][nc].setValue(" "); 
        xleft--;
      }
      else 
      {
        //dont do anything
      }
    }
    }
    if(nr>1&&nc<6)
    {
    if (((object[nr-1][nc+1].getValue()).equals("x")||(object[nr-1][nc+1].getValue()).equals("X"))&&((object[nr-2][nc+2].getValue()).equals(" ")))
    {
      System.out.println("Do you want to jump again?");
      String response= input.next();
      if (response.equals("yes"))
      {
        object[nr-1][nc+1].setValue(" ");
        object[nr-2][nc+2].setValue("O");
        object[nr][nc].setValue(" "); 
        xleft--;
      }
      else 
      {
         //dont do anything
      }
    }
    }
    if(nr>1&&nc<6)
    {
    if (((object[nr+1][nc+1].getValue()).equals("x")||(object[nr+1][nc+1].getValue()).equals("X"))&&((object[nr+2][nc+2].getValue()).equals(" ")))
    {
       System.out.println("Do you want to jump again?");
      String response= input.next();
      if (response.equals("yes"))
      {
        object[nr+1][nc+1].setValue(" ");
        object[nr+2][nc+2].setValue("O");
        object[nr][nc].setValue(" ");
        xleft--; 
      }
      else 
      {
         //dont do anything
      }
    }
    }
    if(nr>1&&nc<6)
    {
    if (((object[nr+1][nc-1].getValue()).equals("x")||(object[nr+1][nc-1].getValue()).equals("X"))&&((object[nr+2][nc-2].getValue()).equals(" ")))
    {
       System.out.println("Do you want to jump again?");
      String response= input.next();
      if (response.equals("yes"))
      {
        object[nr+1][nc-1].setValue(" ");
        object[nr+2][nc-2].setValue("O");
        object[nr][nc].setValue(" "); 
        xleft--;
      }
      else 
      {
         //dont do anything
      }
    }
    }
  }
}
}
  
                
                
                
                
