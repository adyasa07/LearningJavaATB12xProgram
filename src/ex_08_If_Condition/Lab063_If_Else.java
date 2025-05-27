package ex_08_If_Condition;

public class Lab063_If_Else {
    public static void main(String[] args) {

        int age =Integer.parseInt(args[3]);

        if(age>18){

            System.out.println("You Can Vote!!");
        }
        else{

            System.out.println("You Can't Vote");
        }

    }
}
