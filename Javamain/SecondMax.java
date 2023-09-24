package Javamain;

public class SecondMax {
    public static void main(String[] args) {
        int arr[]={23,65,1,45};
        Second(arr);
    }
    public static void Second(int arr[]) {
        int max=0;
        int max2=0;
        for(int i=0;i< arr.length;i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        for(int i=0;i< arr.length;i++) {
            if(arr[i]>max2&&arr[i]<max) {
                max2=arr[i];
            }
        }
        System.out.println("Maximum element is "+max+" and second max is "+max2);
    }
}
