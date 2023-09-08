import java.util.Scanner;
public class Dateable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("This is the dateable program - Please type in your age as a number:");
        int age = scanner.nextInt();
        int age1 = age/2;
        int dateage = age1+7;
        System.out.println(age + " - year olds should date someone who is " + dateage + ".");
    }
}
