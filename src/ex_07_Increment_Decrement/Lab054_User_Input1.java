package ex_07_Increment_Decrement;

public class Lab054_User_Input1 {

    public static void main(String[] args) {

        String string_one= args[0];
        String string_two=args[1];

        System.out.println(string_one);
        System.out.println(string_two);

        int a=Integer.parseInt(string_one);

        System.out.println(a);
//        int b=Integer.parseInt(string_two);
//        System.out.println(b); ------>NumberFormatException

        float b=Float.parseFloat(string_two);
        System.out.println(b);

//        String string_four=args[3];
//        System.out.println(string_four);----->ArrayIndexOutOfBoundsException

    }
}
