package Xndirner;

public class Task58 {
    public static void main(String[] args) {
        int x = 123;
        int miavor = x % 10;
        int tasnavor = x / 10 % 10;
        int haryuravor = x / 100 % 10;

        char f = tasnavor + haryuravor < 5 ? 'a': 'b';
        System.out.println(f);

    }
}
