package songulkeskin.com;

import java.util.Scanner;

public class ATM {
	public void calis(Hesap hesap) {
		hesapAcma nesne = new hesapAcma();
		Scanner klavyedenOku = new Scanner(System.in);

		System.out.println("Bankam�za Ho�geldiniz...");

		System.out.println("-----------------");

		System.out.println("M��TER� Giri�i");

		System.out.println("------------------");

		int girishakki = 3;

		while (true) {
			if (nesne.nesne(hesap)) {
				System.out.println("Giris basar�l�.");
				break;
			} else {
				System.out.println("Giris ba�ar�s�z");
				girishakki -= 1;
				System.out.println("Kalan giris hakk�" + girishakki);
			}
			if (girishakki == 0) {
				System.out.println("Giri� bloke edilmi�tir.");
				return;
			}
		}
		System.out.println("--------------");
		String islemler = "1. Bakiye G�r�nt�le\n" + "2.Para Yat�rma\n" + "3.Para �ekme\n" + "��k�� i�in q bas�n�z";
		System.out.println(islemler);
		System.out.println("----------------");
		while (true) {
			System.out.println("�slem seciniz : ");
			String islem1 = klavyedenOku.nextLine();

			if (islem1.equals("q")) {
				break;
			} else if (islem1.equals("1")) {
				System.out.println("Bakiyeniz : " + hesap.getBakiye());
			} else if (islem1.equals("2")) {
				System.out.println("Yat�rmak istedi�iniz tutar : ");
				int tutar = klavyedenOku.nextInt();
				klavyedenOku.nextLine();
				hesap.paraYatir(tutar);

			} else if (islem1.equals("3")) {
				System.out.println("�ekmek istedi�iniz tutar : ");
				int tutar = klavyedenOku.nextInt();
				klavyedenOku.nextLine();
				hesap.paraCek(tutar);
			} else {
				System.out.println("Ge�ersiz i�lem\n" + islemler);
			}
		}
	}

}
