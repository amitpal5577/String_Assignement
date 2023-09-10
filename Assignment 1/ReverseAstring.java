import java.util.Scanner;

public class ReverseAstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String a = sc.nextLine();

        String b = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            b += (a.charAt(i));
        }

        System.out.println(b);

        /// or we can use

        StringBuilder n = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i--) {
            n.append(a.charAt(i));
        }
        System.out.println("this is mutable stirng : ");

        System.out.println(n);

        sc.close();
    }
}