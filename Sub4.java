package com.mycompany.modulx;
import java.util.Scanner;
public class Sub4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n (Tinggi Segitiga Pascal) : ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int r = 0; r < n - i; r++) {
                System.out.print("  ");
            }   
            for (int r = 0; r <= i; r++) {
                System.out.printf("%4d", kombinasi(i, r));
            }
            System.out.println();
        }
        input.close();
    }
    static int faktorial(int x) {
            int hasil = 1;
            for (int i = 1; i <= x; i++) {
                hasil *= i;
            }
            return hasil;
    }
    static int kombinasi(int n, int r){
        return faktorial(n) / (faktorial (n-r) * faktorial(r));
    }
}