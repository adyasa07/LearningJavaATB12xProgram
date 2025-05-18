package ex_01_JavaBasics;

public class Lab008_Multiple_Main {

    public static void main(String[] args) { //----> This is the only main method recognised by compiler
        System.out.println("This is the only main method recognised by compiler");
    }

    public static void main(String args) {

        //System.out.println("This is a main method that allow String as arguments");

    }

    public static void main(int args) {
       // System.out.println("This is a main method that allow int as arguments");

    }
    // Java allows multiple main methods
    // parameters have to be different
    // This is called main method overloading
}
