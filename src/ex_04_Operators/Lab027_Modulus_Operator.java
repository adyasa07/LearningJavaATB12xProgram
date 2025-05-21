package ex_04_Operators;

import java.util.Scanner;

public class Lab027_Modulus_Operator {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in) ;

        int a=sc.nextInt();
        int b= sc.nextInt();
        System.out.println(a%b);
        sc.close();

    }
}
