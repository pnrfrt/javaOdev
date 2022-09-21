package recapDemo2;

public class Main {

	public static void main(String[] args) {
		
		int [] tekSayilar = { 1, 3, 5, 7, 9,};
		
		int sayilarimToplami= 0;
		int max = tekSayilar [0];
		
		for ( int sayilarim: tekSayilar ) { 
			System.out.println(sayilarim);
			sayilarimToplami= sayilarimToplami + sayilarim ;
			
			if (max < sayilarim) {
				max = sayilarim;
				}
		}
		
		System.out.println("toplam = " + sayilarimToplami);
		System.out.println(" En Büyük Sayi = " + max);
			
		
	}
}
