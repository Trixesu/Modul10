    package com.mycompany.modulx;
    import java.util.Scanner;
    public class Sub5i {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double x1 = absis("x1"); double y1 = ordinat("y1");
            double x2 = absis("x2"); double y2 = ordinat("y2");
            double x3 = absis("x3"); double y3 = ordinat("y3");

            double a, b, c;
            a = jarak2Titik (x1, y1, x2, y2);
            b = jarak2Titik (x2, y2, x3, y3);
            c = jarak2Titik (x3, y3, x1, y1);
            
            double keliling = a + b + c;
            double sisi = keliling / 2;
            double luas = Math.sqrt(sisi * (sisi - a) * (sisi - b) * (sisi - c));
            System.out.println("Keliling Segitiga\t: "+keliling);
            System.out.println("Luas Segitiga\t\t: "+luas);
            input.close();
        }
        static double absis(String koordinat) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Absis "+koordinat+"\t: ");
            double absis = input.nextDouble();
            return absis;
        }
        static double ordinat(String koordinat) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Ordinat "+koordinat+"\t: ");
            double ordinat = input.nextDouble();
            return ordinat;
        }
        static double jarak2Titik(double x1, double y1, double x2, double y2) {
            return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        }
    }
