package Xndirner;
// ? ? ? ? ? ? ? ? ? ? ? ? ? ? kaskaceli
public class Task56 {
    public static void main(String[] args) {
        int x = 123;
        int miavor = x % 10;
        int tasnavor = x / 10 % 10;
        int haryuravor = x / 100 % 10;

        int y = x / (miavor + haryuravor + tasnavor)  ;
        int miav = y % 10;
        int tasn = y/10 % 10;

        if (miav > tasn){
            System.out.println(y);
        }
        else {
            System.out.println(x);
        }

    }
}
