import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        test(exp);
    }
    static void test(String str){
        String[] st = str.split(" ");
        String a = st[0];
        String b = st [1];
        int intb = Integer.parseInt(b);
        for(int i = 0; i < intb; i++){
            System.out.println(a);
        }
    }
}
