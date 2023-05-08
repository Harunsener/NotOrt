import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// değişkenleri oluştur
        int matematik,fizik,kimya,turkçe,tarih,muzik;

        Scanner inp = new Scanner (System.in);
        System.out.println("Matematik notunuz : ");
        matematik = inp.nextInt();
        System.out.println("Fizik  notunuz : ");
        fizik   = inp.nextInt();

        System.out.println("Kimya notunuz : ");
        kimya = inp.nextInt();
        System.out.println("turkçe notunuz : ");
        turkçe = inp.nextInt();
        System.out.println("tarih notunuz : ");
        tarih = inp.nextInt();
        System.out.println("muzik notunuz : ");
        muzik = inp.nextInt();
        int toplam = (matematik+fizik+kimya+turkçe+tarih+muzik);
        double sonuc = toplam /6.0;
        System.out.println("Ortalamanız:"+sonuc);
    }
}
