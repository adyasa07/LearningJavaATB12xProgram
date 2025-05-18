package ex_02_JavaBasics2;

public class Lab012_Variables_Naming {

    public static void main(String[] args) {

       // int _ =65; -->Unnamed patterns and variables are not supported at language level '21'

//        _ is Not Allowed (from Java 9 onwards)
//        In Java 9 and later, using _ (just a single underscore) as a variable name is not allowed, and it gives a compile-time error. This change was introduced to reserve _ as a keyword for possible future use.
        int $ =44;
        int __=10;
        int year=2025;

        System.out.println($);
        System.out.println(__);
        System.out.println(year);




    }
}
