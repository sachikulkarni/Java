/* Sachi Kulkarni
 * 12/14/16
 * Period 4*/
import java.util.*;
public class Checkers2
{
  int row;
  int column;
  String value;
 
public Checkers2( int r, int c, String v)
{
  row = r;
  column = c;
  value = v;
}

public int getRow()
{
  return row;
}
public int getColumn()
{
  return column;
}
public String getValue()
{
  return value;
}
public void setRow(int r)
{
  row= r;
}
public void setColumn(int c)
{
  column = c;
}
public void setValue(String v)
{
  value= v;
}

}