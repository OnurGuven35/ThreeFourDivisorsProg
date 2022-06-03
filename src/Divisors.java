import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int num, ort, top = 0, sayac = 0;
        System.out.print("Lutfen Sayiyi Giriniz : ");
        num = inp.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                top += i;
                sayac++;
            }
        }

        if (num <= 0) {
            System.out.print("Lutfen Gecerli Bir Deger Giriniz ! ");
        } else {
            ort = top / sayac;
            System.out.print("Girdiginiz Sayiya Kadar Olan Sayilarin Icinde 3'e ve 4'e Bolunen Sayilarin Ortalamasi : " + ort);
        }
    }
}