package pkgswitch;

public class Switch {

    public static void main(String[] args) {
        int menesioNumeris = 17;

        System.out.println(menesioNumeris);

        switch (menesioNumeris) {
            case 12:
            case 1:
            case 2:
                System.out.println("ziema ziemuze");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("pavasaris, bet ne vasaris");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("vasara, vasara, jura atnese man");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("ruduo, ir vel gelsva");
                break;
            default:
                System.out.println("Out of office");
                break;
        }

        System.out.println("pabaiga");
    }

}
