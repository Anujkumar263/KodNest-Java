
public class NoparameterReturnArgument1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int res = add();
        System.out.println(res);
    }

    static int add() {
        int a = 10;
        int b = 20;
        int res = a + b;
        return res;
    }

}
