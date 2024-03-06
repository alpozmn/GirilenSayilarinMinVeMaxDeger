import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç adet sayı gireceksiniz?");
        int adet = scanner.nextInt();

        // Kullanıcı en az bir sayı girmelidir
        if (adet <= 0) {
            System.out.println("En az bir sayı girmelisiniz.");
            return; // Programı sonlandır
        }

        System.out.println("Sayıları girin:");
        int min = Integer.MAX_VALUE; // Minimum değeri en büyük int değeri ile başlat
        int max = Integer.MIN_VALUE; // Maksimum değeri en küçük int değeri ile başlat

        // Kullanıcıdan sayıları alarak min ve max değerlerini güncelle
        for (int i = 0; i < adet; i++) {
            int sayi = scanner.nextInt();
            if (sayi < min) {
                min = sayi; // Eğer girilen sayı min'den küçükse, min'i güncelle
            }
            if (sayi > max) {
                max = sayi; // Eğer girilen sayı max'tan büyükse, max'i güncelle
            }
        }

        // Bulunan min ve max değerlerini ekrana yazdır
        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }
}
