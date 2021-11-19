package ciklai;

import java.util.Scanner;

public class Ciklai {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int daliklis = 2;
//        int skaicius;
//
//        System.out.println("Ivesk bet koki skaiciu: ");
//        skaicius = sc.nextInt();
//
//        if (skaicius % 2 != 0) {
//            daliklis = 3;
//            while (daliklis <= skaicius / 2) {
//                if (skaicius % daliklis == 0) {
//                    System.out.println("Daliklis: " + daliklis);
//                }
//                daliklis = daliklis + 2;
//            }
//        } else {
//            while (daliklis <= skaicius / 2) {
//                if (skaicius % daliklis == 0) {
//                    System.out.println("Daliklis: " + daliklis);
//                }
//                daliklis = daliklis + 1;
//            }
//        }
//        System.out.println("Pabaiga4");
//        int nuo;
//        int iki;
//        int suma = 0;
//
//        System.out.println("Ivesk pirma skaiciu: ");
//        nuo = sc.nextInt();
//        
//        System.out.println("Ivesk antra skaiciu: ");
//        iki = sc.nextInt();
//        
//        while (nuo <= iki) {
//            suma += nuo;
//            nuo ++;
//        }
//        System.out.println(suma);

//duoti skaiciai nuo ir iki
//atspausdinti daugybos lentele
//nuo: 2
//iki: 4
//
//4
//6
//8
//6
//9
//12
//8
//12
//16
        //DAUGYBOS LENTELE
        int nuo;
        int iki;

        System.out.println("Ivesk pirma skaiciu: ");
        nuo = sc.nextInt();

        System.out.println("Ivesk antra skaiciu: ");
        iki = sc.nextInt();
        
        System.out.println("---------");
  
        
        for (int i = nuo; i<=iki; i++) {
            for (int j = nuo; j<=iki; j++) {
                System.out.println(i*j);
            }
        }
    }

}
