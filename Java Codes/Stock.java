import java.util.*;
public abstract class Stock
{
  String item;
  int qty;
  int rate;
  int amt;
  Stock(String s,int q,int r,int a)
  {
    item=s;
    qty=q;
    rate=r;
    amt=a;
  }
  abstract void display();
}