package Xndirner;

public class Task52 {
    public static void main(String[] args) {
        int x = 123;
        int miavor = x % 10;
        int tasnavor = x / 10 % 10;
        int haryuravor = x / 100 % 10;

        boolean t = (miavor == tasnavor || tasnavor == haryuravor || haryuravor == miavor)?  true :  false ;
        System.out.println(t);


        }
}
