package ex_04_Operators;

public class Lab035_All_Operators {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);

        // Arithmetic Operators
        // +,-,%,/,*

        // Compound Assignment Operators
        int age = 10;
        age += 10;   // age = age+10
        System.out.println(age);
        age /=5; // age = age/10
        System.out.println(age);
    }
}
