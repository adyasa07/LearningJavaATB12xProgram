package ex_02_Literals;

public class Lab023_Char_Literal {
    public static void main(String[] args) {
        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
//        char c = "A"; // "" == String = Bunch of Char

        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("AdyasaNayak");
        System.out.println("Adyasa"+new_line+"Nayak");
        System.out.println("Adyasa\nNayak");
        System.out.println("Adyasa"+tab_line+"Nayak");
        System.out.println("Adyasa"+back_space+"Nayak");
        System.out.println( " ----- ");

        System.out.println("Adyasa is "+carriage_return+"Nayak");

        System.out.println("Hi, This is the First line"+new_line+"This is second line\n This is Third line");

        char rupees = '₹';
        System.out.println(rupees);

        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char c11  = '\u1F60';
    }
}
