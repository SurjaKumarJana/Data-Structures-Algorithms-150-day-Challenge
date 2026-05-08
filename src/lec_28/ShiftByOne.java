package lec_28;

public class ShiftByOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("initial array");
        print(arr);
        shiftArray(arr);
        System.out.println("final array");
        print(arr);

    }
    public static void shiftArray(int[] arr){
        int i = arr.length-1;
        int lastElement = arr[i];

        while(i>=1){
            //shifting element
            arr[i] = arr[i-1];

            // moving the pointer
            i--;
        }

        arr[0] = lastElement;
    }
    public static void print(int[] arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
