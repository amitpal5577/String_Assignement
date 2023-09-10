
public class deom {

    public static void main(String[] args) {

        String str = "Hello world How are you";
       String str2=  str.subSequence(0, 4) + str.substring(5,str.length());
       System.out.println(str2);

    }
}
