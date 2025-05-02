package finalPackage;

public class FinalClass {


    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    /********** final keyword ************/
    // final variable - constant value
    final int a = 10;
    // a = 8; //error

    //final method - cannot be overridden
    final void displayStat() {
        System.out.println("abc");
    }

}

//final class cannot be inherited
final class B {}

//class C extends B {} // error