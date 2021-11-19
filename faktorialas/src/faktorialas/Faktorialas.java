package faktorialas;

import java.util.Scanner;

public class Faktorialas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int skaicius;
        
        System.out.println("Ivesk skaiciu, kurio faktorialas tave domina: ");
        skaicius = sc.nextInt();
        
        int faktorialas = skaicius;
        
        for (int i = skaicius -1 ; i > 0; i--) {
            faktorialas *= i;
        }
        
        System.out.println(faktorialas);
    }
    
}
