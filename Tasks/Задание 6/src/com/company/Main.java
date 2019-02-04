package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	int x;
	while(str.indexOf('0')!=-1||str.indexOf('1')!=-1||str.indexOf('2')!=-1||str.indexOf('3')!=-1||str.indexOf('4')!=-1||str.indexOf('5')!=-1||str.indexOf('6')!=-1||str.indexOf('7')!=-1||str.indexOf('8')!=-1||str.indexOf('9')!=-1) {
		if (str.indexOf('0') != -1) {
			x = str.indexOf('0');
			str = str.substring(0, x) + str.substring(x + 1);
		}
		if (str.indexOf('1') != -1) {
			x = str.indexOf('1');
			str = str.substring(0, x) + str.substring(x + 1);
		}
		if (str.indexOf('2') != -1) {
			x = str.indexOf('2');
			str = str.substring(0, x) + str.substring(x + 1);
		}
		if (str.indexOf('3') != -1) {
			x = str.indexOf('3');
			str = str.substring(0, x) + str.substring(x + 1);
		}
		if (str.indexOf('4') != -1) {
			x = str.indexOf('4');
			str = str.substring(0, x) + str.substring(x + 1);
		}
		if (str.indexOf('5') != -1) {
			x = str.indexOf('5');
			str = str.substring(0, x) + str.substring(x + 1);
		}
		if (str.indexOf('6') != -1) {
			x = str.indexOf('6');
			str = str.substring(0, x) + str.substring(x + 1);
		}
		if (str.indexOf('7') != -1) {
			x = str.indexOf('7');
			str = str.substring(0, x) + str.substring(x + 1);
		}
		if (str.indexOf('8') != -1) {
			x = str.indexOf('8');
			str = str.substring(0, x) + str.substring(x + 1);
		}
		if (str.indexOf('9') != -1) {
			x = str.indexOf('9');
			str = str.substring(0, x) + str.substring(x + 1);
		}
	}
    System.out.println(str);
    }
}
