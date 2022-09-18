package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[][] sehirler=new String[3][3];
        sehirler[0][0]="Ýstanbul";
        sehirler[0][1]="Edirne";
        sehirler[0][2]="Bilecik";
        sehirler[1][0]="Konya";
        sehirler[1][1]="Ankara";
        sehirler[1][2]="Kýrýkkale";
        sehirler[2][0]="Ýzmir";
        sehirler[2][1]="Aydýn";
        sehirler[2][2]="Manisa";
        
        for(int i=0;i<=2;i++) {
        	System.out.println("---------------------");
        	for(int j=0;j<=2;j++) {
        		System.out.println(sehirler[i][j]);
        	}
        }
	}

}
