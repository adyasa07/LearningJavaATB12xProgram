package ex_02_JavaBasics2;

public class Lab019_Local_Variable {

    public static void main(String[] args) {

//        int a;
//       System.out.println(a);
// Variable 'a' might not have been initialized
        //Default of int is 0 but Default value of the Local variable is not assigned by the JVM.
        int a = 10;
        byte b = 10;
        short s = 10;
        long l = 9876543210L;
        float f = 3.14F;
        double d = 67.8987654567;
        boolean b1 = true;
        char c = 'A';
        System.out.println(c);
        //-  Local variable must be initialised before using.

    }
}
