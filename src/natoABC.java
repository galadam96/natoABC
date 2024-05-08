public class natoABC {
    public static void main(String[] args) {
        System.out.println(phoneticNato('A'));
        System.out.println(newPhoneticNato('B'));
    }

    public static String phoneticNato(char letter){
        String result;
        switch(letter){
            case 'A':
                result = "Alpha";
                break;
            case 'B':
                result = "Bravo";
                break;
            case 'C':
                result = "Charlie";
                break;
            case 'D':
                result = "Delta";
                break;
            case 'E':
                result = "Echo";
                break;
            default:
                result = "Not an ABC letter.";
        }
        return result;
    }

    public static String newPhoneticNato(char letter) {
        String result = switch (letter) {
            case 'A' -> "Alpha";
            case 'B' -> "Bravo";
            case 'C' -> "Charlie";
            case 'D' -> "Delta";
            case 'E' -> "Echo";
            default -> "Not an ABC letter.";
        };
        return result;
    }
}
