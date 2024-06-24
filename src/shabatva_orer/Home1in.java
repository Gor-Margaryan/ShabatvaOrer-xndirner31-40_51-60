package shabatva_orer;

public class Home1in {
    public static void main(String[] args) {
        byte x = 12;
        switch (x){
            case 1: case 3: case 5:
                System.out.println("Dasi enq");
                break;
            case 2: case 4: case 6:
                System.out.println("Azat enq");
                break;
            case 7:
                System.out.println("Hangstyan or");
                break;
            default:
                System.out.println("Shabatva aydpisi or goyutyun chuni");
        }
    }
}
