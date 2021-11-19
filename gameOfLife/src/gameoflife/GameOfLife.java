package gameoflife;

public class GameOfLife {

    public static void main(String[] args) {
//        // laukas 10x30
//        char[][] field = new char[10][30];
//        // random pradines iteracijos generavimas
//        for (int y = 0; y < field.length; y++) {
//            for (int x = 0; x < field[y].length; x++) {
//                field[y][x] = (Math.random() < 0.25) ? 'X': '.';
//            }
//        }
        char[][] field = {
            {'.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', 'X', 'X', 'X', '.', '.', '.'},
            {'.', '.', 'X', '.', '.', 'X', '.', '.'},
            {'.', '.', '.', 'X', 'X', 'X', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.'}
        };
        
        // iteracijos atspausdinimas
        for (int y = 0; y < field.length; y++) {
            for (int x = 0; x < field[y].length; x++) {
                System.out.print(field[y][x]);
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        
        for (int i = 1; i <= 50; i++) {
            // cia jusu darbas
        }
        
    }
    
}

/*
ziurint i pries tai buvusia iteracija reikia uzpildyti nauja:

kiekvienam langeliui senoje iteracijoje paskaiciuoti kaimynu kieki

jei senoje iteracijoje gyventojo nebuvo ir aplink yra 3 kaimynai,
tai naujoj iteracijoj toje vietoje gyventojas atsiras
priesingu atveju naujoj iteracijoj gyventojo nebus

jei senoje iteracijoje gyventojas buvo ir aplink yra 2 arba 3 kaimynai,
tai naujoj iteracijoj toje vietoje gyventojas liks gyventi
priesingu atveju mirs (t.y. naujoj iteracijoj gyventojo nebus)


1. atspausdinti 50 iteraciju
2. atspausdinti 50 iteraciju, bet jei bet kuri naujai sukurta iteracija
yra identiska pries tai buvusiai (stabili iteracija), tai nutraukti spausdinima
3. atspausdinti 50 iteraciju, bet tikrinti ar nera pasikartojimu visoje pries tai
buvusiu iteraciju istorijoj. jei randamas pasikartojimas - nutraukti spausdinima.

*/