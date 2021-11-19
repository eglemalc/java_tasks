package pokalbisdeldarbo;

public class PokalbisDelDarbo {

    public static void main(String[] args) {

        //PIRMAS
//        int[] vienmatis = {1, 2, 3, 4, 5};
//        int vienmacioElementuSk = vienmatis.length;
//
//        int[][] dvimatis = new int[vienmacioElementuSk][vienmacioElementuSk];
//
//        for (int i = 0; i < vienmacioElementuSk; i++) {
//                int indexas = i;
//                for (int k = i; k < vienmacioElementuSk; k++) {
//                    dvimatis[i][k] = vienmatis[k-i];
//                }
//                for (int l = 0; l < i; l++) {
//                    
//                    dvimatis[i][l] = vienmatis[vienmacioElementuSk - indexas];
//                    indexas--;
//                }
//        }
//        //spausdinam rezultata
//        for (int i = 0; i < dvimatis.length; i++) {
//            for (int j = 0; j < dvimatis[i].length; j++) {
//                System.out.print(dvimatis[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//
//    }
//ANTRAS
//        int[] vienmatis = {1, 2, 3, 4, 5};
//        int vienmacioElementuSk = vienmatis.length;
//        int maxIndex = vienmacioElementuSk - 1;
//
//        int[][] dvimatis = new int[vienmacioElementuSk][vienmacioElementuSk];
//
//        for (int i = 0; i < vienmacioElementuSk; i++) {
//                int indexas = 1;
//                for (int k = 0; k <= maxIndex - i; k++) {
//                    dvimatis[i][k] = vienmatis[k + i];
//                }
//                for (int l = maxIndex; l > maxIndex - i; l--) {
//                    dvimatis[i][l] = vienmatis[i - indexas];
//                    indexas++;
//                }
//        }
//
//        //spausdinam rezultata
//        for (int i = 0;
//                i < dvimatis.length;
//                i++) {
//            for (int j = 0; j < dvimatis[i].length; j++) {
//                System.out.print(dvimatis[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

int[] vienmatis = {1, 2, 3, 4, 5};
        int vienmacioElementuSk = vienmatis.length;

        int[][] dvimatis = new int[vienmacioElementuSk][vienmacioElementuSk];

        for (int i = 0; i < vienmacioElementuSk; i++) {
                for (int j = 0; j < vienmacioElementuSk; j++) {
                    dvimatis[i][j] = vienmatis[(i+j) % vienmacioElementuSk];
                }
        }

        //spausdinam rezultata
        for (int i = 0;
                i < dvimatis.length;
                i++) {
            for (int j = 0; j < dvimatis[i].length; j++) {
                System.out.print(dvimatis[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        
        System.out.println(0%5);

    }

}
