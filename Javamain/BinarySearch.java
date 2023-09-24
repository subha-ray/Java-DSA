package Javamain;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={10,11,12,13,14,15,16,17};
        int data=17;
        display(arr,data);
    }
    public static void display(int[] arr, int data) {
        int low=0;
        int high=arr.length;
        int mid;
        //int data=13;
        int i=0;
        while (low<=high) {
            mid=(low+high)/2;
            if(arr[mid]<data) {
                low=mid+1;
            }
            else if(arr[mid]>data) {
                high=mid-1;
            }
            else {
                i = mid;
                //System.out.println(i);
                break;
            }
        }
        System.out.println(i);

    }
}
