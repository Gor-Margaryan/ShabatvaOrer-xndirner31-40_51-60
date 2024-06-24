package Xndirner;

public class Task59 {
    public static void main(String[] args) {
        int x = 123;
        int a = x % 10;
        int b = x / 10 % 10;
        int c = x / 100 % 10;

        if (a < b && a < c && b < c) {
            System.out.println(a + "" + b + "" + c);
        } else if (b < c && b < a && c < a) {
            System.out.println(b + "" + c + "" + a);
        } else if (c < b && c < a && b < a) {
            System.out.println(c + "" + b + "" + a);
        } else if (a < c && a < b && c < b) {
            System.out.println(a + "" + c + "" + b);
        } else if (c < a && c < b && a < b) {
            System.out.println(c + "" + a + "" + b);
        } else {
            System.out.println(b + "" + a + "" + c);
        }




    }
}
