import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  word");
        String a = sc.next();
        boolean ispalindrome   = true; 

        for(int i = 0; i<a.length()-1;i++){
            if (a.charAt(i)!= a.charAt(a.length()-1-i)){
                ispalindrome = false;
                break;
                
            }

        }

        if(ispalindrome){

            System.out.println("the given string is palindrome ");
        }else{
            System.out.println("the given string is not  palindrome ");

        }

        sc.close();
    }
}