public class Main {

    public static void main(String[] args) {
	    //bir sesli harfin kalın sesli mi ince sesli mi olduğunu bulan progrem
        char harf ='İ' ;
        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harftir.");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("İnce sesli harf");
            break;
            default:
                System.out.println("Ne kalın harf, ne ince harftir.");

        }
        }

    }

