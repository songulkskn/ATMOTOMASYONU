package songulkeskin.com;

import java.util.Scanner;

public class ATM {
	public void calis(Hesap hesap) {
		hesapAcma nesne = new hesapAcma();
		Scanner klavyedenOku = new Scanner(System.in);

		System.out.println("Bankamýza Hoþgeldiniz...");

		System.out.println("-----------------");

		System.out.println("MÜÞTERÝ Giriþi");

		System.out.println("------------------");

		int girishakki = 3;

		while (true) {
			if (nesne.nesne(hesap)) {
				System.out.println("Giris basarýlý.");
				break;
			} else {
				System.out.println("Giris baþarýsýz");
				girishakki -= 1;
				System.out.println("Kalan giris hakký" + girishakki);
			}
			if (girishakki == 0) {
				System.out.println("Giriþ bloke edilmiþtir.");
				return;
			}
		}
		System.out.println("--------------");
		String islemler = "1. Bakiye Görüntüle\n" + "2.Para Yatýrma\n" + "3.Para Çekme\n" + "Çýkýþ için q basýnýz";
		System.out.println(islemler);
		System.out.println("----------------");
		while (true) {
			System.out.println("Ýslem seciniz : ");
			String islem1 = klavyedenOku.nextLine();

			if (islem1.equals("q")) {
				break;
			} else if (islem1.equals("1")) {
				System.out.println("Bakiyeniz : " + hesap.getBakiye());
			} else if (islem1.equals("2")) {
				System.out.println("Yatýrmak istediðiniz tutar : ");
				int tutar = klavyedenOku.nextInt();
				klavyedenOku.nextLine();
				hesap.paraYatir(tutar);

			} else if (islem1.equals("3")) {
				System.out.println("Çekmek istediðiniz tutar : ");
				int tutar = klavyedenOku.nextInt();
				klavyedenOku.nextLine();
				hesap.paraCek(tutar);
			} else {
				System.out.println("Geçersiz iþlem\n" + islemler);
			}
		}
	}

}
