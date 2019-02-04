package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int arr[];

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input count of array's elements");
        arr = new int[scan.nextInt()];
        System.out.println("Input array");
        for (int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }
        VstSort();
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
	static void VstSort(){
        int tmp;
        for (int i=1; i<arr.length; i++){
            for (int j=i; ((j>0)&&(arr[j-1]<arr[j])); j--){
                tmp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=tmp;
            }
        }
    }


}
