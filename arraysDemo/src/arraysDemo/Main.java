package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "engin";
		String ogrenci2 = "derin";
		String ogrenci3 = "salih";
		String ogrenci4 = "ahmet";

		String [] ogrenciler = new String [4];
		ogrenciler [0] = "Engin";
		ogrenciler [1] = "Derin";
		ogrenciler [2] = "Salih";
		ogrenciler [3] = "Ahmet";
		
		for(int i =0; i <ogrenciler.length; i++) { 
			System.out.println("öğrenci " + ogrenciler[i]);
		}
		
		for ( String ogrenci: ogrenciler) {
			System.out.println(ogrenci); }
		
		
		
		
	}

}
