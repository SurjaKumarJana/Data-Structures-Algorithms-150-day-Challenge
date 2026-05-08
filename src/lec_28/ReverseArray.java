package lec_28;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        System.out.println("initial array");
        print(arr);
        reverseArray(arr);
        System.out.println("reversed array");
        print(arr);

    }
    public static void reverseArray(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            //swapping
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            //moving to the next idx
            i++;
            j--;
        }
    }

    public static void print(int[] arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
