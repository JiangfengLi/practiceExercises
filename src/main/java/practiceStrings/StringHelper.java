package practiceStrings;

/** StringHelper class contains several static methods for manipulating strings. */
public class StringHelper {

    /**
     * Returns the number of vowels (letters a, e, i, o, u)
     * in a given string.
     * @param message
     * @return the number of vowels
     */
    public static int countVowels(String message) {
        //TODO: Replace with your code.
        int count = 0;
        String buff = message.toLowerCase();
        for(int i = 0; i < buff.length(); i++){
            char ch = buff.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;
        }
        return count; // remember to change
    }

    /**
     * Returns the message encrypted using "Ceasar cipher"
     * with the given shift amount.
     *
     * If the shift is greater than 26 the method returns null.
     * If the message contains any characters that are not lower case letters the method returns null.
     *
     * Example: (abc, 2) -> cde
     * 'a' was shifted by two characters (became 'c'),
     * 'b' became 'd', 'c' became 'e'.
     * @param message input message to encrypt
     * @param shift by how much the letters should be shifted
     * @return encrypted string
     * @author Prof. Rollins
     */
    public static String encrypt(String message, int shift) {
        //TODO: Replace with your code.
        if(shift > 26) return null;
        StringBuilder res = new StringBuilder();
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if(ch - 'a' >= 26 || ch - 'a' < 0) return null;
            int interp = (ch - 'a' + shift) % 26;
            res.append(lowerCase.charAt(interp));
        }
        return res.toString(); // remember to change
    }

    /** Main method: runs methods of class StringHelper
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        String s = "hello";
        System.out.println("Original string: " + s);
        System.out.println("Number of vowels: " + StringHelper.countVowels(s));
        System.out.println("After encrypting: " + StringHelper.encrypt(s, 3));
    }
}
