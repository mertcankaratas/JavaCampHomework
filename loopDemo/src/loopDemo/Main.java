package loopDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//For
		for(int i=2;i<10;i+=2) {
			System.out.println(i);
		}
			System.out.println("D�ng� Bitti");

			
			int i=2;
			//While
			while(i<10) {
				System.out.println(i);
				i+=2;
			}
			
			System.out.println("While D�ng�s� Bitti");
			
			
			//Do-While
			int j=100;
			do {
				System.out.println(j);
				j+=2;
			}while(j<10);
			
			System.out.println("Do-While D�ng�s� Bitti");
	}

}
