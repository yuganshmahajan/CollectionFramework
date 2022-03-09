package CollectionImpls;

public class ArrayTest {
    /** Arrays in C++
     * 2 ways to initialise : int a[5]; //creates array in stack
     * int *a = new int[5] // creates array in heap
     *
     * Java has only one way, create array in heap
     * int a[] = new int[5]
     * int[] a = new int[5] // same
     * **/

    public static void fun(int a[]){
        a[3] = 20;
        a[4] = 20;
    }

    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 10;
        a[1] = 10;
        a[2] = 10;
        fun(a); // array is passed by value only but value contains address
        // so the array is also changes in the fun
        // like passing pointers in c++
        for(int i = 0 ; i < 5; i++){
            System.out.print(a[i] + " " );
        }

        for(int val : a){
            System.out.println();
            System.out.print(val + " ");
        }
    }



}
