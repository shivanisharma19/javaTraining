
public class Main {
    /**************** Static ****************/
    static {
        System.out.println("Static block 1");
        display();
    }


    public static void main(String[] args) {
        System.out.println("Hello, World!");
        for (String s : args)
            System.out.println(s);
        Main m2 = new Main();
        m2.array();
        m2.string();


        //interfaces with same method
        H h = new H();
        h.print();
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

    /*************** Array ********************/
    void array() {

        int[][] newArr = new int[][]{{11, 12}, {13}, {4, 5, 7}};
        int[][] newArr1 = new int[2][];
        newArr1[0] = new int[]{11, 12};
        newArr1[1] = new int[]{13};

        for(int[] row: newArr) {
            System.out.println();
            for(int col:row) {
                System.out.print(col+", ");
            }
        }

    }

    /********** final keyword ************/
    // final variable - constant value
    final int a = 10;
    // a = 8; //error

    //final method - cannot be overridden
    final void displayStat() {
        System.out.println("abc");
    }

    void print() {
        System.out.println("print");
    }

    static void display(){
        System.out.println("Static block 3 - display");
    }

    static {
        Main m1 = new Main();
        m1.print();
        System.out.println("Static block 2");
    }
}

//final class cannot be inherited
final class B {}

//class C extends B {} // error



/******** abstract ************/
abstract class C {} //no object can be created of this

abstract class D {      //if class has one abstract method then class mandatorily should be abstract
    abstract void display();
    void print() { }
}

class E extends  D {
     void display() {} //Class 'E' must either be declared abstract or implement abstract method 'display()'
}


/****************** interface ********************/
class F {
    int num; // access specifier - default
}

interface  IA {
    int num = 10; /* access specifier - public and cannot be anything else
                      static and final
                    */
    void print(); /* cannot be static
                    public and abstract
                   */
}

interface IB extends IA{}

class G extends F implements IA, IB {
    public void print(){} /* assign abstract/public specifically
                             as by default interface methods are public and
                             class methods are default which is weaker specifier */
}

// both interfaces having same methods name and signature

class H implements IC, ID {
  public void print(){
      System.out.println("class");
  }
}

interface IC {
    default void print() {
        System.out.println("IC");
    }
}

interface ID {
    default void print() {
        System.out.println("ID");
    }
}




