public class Main {
    public static void main(String[] args) {

        // ===== CONTROL FLOW STATEMENTS ====== //
        /* switch, for, while and do-while*/
        int switchValue = 3;
        // SWITCH
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        /* Create a new switch statement using char instead of int*/

        char charValue = 'Z'; // create a new char variable

        // create a new switch statement testing for
        switch (charValue) {
            case 'A':
                System.out.println("A was found.");
                break;
            case 'B':
                System.out.println("B was found.");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charValue + "was found.");
                break;
            default:
                System.out.println("Neither A, B, C, D nor E was found");
                break;
        }

    }
}