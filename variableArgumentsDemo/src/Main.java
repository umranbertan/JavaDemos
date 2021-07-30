

public class Main {

    public static void main(String[] args) {

        Test test = new Test();
        test.varArgs(0);
        test.varArgs(0,1);
        test.varArgs(0,1,2);
        test.varArgs(0,1,2,3);
        test.varArgs(0,1,2,3,4);
    }
}

class Test {
    public void varArgs(int... number) {
        for (int i : number) {
            System.out.println("--------" +i);
        }
    }
}