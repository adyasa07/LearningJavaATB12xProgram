package ex_06_TernaryOperator;

import java.util.Scanner;

public class Lab048_TernaryOperator1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();

        String result= number>0 ? "positive" : "negative";
        System.out.println(result);
    }

}
