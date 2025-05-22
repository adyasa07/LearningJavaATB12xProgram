package ex_06_TernaryOperator;

import java.util.Scanner;

public class Lab051_Even_Odd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        String result = (num % 2 == 0) ? (num>0 ? "positive even" : "negative even") : "odd";
        System.out.println(result);

    }
}
