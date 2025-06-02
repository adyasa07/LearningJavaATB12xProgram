package ex_09_Switch;

public class Lab078_JDK13Above1 {
    public static void main(String[] args) {

        int itemCode =006;
        switch (itemCode){

            case 001, 002, 005 :

                System.out.println("Electronic Gadget");
                break;
            case 004,006,007:
                System.out.println("Mechanical");
                break;
            default:
                System.out.println("None");
        }
    }
}
