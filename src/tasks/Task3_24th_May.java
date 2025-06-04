package tasks;

import java.util.Scanner;

public class Task3_24th_May {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;

        for (int i=1; i<=n;i++){

            fact=fact*i;
        }
        System.out.println(fact);
    }
}
