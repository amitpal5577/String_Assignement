// 6Q Write a program to check if the letter 'e' is present in the word 'Umbrella'
public class letter {
    public static void main(String[] args) {

        boolean present = false;
        int index = 0;

        String str = "Umbrella";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                present = true;
                index = i;

            }
        }

        if (present) {
            System.out.println("letter 'e ' is   present in given string  and the index is : "+index);

        } else {

            System.out.println("letter 'e ' is  not present in given string ");
        }

    }
}
