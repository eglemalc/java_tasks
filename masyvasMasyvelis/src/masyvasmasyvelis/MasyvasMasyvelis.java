package masyvasmasyvelis;

import java.util.Scanner;

public class MasyvasMasyvelis {

    public static void main(String[] args) {
//        int[] masyvas = {651, 818, 987, 2, -4, 721, -15};
//
//        int sk = 0;
//        
//        for (int i = 0; i < masyvas.length; i++) {
//            for (int j = i + 1; j < masyvas.length; j++) {
//                if (masyvas[i] > masyvas[j]) {
//                    sk = masyvas[j];
//                    masyvas[j] = masyvas[i];
//                    masyvas[i] = sk;
//                }
//            }
//
//        }
//
//        System.out.println(masyvas[0]);
//        System.out.println(masyvas[1]);
//        System.out.println(masyvas[2]);
//        System.out.println(masyvas[3]);
//        System.out.println(masyvas[4]);
//        System.out.println(masyvas[5]);
//        System.out.println(masyvas[6]);
//        
//        int[] masyvas2 = {651, 818, 987, 2, -4, 721, -15};
//        
//        int sk2 = 0;
//        
//        for (int i = 0; i < masyvas2.length; i++) {
//            for (int j = i + 1; j < masyvas2.length; j++) {
//                if (masyvas2[i] < masyvas2[j]) {
//                    sk2 = masyvas2[j];
//                    masyvas2[j] = masyvas2[i];
//                    masyvas2[i] = sk2;
//                }
//            }
//
//        }
//        System.out.println("------------------");
//        System.out.println(masyvas2[0]);
//        System.out.println(masyvas2[1]);
//        System.out.println(masyvas2[2]);
//        System.out.println(masyvas2[3]);
//        System.out.println(masyvas2[4]);
//        System.out.println(masyvas2[5]);
//        System.out.println(masyvas2[6]);

//        int[] m = {651, 818, 987, 2, -4, 721, -15};
//        int[] n = new int[m.length + 2];
//        
//        for(int i = 0; i < n.length; i++) {
//            if(i < m.length) {
//                n[i] = m[i];
//            } else {
//                n[n.length - 2] = 11;
//                n[n.length - 1] = 212;
//            }
//        }
//        
//        m = n;
//                
//        for(int i = 0; i < m.length; i++) {
//            System.out.print(m[i]);
//            System.out.print(" ");
//            
//        }
//        System.out.println();
//ISTRINAMAS 4-TAS ELEMENTAS IS MASYVO
//        int[] m = {651, 818, 651, 651, 818, 651};
//        int[] n = new int[m.length - 1];
//
//        if (m.length >= 4) {
//            for (int i = 0; i < m.length; i++) {
//                if (i < 3) {
//                    n[i] = m[i];
//                } else if (i > 3) {
//                    n[i - 1] = m[i];
//                }
//            }
//            m = n;
//
//            for (int i = 0; i < m.length; i++) {
//                System.out.print(m[i]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        } else {
//            System.out.println("Masyvas per trumpas");
//        }
//        
//ITERPIAMAS 4-TAS ELEMENTAS I MASYVA
//        int[] m = {651, 818, 651, 651};
//        int[] n = new int[m.length + 1];
//
//        for (int i = 0; i < m.length; i++) {
//            System.out.print(m[i]);
//            System.out.print(" ");
//        }
//        System.out.println("");
//
//        if (m.length >= 4) {
//            for (int i = 0; i < n.length; i++) {
//                if (i < 3) {
//                    n[i] = m[i];
//                } else if (i == 3) {
//                    n[i] = 4444;
//                } else if (i > 3) {
//                    n[i] = m[i-1];
//                }
//            }
//            m = n;
//
//            for (int i = 0; i < m.length; i++) {
//                System.out.print(m[i]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        } else {
//            System.out.println("Masyvas per trumpas");
//        }
//DVIMATIS MASYVAS
        
        int eiluciuSk = 3;
        int elementuEilutejeSk = 4;
        
        double elementas = 0;

        double[][] original = new double[eiluciuSk][elementuEilutejeSk];
        double[] vienmatis = new double[eiluciuSk];

        //atspausdinamas orginalas
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                elementas = ((Math.random() * 10) + 1);
                original[i][j] = elementas;
                System.out.print(original[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 0; i < original.length; i++) {
            double suma = 0;
            double vidurkis;
            for (int j = 0; j < original[i].length; j++) {
                suma += original[i][j];
            }
            vidurkis = suma / original[i].length;
            vienmatis[i] = vidurkis;
        }
        //atspausdinamas naujas masyvas
        for (int i = 0; i < vienmatis.length; i++) {
            System.out.print(vienmatis[i]);
            System.out.print(" ");
        }
        System.out.println();

    }
}
