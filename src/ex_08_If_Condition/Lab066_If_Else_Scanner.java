package ex_08_If_Condition;

import java.util.Scanner;

public class Lab066_If_Else_Scanner {
    public static void main(String[] args) {

        System.out.println("Enter your age :");
        Scanner sc=new Scanner(System.in);


        if(sc.hasNextInt()){ //Edge case for checking non-numeric input
            int age = sc.nextInt();

            if(age<0){ //Edge case for negative age

                System.out.println("Invalid age entered. Age cannot be negative ");
            }
            else if (age>=18){

                System.out.println("Eligible to vote");
            }else{

                System.out.println("Not Eligible to vote");
            }
        }else{
            System.out.println("Invalid input. Please enter a valid number.");
        }
        /*
        *  Empty Input
Issue: If user just presses enter, nextInt() will throw an exception.

Handling: This is harder to catch with nextInt(). It's better to use nextLine() and then parse the input:

java
Copy code
System.out.println("Enter your age:");
String input = sc.nextLine();

try {
    int age = Integer.parseInt(input);
    // add further logic here
} catch (NumberFormatException e) {
    System.out.println("Invalid input. Please enter a valid number.");
}
        * */


    }
}
