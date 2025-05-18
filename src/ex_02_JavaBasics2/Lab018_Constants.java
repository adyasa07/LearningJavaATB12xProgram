package ex_02_JavaBasics2;

public class Lab018_Constants {

    public static void main(String[] args) {
        int a=10;
        a=20;

        System.out.println("New value of a is:" +a);

        final int b=99;
      //  b=100; --->Cannot assign a value to final variable 'b'

        System.out.println(b);

        final float pi=3.14f;
        // pi value is constant
        final float g=9.8f;
        // g --> acceleration due to gravity near earth's surface = 9.8 m/s^2

        System.out.println(pi);
        System.out.println(g);
    }
}
