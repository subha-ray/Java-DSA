package Javamain;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the length of array: ");
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++) {
            int data=sc.nextInt();
            arr[i]=data;
        }
        int val=0;
        System.out.print("Enter a element to search: ");
        int number= sc.nextInt();
        for (int i=0;i<n;i++) {
            if(number==arr[i]) {
                System.out.println("The number "+number+" is present in array at the index "+i);
                val=1;
            }
        }
        if(val==0) {
            System.out.println("Search element is not present in the array");
        }

    }
}
