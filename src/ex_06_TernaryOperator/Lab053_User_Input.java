package ex_06_TernaryOperator;

import java.lang.ref.Reference;

public class Lab053_User_Input {
    public static void main(String[] args) {

        String user_input=args[2];
        System.out.println(user_input);
        System.out.println(user_input instanceof String);

        int age=Integer.parseInt(user_input);

        String result= (age<18) ? "Minor" : (age<65) ? "Adult" : "Senior Citizen";
        System.out.println(result);


    }
}
