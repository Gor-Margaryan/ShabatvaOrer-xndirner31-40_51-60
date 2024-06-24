package Xndirner;

public class Task54 {
    public static void main(String[] args) {
        int x = 123;
        int miavor = x % 10;
        int tasnavor = x / 10 % 10;
        int haryuravor = x / 100 % 10;
        if (miavor > tasnavor && miavor > haryuravor){
            System.out.println(miavor);
        } else if (tasnavor > miavor && tasnavor > haryuravor) {
            System.out.println(tasnavor);
        }
        else {
            System.out.println(haryuravor);
        }
    }
}
