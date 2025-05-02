package arrays;

public class Arrays {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Arrays m2 = new Arrays();
        m2.array();
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

}



