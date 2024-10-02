import java.util.Scanner;

public class MetinTersCevirici {

	public static void main(String[] args) {
		// Kullanıcıdan alınan bir metni ters çevir
		Scanner scanner = new Scanner(System.in);

		System.out.print("Metin giriniz: ");
		String metin = scanner.nextLine();
		String tersMetin = "";
		for(int i=metin.length()-1; i >= 0; i--) {
			tersMetin+= metin.charAt(i);
		}
		
		System.out.println("Ters Çevrilmiş Metin: " + tersMetin);
		

	}

}
