public class Main {

    public static void main(String[] args) {
	//for
        for(int i=1; i<=10; i=i+2){
            System.out.println(i);
        }
        System.out.println("For dDöngüsü Bitti");

        //While
        int i=1;
        while(i<10){
            System.out.println(i);
            i++;
        } System.out.println("While döngüsü bitti");

        //do-while döngüsü
        int j=1;
        do{
            System.out.println(j);
            j=j+2;
        }while (j<10);
        System.out.println("do while döngüsü bitti");
    }
}
