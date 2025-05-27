package tasks;

import java.util.Scanner;

public class Task_19th_May {
    public static void main(String[] args) {

     //n1,n2,n3
        //if n1=n2=n3---->equilateral
        //if n1=n2 or n2=n3 or n1=n3 ----> scalene
        //else scalene

        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        
       if (n1+n2 >n3 && n2+n3 >n1 && n1+n3 >n2){ //checking if valid triangle

           if (n1==n2 && n2==n3){

               System.out.println("Equilateral Triangle");

           } else if (n1==n2 || n2==n3 || n1==n3 ) {
               System.out.println("Isosceles Triangle");
           }
           else {

               System.out.println("Scalene Triangle");
           }
       }
       else{

           System.out.println("Invalid Triangle - sides do not follow triangle inequality");
       }
       sc.close();
    }
}
