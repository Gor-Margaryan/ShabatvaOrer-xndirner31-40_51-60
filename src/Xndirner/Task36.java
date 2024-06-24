package Xndirner;

public class Task36 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        if ((a & b % 2) != 0) {
            System.out.println(true);
        } else if ((a & c % 2) != 0) {
            System.out.println(true);
        } else if ((a & d % 2) != 0) {
            System.out.println(true);
        } else if ((b & c % 2) != 0) {
            System.out.println(true);
        } else if ((b & d % 2) != 0) {
            System.out.println(true);
        } else if ((c & d % 2) != 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
