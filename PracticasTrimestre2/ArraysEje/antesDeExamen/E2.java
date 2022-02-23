package antesDeExamen;
import java.util.*;
public class E2 {
	
	static Scanner tcl = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num [] = new int [10];
		
		char a = tcl.next().charAt(0);
		
		System.out.println("Escriba diez elementos");
		
		for (int i=0 ; i<10 ; i++) {
			num[i]=tcl.nextInt();
		}
		
		if(crece(num)) {
			System.out.println("Está creciendo");
		}else if(decrece(num)) {
			System.out.println("Está decreciendo");
		}else {
			System.out.println("Esta desordenado");
		}
		
		
		
	}
	
	public static boolean crece(int num []) {
		boolean cp = true;
		for(int i=1 ; i<10 ; i++) {
			if (num[i]<num[i-1]) {
				cp=false;
				i=9;
			}
		}
		return cp;
	}
	
	public static boolean decrece(int num []) {
		boolean cp = true;
		for(int i=1 ; i<10 ; i++) {
			if (num[i]>num[i-1]) {
				cp=false;
				i=9;
			}
		}
		return cp;
	}
	
	
	
	
}
