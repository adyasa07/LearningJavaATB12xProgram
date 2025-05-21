package ex_04_Operators;

public class Lab028_Relational_Operator {

    public static void main(String[] args) {
        // < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to (but checking)
        // != -> Not equal

        // All of them will result boolean output.

        int a = 10;
        int b = 30;
        boolean c = a > b; // // 10> 30
        System.out.println(c);

        int age_Adyasa = 25;
        int age_Nirjasa = 31;

        boolean result = age_Nirjasa >= age_Adyasa;
        System.out.println(result);


    }
}
