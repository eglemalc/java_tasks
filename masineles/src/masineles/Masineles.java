package masineles;

public class Masineles {

    public static void main(String[] args) {

        int[] masinuGreiciai = new int[8];
        int[] masinuAtstumas = new int[8];

        int max = 10;  //max greicio keitimas
        int min = -3;  //min greicio keitimas

        int greicioKeitimas = 0;
        int didziausiasAtstumas = 0;

        while (didziausiasAtstumas <= 1000) {
            for (int i = 0; i < masinuGreiciai.length; i++) {
                greicioKeitimas = (int) ((Math.random() * (max - min)) + (min));
                if (greicioKeitimas < 0) {
                    greicioKeitimas = 0;
                }
                if (masinuAtstumas[i] > didziausiasAtstumas) {
                    didziausiasAtstumas = masinuAtstumas[i];
                    if(didziausiasAtstumas >= 1000) {
                        break;
                    }
                }
                masinuGreiciai[i] += greicioKeitimas;
                masinuAtstumas[i] += masinuGreiciai[i];
            }
            System.out.println("----------------Roundas-----------");
            System.out.println("Pirma masina vaziuoja " + masinuGreiciai[0] + " greiciu, nuvaziuotas atstumas lygus " + masinuAtstumas[0]);
            System.out.println("Antra masina vaziuoja " + masinuGreiciai[1] + " greiciu, nuvaziuotas atstumas lygus " + masinuAtstumas[1]);
            System.out.println("Trecia masina vaziuoja " + masinuGreiciai[2] + " greiciu, nuvaziuotas atstumas lygus " + masinuAtstumas[2]);
            System.out.println("Ketvirta masina vaziuoja " + masinuGreiciai[3] + " greiciu, nuvaziuotas atstumas lygus " + masinuAtstumas[3]);
            System.out.println("Penkta masina vaziuoja " + masinuGreiciai[4] + " greiciu, nuvaziuotas atstumas lygus " + masinuAtstumas[4]);
            System.out.println("Sesta masina vaziuoja " + masinuGreiciai[5] + " greiciu, nuvaziuotas atstumas lygus " + masinuAtstumas[5]);
            System.out.println("Septinta masina vaziuoja " + masinuGreiciai[6] + " greiciu, nuvaziuotas atstumas lygus " + masinuAtstumas[6]);
            System.out.println("Astunta masina vaziuoja " + masinuGreiciai[7] + " greiciu, nuvaziuotas atstumas lygus " + masinuAtstumas[7]);
        }
        
        int laimetojoAtstumas = 0;
        int laimetojoNumeris = 0;
        for(int i = 0; i < masinuAtstumas.length; i++) {
            if(masinuAtstumas[i] > laimetojoAtstumas) {
                laimetojoAtstumas = masinuAtstumas[i];
                laimetojoNumeris = i+1;
                
            }
        }
        System.out.println("Laimetojas vaziavo masina numeriu: " + laimetojoNumeris + ", nuvaziavo atstuma: " + laimetojoAtstumas);
    }

}
