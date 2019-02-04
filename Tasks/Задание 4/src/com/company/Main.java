package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean inp[] = new boolean[4];
        Scanner scan = new Scanner(System.in);
        System.out.print("Input line with 4 boolean values ");
        for (int i=0; i<4; i++) {
            inp[i] = scan.nextBoolean();
        }
        if (isTwo(inp)) {
            System.out.print("True");
        }
    }

    static boolean isTwo(boolean bool[]){
        boolean res = false;
        int count = 0;
        for (int i=0; i<4; i++){
            if (bool[i]){
                count++;
            }
        }
        if (count==2) {
            res = true;
        }
        return res;
    }


}
