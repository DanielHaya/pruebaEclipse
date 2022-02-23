package antesDeExamen;

import java.util.Scanner;

public class E3 {
	
	static Scanner tcl = new Scanner(System.in);
	
	static int x = 3;
	static int y = 3;

	public static void main(String[] args) {
		
		char num [] [] = new char [x] [y];
		
		for(int i=0 ; i<3 ; i++) {
			for (int j=0 ; j<3 ; j++) {
				num[i] [j] = tcl.next().charAt(0);
			}
		}
		
		for(int i=0 ; i<3 ; i++) {
			for (int j=0 ; j<3 ; j++) {
				 System.out.print(num[i] [j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0 ; i<3 ; i++) {
			for (int j=0 ; j<3 ; j++) {
				 System.out.print(num[j] [i]+" ");
			}
			System.out.println();
		}
		

	}

}
