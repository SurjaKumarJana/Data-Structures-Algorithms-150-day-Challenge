package lec_27;

public class MultiplyEach {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,10};

        System.out.println("input array");
        printArr(arr);

        multiplyArr(arr);

        System.out.println("output arr");
        printArr(arr);


    }
    public static void multiplyArr(int[] arr){
        for(int i=0; i<arr.length;i++){
            arr[i] = arr[i]*10;
        }
    }
    public static void printArr(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
