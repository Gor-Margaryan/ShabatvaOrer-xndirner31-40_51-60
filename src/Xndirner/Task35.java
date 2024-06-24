package Xndirner;

public class Task35 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        if (a == b + c + d || b == a + c + d || c == a + b + d || d == a + b + c) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
}
