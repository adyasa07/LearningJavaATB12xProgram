package tasks;

public class Task2_17th_May {
    public static void main(String[] args) {

        int n1=22;
        int n2=66;
        int n3=1;

        int max=(n1>n2) ?(n1>n3) ? n1 : n3  :  (n2>n3) ?n2 : n3;
        System.out.println(max);
    }
}
