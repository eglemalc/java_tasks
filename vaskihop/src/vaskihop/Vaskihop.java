package vaskihop;

import java.util.Scanner;

public class Vaskihop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vaskiHopKompo;
        int vaskiHopMano;

        int kompoTaskai = 0;
        int manoTaskai = 0;

        do {
            //VASKINAM
            vaskiHopKompo = (int) (Math.random() * 3 + 1);
            if (vaskiHopKompo == 1) {
//                System.out.println("Kompas rodo AKMUO");
            } else if (vaskiHopKompo == 2) {
                
//                System.out.println("Kompas rodo POPIERIUS");
            } else if (vaskiHopKompo == 3) {
//                System.out.println("Kompas rodo ZIRKLES");
            }
            //AS VASKINU
            System.out.println("---------------");
            System.out.println("AKMUO = 1");
            System.out.println("POPIERIUS = 2");
            System.out.println("ZIRKLES = 3");
            System.out.println("Iveskite savo vaskiHop'a: ");
            System.out.println("---------------");
            vaskiHopMano = sc.nextInt();
            //TIKRINIMAS

            if (vaskiHopKompo == vaskiHopMano) {
                System.out.println("Lygiosios");
            } else if (vaskiHopKompo == 1 & vaskiHopMano == 2) {
                manoTaskai++;
            } else if (vaskiHopKompo == 2 & vaskiHopMano == 3) {
                manoTaskai++;
            } else if (vaskiHopKompo == 3 & vaskiHopMano == 1) {
                manoTaskai++;
            } else {
                kompoTaskai++;
            }
            
            System.out.println("Kompo taskai: " + kompoTaskai);
            System.out.println("Mano taskai: " + manoTaskai);
        } while (vaskiHopMano != 0);

        
    }

}
