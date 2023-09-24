package Javamain;

import java.util.Scanner;

public class ArrayCreation {
    public static void main(String[] args) {

//        int arr[];
//        arr=new int[5];
        int arr[]=new int[4];
//        System.out.println(arr[3]);
//        System.out.println(arr);
//        //insert value
//        arr[3]=9;
//        System.out.println(arr[3]);
//        System.out.println(arr.length);
        int sum=0;
          Scanner sc=new Scanner(System.in);
        for (int i=0;i<arr.length;i++) {
            System.out.print("Enter the number for index "+i +":");
            int data=sc.nextInt();
            arr[i]=data;
//            sum+=arr[i];
        }
//        for (int i=0;i<5;i++) {
//            System.out.println(arr[i]);
//        }
        int max=0;
        for (int n:arr) {
            if(n>max) {
                max=n;
            }
            System.out.println(n);
            sum+=n;
        }
        System.out.println("The sum of arr is: "+sum);
        System.out.println("The maximum element of arr is: "+max);//maxelement
        int i=0,j=arr.length-1;
        int brr[]=new int[4];
        while (i<arr.length) {
            brr[j]=arr[i];
            i++;
            j--;
        }
        for(int a:brr) {
            System.out.println(a);
        }
    }
}
