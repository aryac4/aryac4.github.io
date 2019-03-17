import java.util.Scanner;
public class planner {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Type in your first task for the day: " );
    String text = input.nextLine();
    System.out.print("Type in your second task for the day: " );
    String secondtext = input.nextLine();
    System.out.print("Type in your third task for the day: " );
    String thirdtext = input.nextLine();
    System.out.print("Your Tasks For Today: " 
    + text +" "+  secondtext + " " + thirdtext + ". ");
  
    System.out.print(" How much time will your first task take? " );
    String text1 = input.nextLine();
    System.out.print("How much time will your second task take? " );
    String secondtext1 = input.nextLine();
    System.out.print("How much time will your third task take? " );
    String thirdtext1 = input.nextLine();
    System.out.print(text + " should take " + text1 + ". ");
    System.out.print(secondtext + " should take " + secondtext1 + ". ");
    System.out.print(thirdtext + " should take " + thirdtext1 + ". ");
}
    }
