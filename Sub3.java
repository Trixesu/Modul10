package com.mycompany.modulx;
import java.util.Scanner;
public class Sub3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n, r;
        do {
            System.out.print("Masukkan n : ");
            n = input.nextInt();
            System.out.print("Masukkan r : ");
            r = input.nextInt();

            if (n < r) {
                System.out.println("Eror: Nilai n harus lebih besar dari nilai r!");
            }
        } while (n < r);
        int kombinasi = faktorial(n) / (faktorial (n-r) * faktorial(r));
        System.out.println("Hasil C("+n+", "+r+") : "+kombinasi);
        input.close();
    }
    static int faktorial(int x) {
        int hasil = 1;
        for (int i = 1; i <= x; i++) {
            hasil *= i;
        }
        return hasil;
    }
}
