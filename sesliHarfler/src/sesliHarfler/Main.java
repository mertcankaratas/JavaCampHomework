package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf ='I';
		
		switch(harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalýn Sesli harf");
			break;
		default:
			System.out.println("ince sesli harf");
		}

	}

}
