import java.util.Scanner;
class userio
{
static Scanner s=new Scanner(System.in);
public static void main(String[]Args)
 {
   System.out.println("Enter your Name: ");
   String name=s.nextLine();
   System.out.println("Entered Name is: "+name);
   s.close();
  }
}