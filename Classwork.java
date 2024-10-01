import java.util.Scanner;

public class Classwork
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("What are you buying?");
    String item = sc.nextLine();
    System.out.println("How many of it?");
    int amount = sc.nextInt();
    System.out.println("How much does it weigh?");
    double weight = sc.nextDouble();
    System.out.println("You're buying " + amount + " " + item + ", each weighing " + weight + " pounds.");

    System.out.println("\"That brain of mine is something more than merely mortal; as time will show.\"");
    System.out.println("Ada Lovelace\nThe first computer programmer");

    System.out.println("(\\(\\\n( - -)\n((') (')");
    
  }
}
