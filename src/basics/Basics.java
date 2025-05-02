package basics;

public class Basics {
    /* field variable :- are initialized by default
      a) static
      b) non-static
     */
    int a, b;

    Basics() {
        // if this is not provided system refer to default/system generated no arg constructor
        System.out.println("No args constructor of Basics - parent class");
    }

    Basics(int a, int b) {
        this(); // this will call the Basics() no arg constructor first -should be first command
        this.a = a;
        this.b = b;
        System.out.println("Constructor to initialize variables of Basics - parent class");
    }

    public static void main(String[] args) {
        /* local variable :-
        a) primitive are not initialized by default
        b) non-primitive are initialized by default
       */
        int num;
        String arr;
        Basics b1 = new Basics();
        //field variables - are initialized by default
        System.out.println("a: " + b1.a);
        System.out.println("b: " + b1.b);

        Basics b2 = new Basics(2, 3);
        System.out.println("a: " + b2.a);
        System.out.println("b: " + b2.b);
        b2.print();

        //local variables - error as they are not initialized
//        System.out.println("num: " + num);
//        System.out.println("arr:" + arr);

        A objA1 = new A();
        A objA2 = new A("Hello");
        A objA3 = new A(5);

        /*
        Basics objBas = new A(); <- valid
        A objA = new Basics();  <- invalid
         */
        Basics objBas = new A(); // superclass reference can hold the object of its child class

        b1.print();
        objA1.print();
    }

    public void print(){
        System.out.println("print of Basics - parent class");
    }
}

class A extends Basics{
    int c;

    A(){
        super(); //call the no args constructor of parent class - should be the first line
        System.out.println("No arg constructor of A- child class");
    }

    A(String s){
        // constructor of parent class will be called by default
        System.out.println("No arg constructor of A- child class " + s);
    }

    A(int a){
        super(a, a); // constructor of parent class will be called by default + argument constructor of parent class will be called
        System.out.println("No arg constructor of A- child class");
    }


//*********************** overriding rule **********************//
    /*
     1. should have same signature
     2. constructor cannot be overridden
     3. private method cannot be overrriden
     4. cannot be more restrictive than parent, can be less. i.e. public method cannot be default in child class
     5. Must not throw new broader checked exception
       <- Access Specifier public < protected < default < private  ->
     */
    public void print(){
        super.print(); //will call print of parent class first
        System.out.println("print method of child class");
    }
}


