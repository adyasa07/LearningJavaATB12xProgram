package ex_06_TernaryOperator;

public class Lab052_Three_Max {

    public static void main(String[] args) {

        int a=10;
        int b=20;
        int c=5;

        int max=(a>b) ?(a>c) ? a:c :(b>c) ? b : c ;
        System.out.println(max);
    }
}
