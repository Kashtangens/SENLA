package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    boolean pal=true;
        Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine().trim();
	    int j=str.length()-1;
	    for(int i=0; i<=j/2; i++){
	        if(str.charAt(i)!=str.charAt(j-i)){
                pal = false;
                break;
	        }
        }
        if(pal) System.out.println("The word is palindromic");
	    else System.out.println("The word isn't palindromic");
    }
}
