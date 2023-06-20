package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tabanı giriniz: ");
        int taban = scanner.nextInt();
        System.out.print("Üssü giriniz: ");
        int us = scanner.nextInt();
        scanner.close();

        int sonuc = recursivePower(taban, us);
        System.out.println("Sonuç: " + sonuc);
    }

    static int recursivePower(int taban, int us) {
        if (us == 0) {
            return 1;
        } else if (us % 2 == 0) {
            int yarimUs = recursivePower(taban, us / 2);
            return yarimUs * yarimUs;
        } else {
            int yarimUs = recursivePower(taban, (us - 1) / 2);
            return taban * yarimUs * yarimUs;
        }
    }
}