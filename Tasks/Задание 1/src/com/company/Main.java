package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int Num;
        Scanner str = new Scanner(System.in);
	    int N = str.nextInt();
	    for (int i=1; i<=N; i++){
	        Num=0;
	        if (i==1) Num++;
	        for (int x=1; x<=N/2; x++){
                if (i%x==0) Num++;
            }
            if(Num<=2) System.out.println("Prime number is: "+i);
        }

    }
}
