package Xndirner;

public class Task37 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        if ((d - c == c - b && c-b  == b - a) || (c - d == d - b && d -b == b - a) ||
                (d - b == b - c && b - c == c - a) || (b - d == d - c && d - c == c - a)
                || (c - b == b - d && b - d == d - a) || (b - c == c - d && c - d == d - a) ||
                (d - c == c - a && c - a == a - b) || (c - d == d - a && d - a == a - b)
                || (d - a == a - c && a - c== c - b) || (a - d == d - c && d - c == c - b) ||
                (c - a == a - d && a - d == d - b) || (a - c == c - d && c - d == d - b) ||
                (d - b == b - a && b - a == a - c) || (b - d == d - a && d - a == a - c) ||
                (d - a == a - b && a - b == b - c) || (a - d == d - b && d - b == b - c) ||
                (b - a == a - d && a - d == d - c) || (a - b == b - d && b - d == d - c) ||
                (c - b == b - a && b - a == a - d) || (b - c == c - a && c - a == a - d) ||
                (c - a == a - b && a - b == b - d) || (a - c == c - b  && c - b == b - d) ||
                (b - a == a - c && a - c == c - d) || (a - b == b - c && b - c== c - d)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
