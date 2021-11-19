package moneta;

import java.util.Scanner;

public class Moneta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int moneta;

        int spejimas;
        int count = 0;
        int herbai = 0;
        int skaiciai = 0;

        do {
            //MONETOS METIMAS
            moneta = (int) (Math.random() * 2 + 1);
            System.out.println("Moneta iskrito: " + moneta);
            //SPEJIMAS
            System.out.println("Jusu spejimas: ");
            spejimas = sc.nextInt();
            count++;
            //TIKRINIMAS
            if (moneta == 1) {
                skaiciai++;
            } else if (moneta == 2) {
                herbai++;
            }
        } while (spejimas != moneta);

        System.out.println("Atspejote!");
        System.out.println("Spejimu buvo: " + count);
        System.out.println("Herbu: " + herbai);
        System.out.println("Skaiciu: " + skaiciai);
    }

}
