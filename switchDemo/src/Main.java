import java.lang.invoke.SwitchPoint;

public class Main {
    // iflere göre daha az kullanılmaktadır.
    public static void main(String[] args) {
        char grade = 'a';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel, geçtiniz");
                break;
            case 'B':
                System.out.println("Hadi yine iyisin");
                break;
            case 'C':
                System.out.println("Tehlikeli sular");
                break;
            case 'D':
                System.out.println("Dikkatli olmalısın");
                break;
            case 'F':
                System.out.println("Kaldın maalesef ");
                break;
            default:
                // default bu tanımladıklarımız dışında bir değer girilirse bu şartı sağla demekoluyor
                System.out.println("Geçersiz not girdiniz.");

        }

    }
}
