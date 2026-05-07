package lec_27;

public class FindFirstUnsortedElement {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,90,9,10};
        System.out.println("first unsorted element : "+findFirst(arr));
    }
    public static int findFirst(int[] arr){
        for(int i=1; i<arr.length;i++){
            if(arr[i-1]>arr[i]) return arr[i];
        }
        return -1;

    }
}
