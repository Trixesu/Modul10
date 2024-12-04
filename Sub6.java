package com.mycompany.modulx;
import java.util.Scanner;
public class Sub6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n : ");
        int n = input.nextInt();
        
        for (double z = -4; z <= 4; z += 0.1) {
            int jumlahBintang = normal(n, z);
            bintang(jumlahBintang);
        }
        input.close();
    }
    static int normal(int n, double z) {
        double e = Math.E;
        double pangkat = -0.5 * Math.pow(z, 2);
        double f = (1 / Math.sqrt(2 * Math.PI)) * Math.pow(e, pangkat);
        return (int) Math.round(n * f);
    }
    static void bintang(int m) {
        for (int i = 0; i <= m; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
