package ex_06_TernaryOperator;

import java.util.Scanner;

public class Lab049_Interview {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int age=sc.nextInt();
        String permission= (age>18) ? (age>25 ? "Legal drinking age" : "Illegal drinking age") :"You can't go to Goa";
        System.out.println(permission);
    }
}
