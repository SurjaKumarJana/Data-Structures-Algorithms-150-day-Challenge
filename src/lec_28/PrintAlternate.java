package lec_28;

public class PrintAlternate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("initial array");
        print(arr);
        System.out.println("printing alternatively");
        printAlternateArray(arr);
    }

    public static void printAlternateArray(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while(i<j){
            System.out.print(arr[i]+" ");
            System.out.print(arr[j]+" ");
            //moving the pointer
            i++;
            j--;
        }
        System.out.println();
    }

    public static void print(int[] arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
