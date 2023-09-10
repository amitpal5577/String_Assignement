public class reverse {
    public static void main(String[] args) {
        String str = "PWSKILL";


        StringBuilder str2 = new StringBuilder();
        String str1= "";
        for (int i = str.length() - 1; i > 0; i--) {
            str2.append(str.charAt(i));
            str1 += str.charAt(i);
        }
        System.out.println(str2);
        System.out.println(str1);
    }
}
