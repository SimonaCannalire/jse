package m02.s08;

public class SwitchString {
    public static void main(String[] args) {
        String value = "2";

        // ...

        switch (value) {
        case "1":
            System.out.println("value is one");
            break;
        case "2":
            System.out.println("value is two?");
            //FALL THROUGH
        case "3":
            System.out.println("value is three?");
            break;
        default:
            System.out.println("value is neither one nor two");
            break;
        }
    }
}
