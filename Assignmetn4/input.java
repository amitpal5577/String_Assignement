import java.util.Scanner;

// Q1 Write a simple String program to take input from user
public class input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string or word");

         String str = sc.nextLine();
         System.out.println(str);
        sc.close();
    }
}