package ex_05_TypeCasting;

public class Lab046_TypeCasting3 {
    public static void main(String[] args) {
        int course=100;
        float gst=18.45f;

        //int total=course+gst;
        int total= course + (int)gst;

        System.out.println(total);//data loss ---->narrowing(Explicit)

        float total1=course+gst;//Implicit Widening
        float total2=(float)course+gst;//Explicit Widening ----> Optional

        System.out.println(total1);
        System.out.println(total2);

    }
}
