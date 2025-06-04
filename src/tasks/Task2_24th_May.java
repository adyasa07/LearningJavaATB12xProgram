package tasks;

import java.util.Scanner;

public class Task2_24th_May {

    /*If the year is divisible by 4, it checks if it's a century year (divisible by 100).
    If it is divisible by 100, the program checks if the year is divisible by 400. If true, it prints "Leap Year";
     otherwise, it is "Not a Leap Year".
    If the year is not divisible by 100 but by 4, it prints "Leap Year"
    */


    //if year%4==0{
    // if year % 100 ==0 {
    // if year%400==0---->leap year
    // }
    // }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year :");

    if (sc.hasNext()){

    int year = sc.nextInt();
    System.out.println("Enter a number from 1 to 12");
    int month=sc.nextInt();

    switch (month){

        case 1,3,5,7,8,10,12 :
            System.out.println("Number of days : 31");
            break;
        case 2:
            if((year%4 == 0 && year%100 !=0) || year%400==0){
                System.out.println("Number of days : 29 ");
            }
            else{
                System.out.println("Number of days : 28");
            }
            break;
        case 4,6,9,11 :
            System.out.println("Number of days : 30");
            break;
        default:
            System.out.println("Enter a number from 1 to 12 only");


    }

}
    else {
        System.out.println("Enter a valid input.");
    }


        }
        }


