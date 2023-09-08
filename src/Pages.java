import java.util.Scanner;
public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To determine the pages you should read, insert your age as a number: ");
        int age = scanner.nextInt();
        int pageRead = 100 - age;
        System.out.println("The pages that a " +age+ " should read before giving up a book is " +pageRead+ ".");
    }
}

//Pages
//There is a folk rule stating the number of pages you should read before giving up on a book is 100 - your age. For example, a 21 year old needs to read 79 pages ( 100 - 21 ). Write a program that stores your age as an integer in a variable named age. The program then computes and displays the minimal number of pages to read.
//
//A sample run could be:
//
//Prompt + input: Enter your age: 18
//
//Output: 18-year olds should read at least 82 pages before giving up on a book.
//
//Another sample program run could be:
//
//Prompt + input : Enter your age: 30
//
//Output: 30-year olds should read at least 70 pages before giving up on a book.
//
//Credit: Thanks to Jim Cohoon at The University of Virginia