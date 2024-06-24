package Xndirner;

public class Task51 {
    public static void main(String[] args) {
        int x = 123;
        int miavor = x % 10;
        int tasnavor = x / 10 % 10;
        int haryuravor = x / 100 % 10;
        if (miavor == tasnavor + haryuravor) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
