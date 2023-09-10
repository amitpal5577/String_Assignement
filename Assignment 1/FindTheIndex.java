import java.util.Scanner;

public class FindTheIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String word = "Hello world ";
            int index = word.indexOf("l");
            System.out.println(index);


        sc.close();
    }
}
