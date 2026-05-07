package lec_27;

public class CountZerosAndOnes {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,1,0};
        int zeros = countZeros(arr);
        int ones = arr.length - zeros;
        System.out.println("zeros : "+zeros+" & ones : "+ones);

    }
    public static int countZeros(int[] arr){
        int count =0;
        for(int i:arr){
            if(i==0) count++;
        }
        return count;
    }
}
