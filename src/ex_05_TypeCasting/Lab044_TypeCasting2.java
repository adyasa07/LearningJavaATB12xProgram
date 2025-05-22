package ex_05_TypeCasting;

public class Lab044_TypeCasting2 {

    public static void main(String[] args) {
        int val=300;
       // byte b=val;//Required type: byte , Provided:int

        byte b1=(byte)val;
        System.out.println(b1);

        //Narrowing Casting (Explicit):Also known as manual type casting, this happens when a larger data type is converted to a smaller data type.
        //Example: double -> float -> long -> int -> short -> byte


    }
}
