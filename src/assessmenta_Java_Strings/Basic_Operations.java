package assessmenta_Java_Strings;

public class Basic_Operations {
    public static void main(String[] args) {
        String input="Hello";
        input=input.concat(" World");
        System.out.println(input);

        int length=input.length();
        System.out.println(length);

        char firstChar=input.charAt(0);
        System.out.println(firstChar);

        String sub=input.substring(6);
        System.out.println(sub);

    }
}
