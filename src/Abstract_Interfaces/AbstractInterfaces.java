package Abstract_Interfaces;

public class AbstractInterfaces {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

/****************** abstract class ********************/
abstract class C {} //no object can be created of this

abstract class D {      //if class has one abstract method then class mandatory should be abstract
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




