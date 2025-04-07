
public class Main {
    //Static
    static {
        System.out.println("Static block 1");
        display();
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //Array
        for(String s:args)
            System.out.println(s);

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

        //String

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
