class MidNumber{
 public static int MidOfThree(int a,int b,int c)
{
  if((a<b && b<c)|| (c<b && b<a))
  return b;
  else if((b<a && a<c)||(c<a && a<b))
  return a;
  else
  return c;
}
public static void main(String[]args)
{ 
  int a=20,b=40,c=30;
  System.out.println(MidOfThree(a,b,c));
}
}