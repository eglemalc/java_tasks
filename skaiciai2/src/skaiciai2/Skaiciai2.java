package skaiciai2;

import java.util.Scanner;

public class Skaiciai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int sk1;
//        int sk2;
//
//        System.out.println("Ivesk 1-a skaiciu: ");
//
//        sk1 = sc.nextInt();
//
//        System.out.println("Ivesk 2-a skaiciu: ");
//
//        sk2 = sc.nextInt();
//
//        System.out.println("suma");
//
//        System.out.println(sk1 + sk2);
        int krastine1;
        int krastine2;
        int krastine3;

        int suma1;
        int suma2;
        int suma3;
        

        System.out.println("Ivesk 1-a krastine: ");
        krastine1 = sc.nextInt();

        System.out.println("Ivesk 2-a krastine: ");
        krastine2 = sc.nextInt();

        System.out.println("Ivesk 3-a krastine: ");
        krastine3 = sc.nextInt();

        suma1 = krastine1 + krastine2;
        suma2 = krastine2 + krastine3;
        suma3 = krastine1 + krastine3;

        if (suma1 > krastine3) {
            if (suma2 > krastine1) {
                if (suma3 > krastine2) {
                    System.out.println("Sudaro trikampi hey");
                    
                    double perimetras;
                    double pusperimetris;
                    double plotas;
                    
                    perimetras = krastine1 + krastine2 + krastine3;
                    pusperimetris = perimetras/2;
                    plotas = Math.sqrt(pusperimetris * (pusperimetris-krastine1) * (pusperimetris-krastine2) * (pusperimetris-krastine3));
                    
                    System.out.println("Trikampio plotas = " + plotas);
                    
                } else {
                    System.out.println("Ne");
                }
            } else {
                System.out.println("Ne");
            }

        } else {
            System.out.println("Ne");

        }
    }
}

