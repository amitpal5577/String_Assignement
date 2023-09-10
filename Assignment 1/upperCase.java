import java.util.Scanner;

public class upperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");

        String S1 = sc.next();
        StringBuilder S2 = new StringBuilder();


        for (int i = 0; i < S1.length(); i++) {
            if ((S1.charAt(i) >= 'a') && (S1.charAt(i) <= 'z')) {
                S2.append((char) (S1.charAt(i) - 32));

            } else if ((S1.charAt(i) >= 'A') && (S1.charAt(i) <= 'Z')) {
                S2.append( (char)(S1.charAt(i) + 32));

            }

        }
        System.out.println(S2);

        sc.close();

    }
}
