package lec_27;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8};
        int element = 8;
        System.out.println("Element is present in this array : " + findElement(arr,element));
    }
    public static boolean findElement(int[] arr, int element){
        for(int i: arr){
            if(i == element) return true;
        }
        return false;
    }
}
