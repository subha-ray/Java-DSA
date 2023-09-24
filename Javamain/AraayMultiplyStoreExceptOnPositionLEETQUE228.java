package Javamain;

public class AraayMultiplyStoreExceptOnPositionLEETQUE228 {
    public static void main(String[] args) {
        int brr[] = {1, 2, 3, 4};
        product(brr);
    }
      static void product(int arr[]) {
        int a[]=new int[arr.length];
        for (int i=0;i<arr.length;i++) {
            int prod=1;
            for(int j=0;j<arr.length;j++) {
                if(j==i) {
                    continue;
                }
                else {
                    prod = prod * arr[j];
                }
            }
            a[i]=prod;
        }
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
}
