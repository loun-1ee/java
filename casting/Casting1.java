package casting;

public class Casting1 {
    static void main(String[] args) {
        int intvalue = 10;
        long longvalue;
        double doublevalue;

        longvalue = intvalue;
        System.out.println("longvalue = " + longvalue);

        doublevalue = intvalue;
        System.out.println("doublevalue = " + doublevalue);

        doublevalue = 20L; //long -> double
        System.out.println("doublevalue2 = " + doublevalue);
    }

}
