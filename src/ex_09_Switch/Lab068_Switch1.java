package ex_09_Switch;

import java.util.Scanner;

public class Lab068_Switch1 {
    public static void main(String[] args) {

        System.out.println("Enter a number from 1 to 7 to know which is it");
        Scanner sc=new Scanner(System.in);

        if(sc.hasNextInt()){

            int day= sc.nextInt();

            switch (day){

                case 1:
                    System.out.println("Monday");
                    break;

                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4 :
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println(" Enter a number from 1 to 7 only.");

            }

        }else{

            System.out.println("Invalid! Enter numeric value");
        }




    }
}
