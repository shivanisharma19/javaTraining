package Static;

public class StaticClass {
    /************************* Static ***********************/
    static {
        System.out.println("Static block 1");
        display();
    }


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

