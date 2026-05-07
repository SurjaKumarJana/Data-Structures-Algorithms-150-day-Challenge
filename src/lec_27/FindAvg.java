package lec_27;

public class FindAvg {
    public static void main(String[] args){
        int[] arr = {1,2,3,10,1 };

        System.out.println("avg is :"+getAvg(arr));
    }
    public static double getAvg(int[] arr){
        int sum = 0;
        for(int i:arr){
            sum+=i;
        }
        double avg =(double)  sum /arr.length;
        return avg;
    }
}
