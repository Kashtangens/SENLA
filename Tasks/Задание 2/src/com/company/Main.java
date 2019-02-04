package com.company;
import java.util.Scanner;


public class Main {
    static int N;

    public static void main(String[] args) {
	Scanner str = new Scanner(System.in);

    N = str.nextInt();
    if (N<=0){
        System.out.print("Invalid number");
    }
    else {
        if (N == 1) {
            System.out.print("1");
        } else if (N == 2) {
            System.out.print("1 1");
        } else {
            System.out.print("1 ");
            Fib(1, 1);
        }
    }
    }

    public static void Fib(int i, int j){
        System.out.print(j+" ");
        if (j+i<=N){
            j=j+i;
            i=j-i;
            Fib(i, j);
        }
    }



}

