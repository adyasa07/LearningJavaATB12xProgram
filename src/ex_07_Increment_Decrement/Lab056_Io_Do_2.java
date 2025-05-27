package ex_07_Increment_Decrement;

public class Lab056_Io_Do_2 {

    public static void main(String[] args) {

        //POST increment----> print first and then increase

        int a_post=10;
        int b = a_post++;

        System.out.println(a_post);
        System.out.println(b);

        //ERT (Expression Result Table)
        //Line No| a_post | b
        //9      | 10     |NA
        //10     | 11     |10
        //12     | 11     |NA
        //13     | 11     |10

        int n_post = 12;
        System.out.println(n_post++); //12
        System.out.println(n_post);//13

    }
}
