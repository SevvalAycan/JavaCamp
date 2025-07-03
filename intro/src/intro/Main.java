package intro;

public class Main {
	
	//main javada başlangıç noktasıdır.
	public static void main(String[] args) {
		System.out.println("Hello World!");	
		
		//değişken isimleri camelCase yazılır !		
		String metin = "İlginizi Çekebilir!";		
		String altMetin ="Vade Süresi: ";
		int vade = 12;		
		
		System.out.println(metin );		
		System.out.println(altMetin + vade + " gün" );		
		
		double dolarDun = 18.20;
		double dolarBugun = 18.20;
		
		boolean dolarDustuMu;		
		String okYonu;
		
		if(dolarBugun < dolarDun) {
			dolarDustuMu = true;
			okYonu = "down.svg";
		}else if(dolarBugun == dolarDun){
			dolarDustuMu = false;
			okYonu = "equal.svg";
			
		}else {		
			dolarDustuMu = false;
			okYonu = "up.svg";
		}
		System.out.println(okYonu);
		
		//array
		String[] krediler = {"Hızlı Kredi","Maaşını Halkbanktan alanlar","Mutlu Emekli"};
			
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
				
	}
}
