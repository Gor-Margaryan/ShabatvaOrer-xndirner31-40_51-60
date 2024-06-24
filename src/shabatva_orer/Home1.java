package shabatva_orer;

public class Home1 {
    public static void main(String[] args) {
        byte x = 10;
        switch (x) {
            case 1: case 12:// erkushabti
            case 3: // choreqshabti
            case 5: // urbat
                System.out.println("Dasi enq ");
                break;
            case 2: // ereqshabti
            case 4: // hingshabti
            case 6: // shabat
                System.out.println("Azat enq");
                break;
            case 7: // kiraki
                System.out.println("Hangstyan or");
                break;
            default: // none
                System.out.println("Shabatva aydpisi or goyutyun chuni");

        }
    }
}
