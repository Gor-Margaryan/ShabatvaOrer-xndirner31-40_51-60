package Xndirner;

public class Task34 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        if ((a + b == c + d) && (a + c == b + d) && (a + d == b + c)) {


            System.out.println(true);
        } else {


            System.out.println(false);
        }
    }
}