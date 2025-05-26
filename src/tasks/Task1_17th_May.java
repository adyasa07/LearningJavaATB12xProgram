package tasks;

import java.util.Scanner;

public class Task1_17th_May {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();

        String result= (num%2==0) ? "even" : "odd" ;
        System.out.println(result);
    }
}
