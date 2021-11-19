package zaidimukas;

import java.util.Scanner;

public class Zaidimukas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mesiArNemesi;

        int manoTaskai = 0;
        int kompoTaskai = 0;

        int kompoMetimas;
        int manoMetimas;

        int kompoSioEjimoTaskuSuma = 0;
        int manoSioEjimoTaskuSuma = 0;

        int metimas = (int) ((Math.random() * 6) + 1);

        //PRADZIA
        //MANO EILE:
        System.out.println("Mano metimas: " + metimas);
        manoSioEjimoTaskuSuma += metimas;
        manoTaskai += manoSioEjimoTaskuSuma;

        while (manoTaskai < 100) {
            System.out.println("Mano tasku suma: " + manoTaskai);
            System.out.println("Mano sio ejimo tasku suma: " + manoSioEjimoTaskuSuma);
            System.out.println("Jei nori ridenti dar karta, spausk 1; jei bijai ir nenori, spausk 0");
            mesiArNemesi = sc.nextInt();

            if (mesiArNemesi == 1) {
                manoMetimas = (int) ((Math.random() * 6) + 1);
                manoSioEjimoTaskuSuma += manoMetimas;
                manoTaskai += manoMetimas;
                System.out.println("Mano metimas: " + manoMetimas);
                System.out.println("Hey");
            }
        }

        //KOMPO EILE
    }

}