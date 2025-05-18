package ex_02_JavaBasics2;

public class Lab017_PrintF {

    public static void main(String[] args) {
        int a=10;
        int b=20;

        System.out.println("The required variable is " +a);

        System.out.printf("The required variable is %d\n",a);
        System.out.printf("Variable: %d",a);
        System.out.println();

        System.out.printf("value of a is %d , value of b is %d\n" ,a,b);
        System.out.printf("a= %d, b= %d",a,b);

        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean
    }
}
