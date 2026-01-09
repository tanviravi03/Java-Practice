package Java;

public class Arrays {
    public static void main(String[] args) {

        //1.declaration+initialization
        int[] arr = {1, 2, 3, 4, 5};
        //printing using foreach loop
        for (int i : arr)
            System.out.println(i); //ln print a new line after each iteration

        //1. 2D array
        int arr2D[][] = new int[4][];
        arr2D[0] = new int[] {1, 2, 3, 4};
        arr2D[1] = new int[] {1, 2, 3};
        arr2D[2] = new int[] {1, 2};
        arr2D[3] = new int[]{1};

//        for (int i = 0; i < arr2D.length; i++) {
//            for (int j = 0; j < arr2D[i].length; j++) {
//                System.out.print(arr2D[i][j]);
//            }
//            System.out.println();
//        }

        //for each loop for 2D arrays
        for (int [] row : arr2D) {
            for (int value : row)
                System.out.print(value+ " ");
            System.out.println();
        }

        //2. 2d Array
        int arr2d [][] = {{10}, {10,20}, {10,20,30}};
        for (int [] r : arr2d) {
            for (int val : r)
                System.out.print(val + " ");
            System.out.println();
        }

            //2.declaration+creation+initialization
            int[] arr2 = new int[]{10, 20, 30, 40, 50};
            for (int k : arr2)
                System.out.print(k); //directly printing the values of i
            System.out.println();

            //3.declaration+creation
            // then initialization
            int[] arr1 = new int[5];
            arr1[0] = 100;
            arr1[1] = 200;
            arr1[2] = 300;
            arr1[3] = 400;
            arr1[4] = 500;

            for (int l = 0; l < arr1.length; l++) {
                int x = arr1[l];
                System.out.print(x + " ");//printing index of arr1
            }
            System.out.println();

            //4.declaration
            // then creation+initialization
            int[] arr3;
            //arr3 = new int []{10000,20000,30000,40000,50000};   //This is also valid

            arr3 = new int[5];
            arr3[0] = 1000;
            arr3[1] = 2000;
            arr3[2] = 3000;
            arr3[3] = 4000;
            arr3[4] = 5000;

            for (int m = 0; m < arr3.length; m++)
                System.out.print(arr3[m] + " "); //printing index of arr1
        }
    }