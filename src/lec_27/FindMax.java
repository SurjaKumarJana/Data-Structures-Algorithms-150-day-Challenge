package lec_27;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {1,2,3,40,5,6,7,8,9,10};
        int max = getMax(arr);
        System.out.println("Maximum element in this array is : " + max);
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for(int i:arr){
            if(i>max) max =i;
        }

        return max;
    }
}
