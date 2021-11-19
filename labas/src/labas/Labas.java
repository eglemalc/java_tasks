/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labas;

/**
 *
 * @author egle
 */
public class Labas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");

//        boolean arTiesa; //true / false

//        double a = 2.5;
//        double b = 14.21;
//        double c = 3;
//
//        double d = b * b - 4 * a * c;
//
//        boolean arTeigiamas = d > 0;
//        boolean arNulis = d == 0;
//        boolean arNeigiamas = d < 0;
//
//        System.out.println(d);
//        System.out.println(arTeigiamas);
//        System.out.println(arNulis);
//        System.out.println(arNeigiamas);
//
//        if (arNeigiamas) {
//            System.out.println("Sprendiniu nera");
//        }
//
//        if (arNulis) {
//            System.out.println(-b / (2 * a));
//        }
//
//        if (arTeigiamas) {
//            System.out.println((-b + Math.sqrt(d)) / (2 * a));
//            System.out.println((-b - Math.sqrt(d)) / (2 * a));
//        }
//
//        System.out.println("Pabaiga");


        int sk = 200;
        
        if (sk < 0) System.out.println("neigiamas");
        else if (sk < 10) {
            System.out.println("mazas");
        } else if (sk < 100) 
            System.out.println("vidutinis");
        else { if (sk < 1000) System.out.println("didelis");
        else System.out.println("labai didelis");
        }
        
        System.out.println("Pabaiga");
    }
}
