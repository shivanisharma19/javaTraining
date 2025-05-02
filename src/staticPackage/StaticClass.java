package staticPackage;

public class StaticClass {
    /************************* Static ***********************/
    static {
        System.out.println("Static block 1");
        display();
    }

    // main is static because otherwise we need an object reference to invoke main and object cannot be created unless the execution is started- Catch22 problem
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    void print() {
        System.out.println("print");
    }

    static void display(){
        System.out.println("Static block 3 - display");
    }

    static {
        StaticClass m1 = new StaticClass();
        m1.print();
        System.out.println("Static block 2");
    }
}

