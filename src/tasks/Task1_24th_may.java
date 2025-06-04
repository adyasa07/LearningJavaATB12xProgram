package tasks;

import java.util.Scanner;

public class Task1_24th_may {
    public static void main(String[] args) {

        System.out.println("Enter your grade :");
        Scanner sc=new Scanner(System.in);

        if(sc.hasNext()){

            char grade=sc.next().toUpperCase().charAt(0);

            switch (grade){

                case 'A':
                    System.out.println("Excellent");
                    break;
                case 'B':
                    System.out.println("Very Good");
                    break;
                case 'C':
                    System.out.println("Good");
                    break;
                case 'D' :
                    System.out.println("Needs Improvement");
                    break;
                case 'F':
                    System.out.println("Fail");
                    break;
                 default:
                    System.out.println("Invalid grade");
            }

        }
        else {
            System.out.println("Please give a valid grade as input.");
        }

    }
}





/*
* sc.next() reads the next token (a word or a character string).

toUpperCase() ensures the grade check is case-insensitive (so 'a' and 'A' both work).

charAt(0) fetches the first character of the input.

Added sc.close() to close the scanner and free resources.*/
