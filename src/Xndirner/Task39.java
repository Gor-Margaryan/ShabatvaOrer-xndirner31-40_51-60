package Xndirner;

public class Task39 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        if (a < b && b < c && c < d){
            System.out.println(a + " " + b + " " + c + " " + d);
    } else if (a < b && b < d && d < c){
            System.out.println(a + " " + b + " " + d + " " + c);
        }
        else if (a < c && c < b && b < d){
            System.out.println(a + " " + c + " " + b + " " + d);
        }
        else if (a < c && c < d && d < b){
            System.out.println(a + " " + c + " " + d + " " + b);
        }
        else if (a < d && d < b && b < c){
            System.out.println(a + " " + d + " " + b + " " + c);
        }
        else if (a < d && d < c && c < b){
            System.out.println(a + " " + d + " " + c + " " + b);
        }
        else if (b < a && a < c && c < d){
            System.out.println(b + " " + a + " " + c + " " + d);
        }
        else if (b < a && a < d && d < c){
            System.out.println(b + " " + a + " " + d + " " + c);
        }
        else if (b < c && c < a && a < d){
            System.out.println(b + " " + c + " " + a + " " + d);
        }
        else if (b < c && c < d && d < a){
            System.out.println(b + " " + c + " " + d + " " + a);       //10
        }
        else if (b < d && d < a && a < c){
            System.out.println(b + " " + d + " " + a + " " + c);
        }
        else if (b < d && d < c && c < a){
            System.out.println(b + " " + d + " " + c + " " + a);
        }
        else if (c < a && a < b && b < d){
            System.out.println(c + " " + a + " " + b + " " + d);
        }
        else if (c < a && a < d && d < b){
            System.out.println(c + " " + a + " " + d + " " + b);
        }
        else if (c < b && b < a && a < d){
            System.out.println(c + " " + b + " " + a + " " + d);
        }
        else if (c < b && b < d && d < a){
            System.out.println(c + " " + b + " " + d + " " + a); //16
        }
        else if (c < d && d < a && a < b){
            System.out.println(c + " " + d + " " + a + " " + b);
        }
        else if (c < d && d < b && b < a){
            System.out.println(c + " " + d + " " + b + " " + a);
        }
        else if (d < a && a < b && b < c){
            System.out.println(d + " " + a + " " + b + " " + c);
        }
        else if (d < a && a < c && c < b){
            System.out.println(d + " " + a + " " + c + " " + b); //20
        }
        else if (d < b && b < a && a < c){
            System.out.println(d + " " + b + " " + a + " " + c);
        }
        else if (d < b && b < c && c < a){
            System.out.println(d + " " + b + " " + c + " " + a);
        }
        else if (d < c && c < a && a < b){
            System.out.println(d + " " + c + " " + a + " " + b);
        }
        else {
            System.out.println(d + " " + c + " " + b + " " + a);
        }


    }
}
