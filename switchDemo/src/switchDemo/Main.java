package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'B';

		switch (grade) {
		case 'A' :
			System.out.println("M�kemmel : Ge�tiniz"); 
			break;
			
		case 'B' :
			System.out.println("�ok iyi : Ge�tiniz");
			break;

		case 'C' :
			System.out.println("Orta : Ge�tiniz");
			break;

		case 'D' :
			System.out.println("K�t� : Ge�tiniz");
			break;

		case 'F' :
			System.out.println("�ok K�t� : Ge�tiniz");
			break;

		default: System.out.println("Ge�ersiz not girdiniz");
		break;
			
		}
	}

}
