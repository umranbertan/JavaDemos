public class Main {

    public static void main(String[] args) {
        // Bir sayının mükemmel sayı olup olmadığını bulan program
        //bölenlerinin toplamı kendisine eşit olan sayıya mükemmel sayı denir.
        int number = 6;
        int toplam = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                toplam = toplam + i;
            }
        }
        if (toplam == number) {
            System.out.println("Mükemmel sayıdır.");
        } else {
            System.out.println("Mükemmel sayı değildir");
        }


    }
}
