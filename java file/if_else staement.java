import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
      int a;
	System.out.println ("Hello World");
	Scanner n = new Scanner (System.in);
	  System.out.println ("enter the no :");
	 a = n.nextInt();
	if ( a >= 20)
	  {
		System.out.println ("no is less");
	  }
	else
	  {
		System.out.println ("no is greater");
	  }
  }
}
