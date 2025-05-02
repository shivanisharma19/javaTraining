package String;

public class StringClass {
    /**************** Static ****************/

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        for (String s : args)
            System.out.println(s);
        StringClass m2 = new StringClass();
        m2.string();

    }

    void string() {

        /******************* String - immutable *******************/
        //  vs StringBuffer - mutable vs StringBuilder - mutable

        String s1 = new String("abc"); //create new object every time
        String s2 = new String("abc"); //create new object every time
        String s3 = "xyz";
        /*create object in String pool
         - also called string literals
         - String interning*/
        String s4 = "xyz"; //reuse the same object & s2 and s3 will point to same object

    //compareTo method

        String str1 = new String("xyx");
        String str2 = new String("abc");

        System.out.println(str1.compareTo(str2));

        /* return ascii vale difference of x and a - can be negative/positive
         if 'ayz' and 'abc' -> ascii difference of y and b
         if 'abz' and 'abc' -> ascii difference of z and c
         if 'abc' and 'abcde' -> difference of length - can be negative/positive
         */

    }
}





